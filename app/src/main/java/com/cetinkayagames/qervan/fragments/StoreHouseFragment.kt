package com.cetinkayagames.qervan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cetinkayagames.qervan.Money
import com.cetinkayagames.qervan.ProductionRate
import com.cetinkayagames.qervan.R
import com.cetinkayagames.qervan.WareCapacity
import kotlinx.android.synthetic.main.fragment_factory.*
import kotlinx.android.synthetic.main.fragment_store_house.*


class StoreHouseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store_house, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_sh1.setOnClickListener {

            if (Money >= 25000) {
                Money = Money - 25000
                WareCapacity= WareCapacity+500
                Toast.makeText(
                    activity,
                    "Your total ware capacity is ${WareCapacity}.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(activity, "You must have 25000$", Toast.LENGTH_SHORT).show()

            }
        }

        btn_sh2.setOnClickListener {

            if (Money >= 100000) {
                Money = Money - 100000
                WareCapacity= WareCapacity+2500
                Toast.makeText(
                    activity,
                    "Your total ware capacity is ${WareCapacity}.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(activity, "You must have 100000$", Toast.LENGTH_SHORT).show()

            }
        }
        btn_sh3.setOnClickListener {

            if (Money >= 250000) {
                Money = Money - 250000
                WareCapacity= WareCapacity+7500
                Toast.makeText(
                    activity,
                    "Your total ware capacity is ${WareCapacity}.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(activity, "You must have 250000$", Toast.LENGTH_SHORT).show()

            }
        }
        btn_sh4.setOnClickListener {

            if (Money >= 500000) {
                Money = Money - 500000
                WareCapacity= WareCapacity+15000
                Toast.makeText(
                    activity,
                    "Your total ware capacity is ${WareCapacity}.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(activity, "You must have 500000$", Toast.LENGTH_SHORT).show()

            }
        }
    }

}