package com.example.graphview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var graphView : GraphView
    lateinit var btnSetRandomNumbers : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        graphView = findViewById(R.id.graphGraphView)
        btnSetRandomNumbers = findViewById(R.id.btnSetRandomNumbers)

        graphView.values = arrayOf(80, 60, 75, 12, 67)

        btnSetRandomNumbers.setOnClickListener {
            var random = Random()
            var RandomListSize = Math.abs(random.nextInt()) % 11

            var newArray = Array<Int>(RandomListSize, { i -> Math.abs(random.nextInt()) % 101 });
            graphView.values = newArray

            graphView.invalidate()
        }
    }
}