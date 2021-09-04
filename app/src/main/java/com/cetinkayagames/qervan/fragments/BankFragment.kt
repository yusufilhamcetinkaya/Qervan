package com.cetinkayagames.qervan.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cetinkayagames.qervan.*
import kotlinx.android.synthetic.main.fragment_bank.*
import kotlinx.android.synthetic.main.fragment_store.*


class BankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        tw_bank_debt_max.text="Max Bank Debt: ${MaxBankDebt}"

        tw_bank_debt.text="Your total Bank Debt: ${BankDebt}"

    btn_borrow.setOnClickListener {
        if(et_amountofbarrow.text.toString()==""){
               BarrowAmount=0
            Toast.makeText(activity, "Please enter the amount of money you want to barrow.", Toast.LENGTH_SHORT).show()


        }
        else {
            BarrowAmount=et_amountofbarrow.text.toString().toInt()
            et_amountofbarrow.setText("")

            if (BankDebt <= MaxBankDebt) {
                Money += BarrowAmount
                BankDebt += BarrowAmount
                Toast.makeText(activity, "Your Bank Debt is ${BankDebt} .", Toast.LENGTH_SHORT)
                    .show()

            } else {
                Toast.makeText(
                    activity,
                    "Your Bank Debt cannot over than ${MaxBankDebt}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }

        btn_repay.setOnClickListener {
           if(et_amountofrepay.text.toString()==""){
               RepayAmount=0
               Toast.makeText(activity, "Please enter the amount of money you want to repay.", Toast.LENGTH_SHORT).show()

           }

            else {
                RepayAmount=et_amountofrepay.text.toString().toInt()
               et_amountofrepay.setText("")

               if (Money >= BankDebt) {
                   Money -= RepayAmount
                   BankDebt -= RepayAmount
                   Toast.makeText(activity, "Your Bank Debt is ${BankDebt} .", Toast.LENGTH_SHORT)
                       .show()

               } else {
                   Toast.makeText(activity, "You do not have enough money.", Toast.LENGTH_SHORT)
                       .show()
               }
           }
        }


    }

}