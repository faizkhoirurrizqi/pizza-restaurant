package com.example.pizzarestaurant

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Firstpage : AppCompatActivity() {
    val TEXT_REQUEST = 2
    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    private val LOG_TAG = Firstpage::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)
        val intent = intent
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.person)
        textView.text = "Hello, " + message

        val mMessageEditText = findViewById<TextView>(R.id.person)
        val btnKirim = findViewById<Button>(R.id.button_second)
        btnKirim?.setOnClickListener {
            Log.d(LOG_TAG, "Button clicked!")
            val intent = Intent(this, menupage::class.java)
            val message = textView.text.toString()
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivityForResult(intent, TEXT_REQUEST)
        }
    }
}