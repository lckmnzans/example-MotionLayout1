package com.simple.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var navigationBarView: NavigationBarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationBarView = findViewById(R.id.bottomNavigationView)
        navigationBarView.setOnItemSelectedListener(this)

        val playButton = findViewById<ImageView>(R.id.play_imageView)
        playButton.setOnClickListener {
            Toast.makeText(this, "Play Button is pressed", Toast.LENGTH_SHORT).show()
        }
        val closeButton = findViewById<ImageView>(R.id.close_imageView)
        closeButton.setOnClickListener {
            Toast.makeText(this, "Stop Button is pressed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toHome -> {
                val msg = "Home menu is selected"
                showToast(msg)
                true
            }
            R.id.toDashboard -> {
                val msg = "Dashboard menu is selected"
                showToast(msg)
                true
            }
            R.id.toNotifications -> {
                val msg = "Notifications menu is selected"
                showToast(msg)
                true
            }
            else -> return false
        }
    }
}