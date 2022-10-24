package com.example.miniproyect_v0

// Importar esto para que funcione las funciones del boton.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main_Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_principal)


        // Hacemos un boton que nos dirige en About Us.
        val b_About = findViewById<Button>(R.id.b_About_Us)
        b_About.setOnClickListener{
            val dir1 = Intent(this, About_Us::class.java)
            startActivity(dir1)
        }
    }
}
