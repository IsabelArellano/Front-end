package com.example.miniproyect_v0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.miniproyect_v0.adapter.IntegrantesAdapter

class RecyclerViewIntegrantes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Aqui se mostrara la lista de los integrantes con sus datos con el metodo.
        setContentView(R.layout.activity_recycler_view_integrantes)
        initRecyclerView()

        val botonSalir2 =findViewById<Button>(R.id.b_Exit2)
        botonSalir2.setOnClickListener{
            finish()
        }

    }

    // Creamos un metodo para el RecyclerView
    private fun initRecyclerView(){
        // Creamos un val y vinculamos con el componente recyclerView del layout recycler_view_intrgrante
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerIntegrantes)
        // Con el layoutManager nos permite colocar las vistas de los items una debajo de otra.
        // Vendría a ser el típico listado de un único elemento por columna
        recyclerView.layoutManager = LinearLayoutManager(this)
        // Con el adapter cogera los datos de la lista clase.
        recyclerView.adapter = IntegrantesAdapter(IntegrantesProvider.integranteList)
    }



}