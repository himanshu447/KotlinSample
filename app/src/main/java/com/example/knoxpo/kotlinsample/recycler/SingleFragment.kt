package com.example.knoxpo.kotlinsample.recycler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.example.knoxpo.kotlinsample.R
import kotlinx.android.synthetic.main.fragment_single.view.*

abstract class SingleFragment : AppCompatActivity() {

    abstract fun createFragmet(): Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_single)

        var fm: FragmentManager = supportFragmentManager

        var exstingFragment: Fragment? = fm.findFragmentById(R.id.frame_container)

        if (exstingFragment == null) {
            fm.beginTransaction()
                    .replace(R.id.frame_container, createFragmet())
                    .commit()
        }
    }
}