package com.example.inspiringpersonsfragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inspiringpersonsfragments.R
import com.example.inspiringpersonsfragments.fragments.InspiringPersonsListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(
                    R.id.fl_fragmentContainer,
                    InspiringPersonsListFragment.create(),
                    InspiringPersonsListFragment.TAG)
                .commit()
        }
    }
}
