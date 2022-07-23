package com.example.hanmo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_park.view.*

class ParknameAdaptor(
    private val parks:MutableList<Parkname>
) : RecyclerView.Adapter<ParknameAdaptor.ParkViewHolder>() {
    class ParkViewHolder(
        item_view:View
    ) : RecyclerView.ViewHolder(item_view)

    fun initParks() {
        val parknamelist = listOf<String>( /* read only list */
            "강서지구", "양화지구", "난지지구", "망원지구", "선유도지구",
            "여의도지구", "이촌지구", "반포지구", "잠원지구", "뚝섬지구",
            "잠실지구", "광나루지구"
        )
        var i:Int = 0
        parknamelist.forEach() { name ->
            parks.add(Parkname(name, i++))
        }
    }

    fun getIndex(park:Parkname) = park.index

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        initParks()
        return ParkViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_park,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val cur_park = parks[position]
        holder.itemView.apply {
            parkname_btn.text = cur_park.name
        }
    }

    override fun getItemCount(): Int { // returns the amount of items on the list
        return parks.size
    }
}