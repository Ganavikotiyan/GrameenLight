package com.example.grameenlight

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AdminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val etFixPoleId = findViewById<EditText>(R.id.etFixPoleId)
        val btnFixSpecific = findViewById<Button>(R.id.btnFixSpecific)
        val btnResetAll = findViewById<Button>(R.id.btnResetAll)

        val sharedPref = getSharedPreferences("GrameenData", Context.MODE_PRIVATE)

        // --- BUTTON: FIX ONLY ONE POLE ---
        btnFixSpecific.setOnClickListener {
            val poleToFix = etFixPoleId.text.toString().uppercase().trim()
            val allEntries = sharedPref.all
            var found = false

            val editor = sharedPref.edit()

            // Look through all complaints to find the one matching the Pole ID
            for ((complaintId, details) in allEntries) {
                if (details.toString().contains(poleToFix)) {
                    editor.remove(complaintId) // Delete only this specific complaint
                    found = true
                }
            }

            if (found) {
                editor.apply()
                Toast.makeText(this, "$poleToFix is now WORKING", Toast.LENGTH_SHORT).show()
                etFixPoleId.text.clear()
            } else {
                Toast.makeText(this, "No active reports for $poleToFix", Toast.LENGTH_SHORT).show()
            }
        }

        // --- BUTTON: RESET EVERYTHING (KEEP AS BACKUP) ---
        btnResetAll.setOnClickListener {
            sharedPref.edit().clear().apply()
            Toast.makeText(this, "All systems reset to default", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}