package com.example.dicerollingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.dicerollingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = binding.rollButton
        var textview : TextView =findViewById(R.id.text123)
        val imageView = binding.diceImage

        button.setOnClickListener {
            val n = (1..6).random()
            var imageDice: Int
            textview.text =n.toString()
            when (n) {
                1 -> {
                    imageDice = R.drawable.dice1
                }
                2 -> {
                    imageDice = R.drawable.dice2
                }
                3 -> {
                    imageDice = R.drawable.dice3
                }
                4 -> {
                    imageDice = R.drawable.dice4
                }
                5 -> {
                    imageDice = R.drawable.dice5
                }
                else -> {
                    imageDice = R.drawable.dice6
                }
            }
            imageView.setImageResource(imageDice)
            Toast.makeText(this, "Dice is Rolled", Toast.LENGTH_SHORT).show()
        }
    }
}
