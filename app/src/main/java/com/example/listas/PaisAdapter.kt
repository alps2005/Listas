package com.example.listas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PaisAdapter(val paises: List<String>):
    RecyclerView.Adapter<PaisAdapter.PaisViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PaisViewHolder {
        val view = LayoutInflater.
        from(parent.context).
        inflate(R.layout.item_materia, parent, false)
        return PaisViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: PaisViewHolder,
        position: Int
    ) {
        val pais: String = paises[position]
        holder.item.text = pais
        holder.item.setOnClickListener {
            Toast.makeText(holder.item.context, pais, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return paises.size
    }

    class PaisViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val item: TextView = view.findViewById(R.id.item)

    }
}