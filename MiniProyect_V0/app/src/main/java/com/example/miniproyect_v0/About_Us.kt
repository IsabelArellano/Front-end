package com.example.miniproyect_v0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.miniproyect_v0.R.*

class About_Us : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_about_us)

        // Funcion del boton de regresar en el inicio.
        val botonSalir =findViewById<Button>(id.b_Exit)
        botonSalir.setOnClickListener{
            finish()
        }

        // Hacemos un boton que nos dirige la info de los integrantes.
        val b_About = findViewById<Button>(R.id.intB)
        b_About.setOnClickListener{
            val dir1 = Intent(this, RecyclerViewIntegrantes::class.java)
            startActivity(dir1)
        }

    }
}
