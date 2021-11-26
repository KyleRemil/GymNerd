package com.example.gymnerd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.math.roundToInt

var screenHeight: Double = 0.0
var screenWidth: Double = 0.0

var mainActivity = MainActivity()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayMetrics = this.resources.displayMetrics

        screenHeight = displayMetrics.heightPixels.toDouble()
        screenWidth = displayMetrics.widthPixels.toDouble()

        findViewById<Button>(R.id.btn_workouts).setOnClickListener {
            startActivity(Intent(this, WorkoutActivity::class.java))
        }
    }
    public fun screenWidthUnits(units: Int): Int {
        return (units * (screenWidth / 1000.0)).roundToInt()
    }
    public fun screenHeightUnits(units: Int): Int {
        return (units * (screenHeight / 1000.0)).roundToInt()
    }
}