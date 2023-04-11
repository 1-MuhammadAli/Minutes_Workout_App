package com.example.minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minutesworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private  var binding : ActivityExerciseBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarExercise)

        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        binding?.toolbarExercise?.setNavigationOnClickListener{
            onBackPressed()
        }

    }
}