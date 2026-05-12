package com.example.grameenlight

import android.os.Bundle
import android.content.Context
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TrackStatusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_track_status)

        val etComplaintNo = findViewById<EditText>(R.id.etComplaintNo)
        val btnCheck = findViewById<Button>(R.id.btnCheck)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCheck.setOnClickListener {
            val searchId = etComplaintNo.text.toString().trim()

            if (searchId.isNotEmpty()) {
                val sharedPref = getSharedPreferences("GrameenData", Context.MODE_PRIVATE)

                // Search for the specific key the user typed in
                val result = sharedPref.getString(searchId, "Error: Complaint ID not found.")

                tvResult.text = "Result for $searchId:\n\n$result"
            } else {
                tvResult.text = "Please enter a Complaint Number."
            }
        }
    }
}