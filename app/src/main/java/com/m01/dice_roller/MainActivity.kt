package com.m01.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.graphics.drawable.toDrawable
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImg:ImageView
    lateinit var rollDice:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImg = findViewById(R.id.dice)
        rollDice = findViewById(R.id.roller)

        rollDice.setOnClickListener{
            rollTheDice()
        }
    }

    private fun rollTheDice(){
        val random = Random.nextInt(6)+1
        val diceResource = when(random){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImg.setImageResource(diceResource)
    }
}