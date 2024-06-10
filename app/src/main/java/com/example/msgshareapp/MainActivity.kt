package com.example.msgshareapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.key


class MainActivity: AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        btnShowToast?.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_LONG).show()
        }
        val btnSendDataToNextActivity = findViewById<Button>(R.id.button)
        btnSendDataToNextActivity.setOnClickListener {
            val editTextText = findViewById<EditText>(R.id.editTextText)
            val message = editTextText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}