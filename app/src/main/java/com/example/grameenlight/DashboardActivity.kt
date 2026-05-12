package com.example.grameenlight

import android.content.Context
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val tvTotal = findViewById<TextView>(R.id.tvTotalComplaints)
        val lvDetailed = findViewById<ListView>(R.id.lvDetailedReports)

        val sharedPref = getSharedPreferences("GrameenData", Context.MODE_PRIVATE)
        val allEntries = sharedPref.all

        // 1. Update the Summary Count
        tvTotal.text = "Total Active Reports: ${allEntries.size}"

        // 2. Create a list of strings containing all details
        val reportDetailsList = mutableListOf<String>()

        for ((complaintId, details) in allEntries) {
            // 'details' already contains "Status: In Progress | Pole ID: POLE00X"
            // We combine them into one readable block
            val fullInfo = "Complaint: $complaintId\n$details"
            reportDetailsList.add(fullInfo)
        }

        // 3. Set the adapter to show the list on screen
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, reportDetailsList)
        lvDetailed.adapter = adapter
    }
}