package com.example.knoxpo.kotlinsample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FirstFragment : Fragment() {

    var textViewCounter: TextView? = null
    var buttonIcrement: Button? = null
    var buttonDrecrement: Button? = null

    var counter: Int = 0


    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        if (savedInstanceState != null) {

            counter = savedInstanceState.getInt("counter")
        }
        textViewCounter?.setText(counter.toString())

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view: View = inflater.inflate(R.layout.fragment_first, container, false)

        textViewCounter = view.findViewById<TextView>(R.id.textViewCounter)
        buttonIcrement = view.findViewById<Button>(R.id.buttonIcrement)
        buttonDrecrement = view.findViewById<Button>(R.id.buttonDrecrement)

        counter = textViewCounter?.text.toString().toInt()

        buttonIcrement?.setOnClickListener {
            counter = counter + 1

            showCounter(counter)
        }
        buttonDrecrement?.setOnClickListener {

            if (counter <= 0) {
            } else {
                counter = counter - 1
                showCounter(counter)

            }
        }

        return view
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("counter",counter)
        super.onSaveInstanceState(outState)
    }

    fun showCounter(c: Int) {

        textViewCounter?.setText(c.toString())
    }

}