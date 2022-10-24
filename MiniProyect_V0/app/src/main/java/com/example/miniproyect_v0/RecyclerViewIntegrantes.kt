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
        setContentView(R.layout.activity_recycler_view_integrantes)
        initRecyclerView()

        val botonSalir2 =findViewById<Button>(R.id.b_Exit2)
        botonSalir2.setOnClickListener{
            finish()
        }

    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerIntegrantes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = IntegrantesAdapter(IntegrantesProvider.integranteList)
    }



}