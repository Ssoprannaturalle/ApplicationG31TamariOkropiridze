package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    fun onGoBack(view: View?) {
        finish()
    }

    fun onNextPage3(view: View?) {
        val MainActivity2Intent = Intent(this, MainActivity2::class.java)
        startActivity(MainActivity2Intent)
    }
    private lateinit var REGIST: Button
    private lateinit var BACK: Button
    private lateinit var LogInEmail: EditText
    private lateinit var LogInPass: EditText
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonOne = findViewById<Button>(R.id.REGIST)
        buttonOne.setOnClickListener {
            println("Button Clicked")
            val MainActivity2Intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(MainActivity2Intent)
        }
        REGIST = findViewById(R.id.REGIST)
        BACK=findViewById(R.id.BACK)
        LogInEmail = findViewById(R.id.LogInEmail)
        LogInPass=findViewById(R.id.LogInPass)
        auth= FirebaseAuth.getInstance()
    }
}