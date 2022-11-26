package com.example.git


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.git.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttnonBN.setOnClickListener {
            Toast.makeText(applicationContext, "так уж и быть... Зажми кнопку", Toast.LENGTH_LONG).show()
        }

        binding.buttnonBN.setOnLongClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            true
        }


        }

}