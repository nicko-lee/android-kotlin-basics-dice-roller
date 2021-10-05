package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
* This activity allows the user to roll a dice and view the result
* on the screen.
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice1 = Dice(10)
        val dice2 = Dice(10)

        // Update the screen with the dice roll
        val dice1Roll = dice1.roll()
        val dice2Roll = dice2.roll()
        val resultTextView1: TextView = findViewById(R.id.textView) // find the textView and get a handle of it (get a ref/pointer to it)
        val resultTextView2: TextView = findViewById(R.id.textView2)

        resultTextView1.text = dice1Roll.toString()
        resultTextView2.text = dice2Roll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
