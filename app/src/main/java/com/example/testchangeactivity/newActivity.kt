package com.example.testchangeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ArrayAdapter.createFromResource
import kotlinx.android.synthetic.main.activity_new.*

class newActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        Log.i("LOG", "you are now in the new Activity")

        tV_Text.text = "Das hab ich im Code geschrieben"

        val spinnerArray = resources.getIntArray(R.array.spiner)
        val adapter = ArrayAdapter.createFromResource(this, R.array.spiner, android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

    }
}
