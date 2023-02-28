package com.example.interactivedicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()

            //val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
            rollDice()
        }
    }

    private fun rollDice() {
        // create a dice with 6 sides
        val dice = Dice(6)

        //roll the dice by calling the roll() method, and save the result in diceRoll variable
        val diceRoll = dice.roll()

        //find the TextView by calling findViewById()
        val resultTextView: TextView = findViewById(R.id.textView)

        //convert diceRoll to a string and use that to update the text of the resultTextView
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
