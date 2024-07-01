package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeTextView: TextView
    private lateinit var inputEditText: EditText
    private lateinit var updateButton: Button
    private lateinit var updatedText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        welcomeTextView = findViewById(R.id.welcomeTextView)
        updatedText = findViewById(R.id.updatedTextView)
        inputEditText = findViewById(R.id.inputEditText)
        updateButton = findViewById(R.id.updateButton)

        updateButton.setOnClickListener{
            val newText = inputEditText.text.toString()
            updatedText.text = newText
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}