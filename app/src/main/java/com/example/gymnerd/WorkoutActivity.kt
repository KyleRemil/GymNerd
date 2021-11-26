package com.example.gymnerd

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Display
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.ViewCompat.getDisplay
import java.math.BigDecimal
import java.security.AccessController.getContext
import kotlin.math.roundToInt

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)

        val rootLinearLayout = findViewById<LinearLayout>(R.id.workout_layout)

//        The app doenst get the full screen margin.
//        My AVD is 1080x2280. The app gets 1080x1977
        val simpleTextView = TextView(this)
        simpleTextView.text = "Hey there is some text here:" +
                com.example.gymnerd.mainActivity.screenWidthUnits(1000) + ", " +
                com.example.gymnerd.mainActivity.screenHeightUnits(250)

        rootLinearLayout.addView(simpleTextView)


        val simpleButton = Button(this)
        simpleButton.text = "Create New Workout"
        simpleButton.layoutParams = ViewGroup.LayoutParams(
            com.example.gymnerd.mainActivity.screenWidthUnits(1000),
            com.example.gymnerd.mainActivity.screenHeightUnits(250)
        )

        simpleButton.setOnClickListener {
            startActivity(Intent(this, CreateWorkout::class.java))
        }
//        simpleButton.width = convertPix2Dp(300)
//        simpleButton.height = convertPix2Dp(200)

        rootLinearLayout.addView(simpleButton)

        findViewById<Button>(R.id.btn_workout_to_main).setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        val exampleTextView = TextView(this)
        exampleTextView.setId(ViewCompat.generateViewId())
        exampleTextView.text = "The text view is visible!"

        val exampleCardLinearLayoutParams = LinearLayout.LayoutParams(400, 200)
        exampleTextView.setLayoutParams(exampleCardLinearLayoutParams)


        val textView1: TextView = TextView(this)
        textView1.text = "Text View is Visible!"


    }


}
