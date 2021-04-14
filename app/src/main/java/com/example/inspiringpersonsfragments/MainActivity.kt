package com.example.inspiringpersonsfragments

import android.app.TaskStackBuilder.create
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.URI.create

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.fl_fragmentContainer,InspiringPersonsListFragment.create(),InspiringPersonsListFragment.TAG)
                .commit()
        }
    }
}
