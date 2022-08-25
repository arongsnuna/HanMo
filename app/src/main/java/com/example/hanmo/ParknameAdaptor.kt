package com.example.hanmo


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_park.view.*

class ParknameAdaptor(
    private val parkBtns:MutableList<Button>
) : RecyclerView.Adapter<ParknameAdaptor.ParkViewHolder>() {

    private val parklist = listOf<String>( /* read only list */
        "강서지구", "양화지구", "난지지구", "망원지구", "선유도지구",
        "여의도지구", "이촌지구", "반포지구", "잠원지구", "뚝섬지구",
        "잠실지구", "광나루지구"
    )
    private val parks = mutableListOf<Parkname>()
    private lateinit var mListener : onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }


    class ParkViewHolder(
        item_view:View,
        listener:onItemClickListener
    ) : RecyclerView.ViewHolder(item_view) {
        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    fun initButtons() {
        var i:Int = 0
        parks.clear()
        parklist.forEach() { name ->
            parks.add(Parkname(name, i))
            notifyItemInserted(i++)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        return ParkViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_park,
                parent,
                false
            ),
            mListener
        )
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val cur_park = parks[position]
        holder.itemView.apply {
            parkname_tv.text = cur_park.name
        }
    }

    override fun getItemCount(): Int { // returns the amount of items on the list
        return parks.size
    }
}