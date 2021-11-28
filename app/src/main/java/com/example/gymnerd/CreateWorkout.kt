package com.example.gymnerd

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.TextView.AUTO_SIZE_TEXT_TYPE_NONE
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat

class CreateWorkout : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_workout)

        findViewById<Button>(R.id.btn_add_exercise).setOnClickListener {
            startActivity(Intent(this,ChooseWorkoutActivity::class.java))
        }

        findViewById<Button>(R.id.btn_submit_workout).setOnClickListener {

        }

//        val rootLinearLayout = findViewById<LinearLayout>(R.id.create_workout_layout)
//
//        val newWorkoutName = TextView(this)
//        newWorkoutName.setId(ViewCompat.generateViewId())
//        newWorkoutName.gravity = Gravity.CENTER
//        newWorkoutName.gravity = Gravity.CENTER_VERTICAL
//        newWorkoutName.hint = "New Workout Name"
//        newWorkoutName.textSize = 100f
//        newWorkoutName.layoutParams = ViewGroup.LayoutParams(
//            mainActivity.screenWidthUnits(1000),
//            mainActivity.screenHeightUnits(250)
//        )
//        newWorkoutName.setTextSize(TypedValue.COMPLEX_UNIT_PX, 100f)
//
//
//        rootLinearLayout.addView(newWorkoutName)
    }

}