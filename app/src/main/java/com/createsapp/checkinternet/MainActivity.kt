package com.createsapp.checkinternet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val networkConnection = NetworkConnection(applicationContext)
        networkConnection.observe(this, Observer { isConnected ->
            if (isConnected) {
                Toast.makeText(applicationContext, "Internet Available", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "No Internet Available", Toast.LENGTH_LONG)
                    .show()
            }
        })
    }
}