package com.example.miniproyect_v0

// Aqui creamos los datos de cada integrante, por ello hacemos un companion object lo que hace es vincular con la clase data de integrantes
// Y creamos un listOf llamado integranteList vinculado con Integrantes y sus atributos.

class IntegrantesProvider {
    companion object{
        val integranteList = listOf<Integrantes>(
            Integrantes(
                "UX/UI Designer",
                "Isabel",
                "isabel@aletheia.com",
                "isabel.aletheia",
                "+34 609 657 221",
                R.drawable.isabel_photo
            ),
            Integrantes(
                "Front-End Developer",
                "Carla",
                "carla@aletheia.com",
                "carla.aletheia",
                "+34 698 567 321",
                R.drawable.carla_photo
            ),
            Integrantes(
                "Back-End Developer",
                "Arjhay",
                "arjhay@aletheia.com",
                "arjhay.aletheia",
                "+34 698 321 081",
                R.drawable.arjhay_photo
            )
        )
    }
}