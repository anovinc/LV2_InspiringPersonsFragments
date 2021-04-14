package com.example.inspiringpersonsfragments

import android.app.Application

class Helper : Application(){
    companion object{
        lateinit var application: Helper
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }
}