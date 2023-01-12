package com.example.mydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
private var RandomNumber=0 //initialize

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Declare your button variable and initialize using the findViewById() method
        SetonClickListener on our button variables to listen to click events and call the appropriate functions
         */
        val buttonToast : Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener { showMyToast()}
        val buttonRoll : Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener { rollDice()}
        val buttonCount : Button = findViewById(R.id.button_count)
        buttonCount.setOnClickListener { showMycount()}
    }


    //Create a function for sharing a toast when a user clicks the toast button
    private fun showMyToast(){

        //Create a toast message
        Toast.makeText(this,"Ohh My you clicked me",Toast.LENGTH_SHORT).show()

    }

    private fun showMycount(){

        val textViewResult : TextView = findViewById(R.id.text_view_result)

        textViewResult.text =(RandomNumber+1).toString()

    }



    //Create a function for generating a random int number and displaying it on textview result when
    //a user clicks the button roll
    private fun rollDice(){
        //Declare and initialize random integer variable for storing the random number generated
        val randomInt =(1..12).random()//generate a random no between 1 and 12 using an inbuilt function random()
        RandomNumber=randomInt
        //to display this number in textview layout
        //Declare and initialize the text view where we will display our randomly generated number
        val textViewResult : TextView = findViewById(R.id.text_view_result)

        // pass the randomly generated number into the text view result
        textViewResult.text =randomInt.toString()
    }

}