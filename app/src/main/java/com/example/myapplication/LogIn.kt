package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
data class Horoscopes(
     val status: String = ""
     val title: String="" )

class HoroscopesViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)


class LogIn : AppCompatActivity() {
    fun onNextPage(view: View?) {
        val MainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(MainActivityIntent)
    }

    fun onNextPage3(view: View?) {
        val MainActivity2Intent = Intent(this, MainActivity2::class.java)
        startActivity(MainActivity2Intent)
    }

    private lateinit var LogIn: Button
    private lateinit var Regist: Button
    private lateinit var LogInEmail:EditText
    private lateinit var LogInPass: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        LogIn = findViewById(R.id.Login)
        Regist=findViewById(R.id.Regist)
        LogInEmail = findViewById(R.id.LogInEmail)
        LogInPass=findViewById(R.id.LogInPass)
        auth= FirebaseAuth.getInstance()
        val horoscopesCollectionQuery = fireStore.collection("Horoscopes")


        val buttonOne = findViewById<Button>(R.id.Login)
        buttonOne.setOnClickListener {
            println("Button Clicked")
            val MainActivity2Intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(MainActivity2Intent)
        }
        val buttonTwo = findViewById<Button>(R.id.Regist)
        buttonTwo.setOnClickListener {
            println("Button Clicked")
            val MainActivityIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(MainActivityIntent)
        }
    }
}