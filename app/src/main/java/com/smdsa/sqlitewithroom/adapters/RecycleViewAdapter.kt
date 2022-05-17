package com.smdsa.sqlitewithroom.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.smdsa.sqlitewithroom.R
import com.smdsa.sqlitewithroom.sql.User

class RecycleViewAdapter() : RecyclerView.Adapter<RecycleViewAdapter.VH>() {

    private var arrayList = emptyList<User>()

    private lateinit var mListener: OnRecycleViewListener

    interface OnRecycleViewListener{
        fun onRecycleViewClick (position: Int)
    }

    fun setOnRecycleViewClick(listener: OnRecycleViewListener){
        mListener = listener
    }

    class VH(itemView: View, listener: OnRecycleViewListener) : RecyclerView.ViewHolder(itemView){
        var text : TextView = itemView.findViewById(R.id.dataText)
        init {
            itemView.setOnClickListener {
                listener.onRecycleViewClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.one_item, parent, false), mListener)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val currentUser = arrayList[position]
        holder.text.text = "${currentUser.firstName} ${currentUser.secondName}"
    }

    fun setData(data : List<User>){
        this.arrayList = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}