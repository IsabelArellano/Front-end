package com.example.miniproyect_v0.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miniproyect_v0.Integrantes
import com.example.miniproyect_v0.R

class IntegrantesAdapter(private val integranteList:List<Integrantes>) : RecyclerView.Adapter<IntegrantesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntegrantesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return IntegrantesViewHolder(layoutInflater.inflate(R.layout.item_integrante, parent, false))
    }

    override fun onBindViewHolder(holder: IntegrantesViewHolder, position: Int) {
        val item = integranteList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = integranteList.size

}