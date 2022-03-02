package com.example.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonOneTimeRequest(view: View) {
        Toast.makeText(this, "Clicked : buttonOneTimeRequest", Toast.LENGTH_SHORT).show()

    }


    fun buttonPeriodicTimeRequest(view: View) {
        Toast.makeText(this, "Clicked : buttonPeriodicTimeRequest", Toast.LENGTH_SHORT).show()
    }

    fun buttonPeriodicTimeRequestCancel(view: View) {
        Toast.makeText(this, "Clicked : buttonPeriodicTimeRequestCancel", Toast.LENGTH_SHORT).show()
    }


    fun buttonchainingRequest(view: View) {
        Toast.makeText(this, "Clicked : buttonPeriodicTimeRequestCancel", Toast.LENGTH_SHORT).show()

    }

}