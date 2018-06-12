package com.example.knoxpo.kotlinsample.recycler


import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

class ListActivty : SingleFragment() {
    override fun createFragmet(): Fragment {

        return ListFragment()
    }


}