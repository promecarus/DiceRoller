package com.promecarus.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(
                when (Dice(6).roll()) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
            )
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
