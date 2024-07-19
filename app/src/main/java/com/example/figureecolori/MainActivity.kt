package com.example.figureecolori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var shapeNameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shapeNameTextView = findViewById(R.id.shapeNameTextView)

        val buttonCircle: Button = findViewById(R.id.buttonCircle)
        val buttonSquare: Button = findViewById(R.id.buttonSquare)
        val buttonTriangle: Button = findViewById(R.id.buttonTriangle)

        buttonCircle.setOnClickListener {
            shapeNameTextView.text = getString(R.string.circle)
        }

        buttonSquare.setOnClickListener {
            shapeNameTextView.text = getString(R.string.square)
        }

        buttonTriangle.setOnClickListener {
            shapeNameTextView.text = getString(R.string.triangle)
        }
    }
}