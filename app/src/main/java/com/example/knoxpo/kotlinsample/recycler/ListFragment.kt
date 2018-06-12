package com.example.knoxpo.kotlinsample.recycler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.knoxpo.kotlinsample.R

class ListFragment : Fragment(), ListAdapater.OnClickListener {


    var mList: ArrayList<ListModel>? = null

    var mListAdapater: ListAdapater? = null

    var mrecyclerList: RecyclerView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view: View = inflater.inflate(R.layout.fragment_list, container, false)

        mrecyclerList = view.findViewById<RecyclerView>(R.id.recyclerList)

        mList = ArrayList<ListModel>()

        mListAdapater = ListAdapater(mList)

        var layputManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)

        mrecyclerList?.layoutManager = layputManager

        mrecyclerList?.adapter = mListAdapater

        mListAdapater?.setOnClickListener(this)

        prepareData()


        return view
    }

    private fun prepareData() {

        for (i in 0..10) {
            val myItem = ListModel()
            myItem.title = "Sid_$i"
            mList!!.add(myItem)
        }

        mListAdapater!!.notifyDataSetChanged()
    }

    override fun onClick(position: Int) {

        Toast.makeText(this.context, "postion is" + position, Toast.LENGTH_SHORT).show()
    }

}