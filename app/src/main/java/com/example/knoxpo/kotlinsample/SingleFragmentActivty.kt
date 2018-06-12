package com.example.knoxpo.kotlinsample

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

public abstract class  SingleFragmentActivty : AppCompatActivity() {

    abstract fun createFragmet(): Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_single)

        var fm : FragmentManager = supportFragmentManager

        var exsistingFragment : Fragment? = fm.findFragmentById(R.id.frame_container)

        if(exsistingFragment==null)
        {
            fm.beginTransaction()
                    .replace(R.id.frame_container,createFragmet())
                    .commit()
        }


    }

}