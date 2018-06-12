package com.example.knoxpo.kotlinsample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FirstActivty : SingleFragmentActivty() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun createFragmet(): Fragment {

        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()

        return FirstFragment()

    }






}
