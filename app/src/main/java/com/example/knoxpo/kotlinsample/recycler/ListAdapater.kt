package com.example.knoxpo.kotlinsample.recycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.knoxpo.kotlinsample.R

class ListAdapater(var mlist: List<ListModel>?) : RecyclerView.Adapter<ListAdapater.MyViewHolder>() {

     var mOnClickListener : OnClickListener?=null

    fun setOnClickListener(mlistener : OnClickListener)
    {
        mOnClickListener=mlistener
    }

    override fun getItemCount(): Int {

        return mlist?.size!!
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val listModel: ListModel = mlist!!.get(position)
        holder.bindModel(listModel)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)

        return MyViewHolder(view)
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        private val mTitle: TextView? = itemView?.findViewById(R.id.textViewtitle)

        init {
            itemView?.setOnClickListener{

                var pos : Int = adapterPosition
                
            }
        }

        fun bindModel(listModel: ListModel) {

            mTitle?.text = listModel.title
            mTitle?.setOnClickListener {



            }
        }

    }

   public interface OnClickListener
    {
        fun onClick(position: Int)
    }
}