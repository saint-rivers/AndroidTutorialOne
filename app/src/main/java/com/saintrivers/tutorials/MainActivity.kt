package com.saintrivers.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.saintrivers.tutorials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
     * This is created to allow for Jetpack View Binding because Kotlin Synthetics is deprecated
     * [Source](https://developer.android.com/topic/libraries/view-binding/migration#kts)
     * [Source](https://www.section.io/engineering-education/view-binding-in-android/)
     */
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // added for jetpack view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // replace R.layout.activity_main with binding.root as our content view
        setContentView(binding.root)

        // add a click event listener to the button
        binding.btnApply.setOnClickListener {
            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val dateOfBirth = binding.etDateOfBirth.text.toString()
            val country = binding.etCountry.text.toString()
            Log.d("Main activity", "$firstName $lastName $dateOfBirth $country")
        }
    }

}