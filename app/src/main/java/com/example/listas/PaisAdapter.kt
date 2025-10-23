package com.example.listas

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PaisAdapter(val paises: List<String>):
    RecyclerView.Adapter<PaisAdapter.PaisViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PaisViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: PaisViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return paises.size
    }

    class PaisViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}