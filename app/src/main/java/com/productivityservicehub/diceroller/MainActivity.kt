package com.productivityservicehub.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn :Button=findViewById(R.id.dice_btn)

        btn.setText("Click me!!")
        btn.setOnClickListener {
            diceRolled()
        }

    }

    private fun diceRolled() {
        val value=(0..6).random()
        val image:ImageView=findViewById(R.id.img_dice)
        val res=when (value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(res)

    }
}