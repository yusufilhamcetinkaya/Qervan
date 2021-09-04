package com.cetinkayagames.qervan

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val FN_sharedPreferences = this.getSharedPreferences("com.cetinkayagames.qervan", AppCompatActivity.MODE_PRIVATE)


        btn_intro.setOnClickListener {

            val UsersFactoryNameET = et_intro.text.toString()
            FN_sharedPreferences.edit().putString("UsersFactoryNameSP", UsersFactoryNameET).apply()

            if (UsersFactoryNameET.isNotEmpty()) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            else {
                Toast.makeText(this, "Please, Enter your factory name", Toast.LENGTH_LONG).show()
            }

        }

    }
}
