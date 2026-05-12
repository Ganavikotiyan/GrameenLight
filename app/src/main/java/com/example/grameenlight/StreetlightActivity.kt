package com.example.grameenlight

import android.content.Context
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class StreetlightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_streetlight)

        val listView = findViewById<ListView>(R.id.listStreetlights)

        // The master list of all poles in the system
        val allPoles = arrayOf(
            "POLE001", "POLE002", "POLE003", "POLE004", "POLE005",
            "POLE006", "POLE007", "POLE008", "POLE009", "POLE010"
        )

        val sharedPref = getSharedPreferences("GrameenData", Context.MODE_PRIVATE)
        val allReports = sharedPref.all

        // Check each pole in our master list
        val dynamicLights = allPoles.map { poleId ->
            val isFound = allReports.values.any {
                it.toString().contains(poleId)
            }

            if (isFound) {
                "ID: $poleId - Status: 🔴 FAULTY (In Progress)"
            } else {
                "ID: $poleId - Status: 🟢 WORKING"
            }
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dynamicLights)
        listView.adapter = adapter
    }
}
