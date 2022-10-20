package com.example.utsprogmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var btnAPI : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnAPI = findViewById(R.id.btnGetAPI)

        btnAPI.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@ServiceActivity,GetAPIActivity::class.java)
            startActivity(intent)})
    }
}