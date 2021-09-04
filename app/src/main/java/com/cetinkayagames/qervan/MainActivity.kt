package com.cetinkayagames.qervan

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.cetinkayagames.qervan.fragments.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlin.jvm.functions.FunctionN
    var Money:Int=50000
    var Shirt:Int=0
    var BankDebt:Int=0
    var MaxBankDebt:Int=100000
    var BarrowAmount:Int=0
    var RepayAmount:Int=0
    var Fabric:Int=0
    var ProductionRate:Int=0
    var WareCapacity:Int=1000
    var amountofFabric:Int=0
    var amountofShirt:Int=0
    var FabricPrice:Int=0
    var ShirtPrice:Int=0

class MainActivity : AppCompatActivity() {
    private val BankFragment=BankFragment()
    private val HomeFragment = HomeFragment()
    private val FactoryFragment= FactoryFragment()
    private val StoreFragment = StoreFragment()
    private val StoreHouseFragment= StoreHouseFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(HomeFragment)

        val FN_sharedPreferences = this.getSharedPreferences("com.cetinkayagames.qervan", AppCompatActivity.MODE_PRIVATE)


        bottom_nav_bar.setOnNavigationItemSelectedListener{
        when(it.itemId){
            R.id.nav_home -> replaceFragment(HomeFragment)
            R.id.nav_storehouse -> replaceFragment(StoreHouseFragment)
            R.id.nav_store -> replaceFragment(StoreFragment)
            R.id.nav_factory -> replaceFragment(FactoryFragment)
            R.id.nav_bank -> replaceFragment(BankFragment)
        }
            true
    }

    }

    private fun replaceFragment (fragment: Fragment){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()

    }
}