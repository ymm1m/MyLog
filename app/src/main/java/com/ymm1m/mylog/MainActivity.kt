package com.ymm1m.mylog

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(this::onButtonClick)
    }

    /*
     * Called when the button is clicked.
     * Roomに、日時と位置情報を保存する
     */
    fun onButtonClick(view: View) {
//        val currentTimestamp = System.currentTimeMillis()
//        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
//            if (location != null) {
//                val currentTimestamp = System.currentTimeMillis()
//                val locationLog = LocationLog(
//                    timestamp = currentTimestamp,
//                    latitude = location.latitude,
//                    longitude = location.longitude
//                )
//
//                lifecycleScope.launch(Dispatchers.IO) {
//                    locationLogDao.insert(locationLog)
//                }
//            }
//        }

        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }
}