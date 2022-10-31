package com.firstapp.androidstudiosdiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText : EditText
    lateinit var greetingView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        greetingView = findViewById(R.id.greetingView)

        greetingView.text = "Hej Marlon"

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = getNameFromEditText()
            setGreeting(name)


        }
    }
    fun getNameFromEditText() : Editable? {
        val name = nameEditText.text
        return name
    }

    fun setGreeting(name: Editable?) {
        greetingView.text = "Hej $name, välkommen!"
    }
}

//1. Läsa in vad användaren har skrivit x
//2. Knappen har tryckts x
//3. Visa upp hälsning i textrutan