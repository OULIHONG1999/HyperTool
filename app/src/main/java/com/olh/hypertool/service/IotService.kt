package com.olh.hypertool.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class IotService : Service() {

    private val TAG = "sensorupdata"
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onCreate() {
        super.onCreate()
        Log.v(TAG,"on creat")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        return super.onStartCommand(intent, flags, startId)
    }
}