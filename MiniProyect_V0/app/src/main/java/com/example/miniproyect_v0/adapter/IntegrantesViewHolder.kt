package com.example.miniproyect_v0.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.miniproyect_v0.Integrantes
import com.example.miniproyect_v0.R



class IntegrantesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    // Creamos estos valores y cada valor tiene asignado cada id de los componentes del layout item_integrante.

    val foto = view.findViewById<ImageView>(R.id.ivIntegrante)
    val profesion = view.findViewById<TextView>(R.id.tvIntegranteProfesion)
    val integrantes = view.findViewById<TextView>(R.id.tvIntegranteNombre)
    val correo1 = view.findViewById<TextView>(R.id.tvIntegranteCorreo1)
    val correo2 = view.findViewById<TextView>(R.id.tvIntegranteCorreo2)
    val telefono = view.findViewById<TextView>(R.id.tvIntegranteTelefono)

// Aqui hacemos una vinculacion con los atributos de la data class integrantes con los valores que hemos creado anteriormente.

    fun render(intModel: Integrantes){
        profesion.text = intModel.profesion
        integrantes.text = intModel.nombre
        correo1.text = intModel.correo1
        correo2.text = intModel.correo2
        telefono.text = intModel.telefono
        Glide.with(foto.context).load(intModel.photo).into(foto)
    }
}