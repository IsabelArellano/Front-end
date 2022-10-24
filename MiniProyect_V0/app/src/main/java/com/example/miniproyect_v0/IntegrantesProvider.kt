package com.example.miniproyect_v0

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