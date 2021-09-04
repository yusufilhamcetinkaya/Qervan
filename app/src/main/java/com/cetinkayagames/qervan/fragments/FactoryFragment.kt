package com.cetinkayagames.qervan.fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cetinkayagames.qervan.IntroActivity
import com.cetinkayagames.qervan.Money
import com.cetinkayagames.qervan.ProductionRate
import com.cetinkayagames.qervan.R
import kotlinx.android.synthetic.main.fragment_factory.*
import org.w3c.dom.Text

class FactoryFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_factory, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    btn_apprentice.setOnClickListener{

        if(Money>=5000){
            Money= Money-5000
            ProductionRate= ProductionRate+10
            Toast.makeText(activity, "Your production rate is ${ProductionRate} now.", Toast.LENGTH_SHORT).show()
        }
        else{

            Toast.makeText(activity, "You must have 5000$", Toast.LENGTH_SHORT).show()

        }
    }

        btn_worker.setOnClickListener{

            if(Money>=20000){
                Money= Money-20000
                ProductionRate= ProductionRate+50
                Toast.makeText(activity, "Your production rate is ${ProductionRate} now.", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(activity, "You must have 20000$", Toast.LENGTH_SHORT).show()

            }
        }
        btn_manager.setOnClickListener{

            if(Money>=100000){
                Money= Money-100000
                ProductionRate= ProductionRate+300
                Toast.makeText(activity, "Your production rate is ${ProductionRate} now.", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(activity, "You must have 100000$", Toast.LENGTH_SHORT).show()

            }
        }
        btn_ceo.setOnClickListener{

            if(Money>=250000){
                Money= Money-250000
                ProductionRate= ProductionRate+1000
                Toast.makeText(activity, "Your production rate is ${ProductionRate} now.", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(activity, "You must have 250000$", Toast.LENGTH_SHORT).show()

            }
        }

    }


}