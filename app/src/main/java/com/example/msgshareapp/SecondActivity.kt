package com.example.msgshareapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.msgshareapp.R

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle:Bundle?=intent.extras
        val msg = bundle!!.getString("user_message")
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        val txvUserMessage = findViewById<TextView>(R.id.txvUserMessage)
        txvUserMessage.text=msg
    }

}
