package com.example.grameenlight

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.WindowManager // <--- ADD THIS IMPORT
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // --- ADD THE FULL SCREEN FLAGS HERE (BEFORE setContentView) ---
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContentView(R.layout.activity_main)

        // 1. Initialize the regular menu buttons
        val btnReport = findViewById<Button>(R.id.btnReport)
        val btnView = findViewById<Button>(R.id.btnView)
        val btnTrack = findViewById<Button>(R.id.btnTrack)
        val btnDashboard = findViewById<Button>(R.id.btnDashboard)

        // 2. Initialize the Admin Icon
        val ivAdminIcon = findViewById<ImageView>(R.id.ivAdminIcon)

        // --- BUTTON NAVIGATION ---
        btnReport.setOnClickListener {
            val intent = Intent(this, ReportIssueActivity::class.java)
            startActivity(intent)
        }

        btnView.setOnClickListener {
            val intent = Intent(this, StreetlightActivity::class.java)
            startActivity(intent)
        }

        btnTrack.setOnClickListener {
            val intent = Intent(this, TrackStatusActivity::class.java)
            startActivity(intent)
        }

        btnDashboard.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        // --- ADMIN LOGIN LOGIC ---
        ivAdminIcon.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Admin Authentication")

            val input = EditText(this)
            input.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            input.hint = "Enter Admin Password"
            builder.setView(input)

            builder.setPositiveButton("Login") { _, _ ->
                val password = input.text.toString()

                if (password == "admin123") {
                    val intent = Intent(this, AdminActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong Password! Access Denied.", Toast.LENGTH_SHORT).show()
                }
            }

            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.cancel()
            }

            builder.show()
        }
    }
}