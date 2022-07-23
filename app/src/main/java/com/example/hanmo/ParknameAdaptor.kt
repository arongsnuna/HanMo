package com.example.hanmo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ParknameAdaptor(
    vararg parks:List<Parkname>
) : RecyclerView.Adapter<ParknameAdaptor.ParkViewHolder>() {
    class ParkViewHolder(
        item_view:View
    ) : RecyclerView.ViewHolder(item_view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        return ParkViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_park
            )
        )
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }
}