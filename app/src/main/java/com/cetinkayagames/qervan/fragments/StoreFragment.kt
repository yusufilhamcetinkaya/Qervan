package com.cetinkayagames.qervan.fragments

import android.os.Bundle
import android.text.InputType
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cetinkayagames.qervan.*
import kotlinx.android.synthetic.main.fragment_bank.*
import kotlinx.android.synthetic.main.fragment_store.*

class StoreFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        FabricPrice = 10

        tw_fabric_price.text = "Fabric Price: ${FabricPrice}"
        tw_shirtPrice.text = "Shirt Price: ${ShirtPrice}"


        btn_buy.setOnClickListener {
                if (et_amountOfFabric.text.toString() == ""){
                    amountofFabric = 0
                    Toast.makeText(activity, "Please enter the amount of fabric you want to buy.", Toast.LENGTH_SHORT).show()
                }else{
                    amountofFabric = et_amountOfFabric.text.toString().toInt()
                    et_amountOfFabric.setText("")

                    if (Money >= amountofFabric * FabricPrice) {
                        Money -= (amountofFabric * FabricPrice)
                        Fabric += amountofFabric
                        Toast.makeText(activity, "Your fabric is ${Fabric} .", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else {
                        Toast.makeText(activity, "You have not enough money", Toast.LENGTH_SHORT).show()
                    }
                }
        }

            btn_sell.setOnClickListener {

                if (et_amountofShirt.text.toString() == "") {
                    amountofShirt=0
                    Toast.makeText(activity, "Please enter the amount of shirts you want to sell", Toast.LENGTH_SHORT).show()

                }
                else    {
                    amountofShirt = et_amountofShirt.text.toString().toInt()
                    et_amountofShirt.setText("")

                    if (amountofShirt < Shirt) {
                        Money += (amountofShirt * ShirtPrice)
                        Shirt -= amountofShirt
                        Toast.makeText(activity, "You have ${Shirt} Shirt now.", Toast.LENGTH_SHORT)
                            .show()

                    } else {
                        Toast.makeText(activity, "You have not enough shirt", Toast.LENGTH_SHORT)
                            .show()
                    }

                }
            }
    }
}