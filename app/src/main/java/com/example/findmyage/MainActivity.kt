package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_calc.setOnClickListener(this)

    }

    override fun onClick(view: View) {
       val id = view.id
       if(id == R.id.button_calc) {
           calcAge()
       }
    }

    private fun calcAge() {
        val getEditText =  Integer.parseInt(edit_age.text.toString())
        val year =   Calendar.getInstance().get(Calendar.YEAR)
        text_info.text  = (year - getEditText).toString()
    }
}


