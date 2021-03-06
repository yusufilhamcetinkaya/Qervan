package com.cetinkayagames.qervan.fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cetinkayagames.qervan.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fNsharedPreferencesHome = requireActivity().getSharedPreferences("com.cetinkayagames.qervan", Context.MODE_PRIVATE)

        val usersFactoryName= fNsharedPreferencesHome.getString("UsersFactoryNameSP","")

        FactoryName.text="Your Factory Name: ${usersFactoryName}"

        tw_money.text="Money: ${Money}"

        tw_shirt.text="Shirt: ${Shirt}/${WareCapacity}"

        tw_fabric.text="Fabric: ${Fabric}"

        tw_productionRate.text="Production Rate: ${ProductionRate}"

    }

}