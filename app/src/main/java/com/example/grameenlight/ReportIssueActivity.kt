package com.example.grameenlight

import android.os.Bundle
import android.content.Context
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.text.Regex

class ReportIssueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_issue)

        // Ensure these IDs match your XML exactly
        val etPoleId = findViewById<EditText>(R.id.etPoleId)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val input = etPoleId.text.toString().trim().uppercase()

            // This Regex checks for "POLE" followed by numbers
            val polePattern = Regex("POLE(\\d+)")
            val matchResult = polePattern.matchEntire(input)

            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter Pole ID", Toast.LENGTH_SHORT).show()
            } else if (matchResult == null) {
                Toast.makeText(this, "Invalid Format! Use POLE001", Toast.LENGTH_SHORT).show()
            } else {
                // Extracts the number to check the range 1-10
                val poleNumber = matchResult.groupValues[1].toInt()

                if (poleNumber in 1..10) {
                    val complaintId = "C" + System.currentTimeMillis().toString().takeLast(4)
                    val sharedPref = getSharedPreferences("GrameenData", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()

                    val details = "Status: In Progress | Pole ID: $input"
                    editor.putString(complaintId, details)
                    editor.apply()

                    Toast.makeText(this, "Registered: $complaintId", Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    Toast.makeText(this, "Error: Valid range is POLE001 to POLE010", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}