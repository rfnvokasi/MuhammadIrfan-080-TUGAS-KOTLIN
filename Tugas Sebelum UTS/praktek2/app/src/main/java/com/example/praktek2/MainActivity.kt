package com.example.praktek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context=this

        Bintent1.setOnClickListener {
            val intent = Intent(context,Main2Activity::class.java)

            val name:String = inputText1.text.toString()
            intent.putExtra("name", name)
            startActivity(intent)
            finish()
        }

        Bintent2.setOnClickListener {
            val intent2 = Intent(context,Main3Activity::class.java)
            val name:String = inputText1.text.toString()
            intent2.putExtra("name", name)
            startActivity(intent2)
            finish()
        }
    }
}
