package com.example.a2taller

fun main() {
    val Contrasena: (Int) -> String = { longitud ->
        val caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?"
        val contrasena = StringBuilder()

        repeat(longitud) {
            val indice = java.util.Random().nextInt(caracteres.length)
            contrasena.append(caracteres[indice])
        }

        contrasena.toString()
    }

    val longitud = 12 // Reemplaza con la longitud deseada de la contraseña

    val contrasenaGenerada = Contrasena(longitud)
    println("Contraseña generada: $contrasenaGenerada")
}