package com.olh.hypertool

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.olh.hypertool.service.IotService

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

        val btn_sync : Button = findViewById<Button>(R.id.btn_sync)
        val btn_remote : Button = findViewById<Button>(R.id.btn_remote)
        val btn_iot : Button = findViewById<Button>(R.id.btn_iot)
        val btn_about : Button = findViewById<Button>(R.id.btn_about)

        btn_remote.setOnClickListener {
            startActivity(Intent(this, RemoteActivity::class.java))
        }

        btn_iot.setOnClickListener {
            startIotService()
        }
    }

//    创建一个启动服务的函数
    fun startIotService() {
        startService(Intent(this, IotService::class.java))
        startActivity(Intent(this, IotActivity::class.java))
    }

}