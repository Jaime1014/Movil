package com.example.a2taller

fun main() {
    val contrasena = "Jaime1224"

    val Valida: (String) -> Boolean = { contrasena ->
        val longitudMinima = 8
        contrasena.length >= longitudMinima &&
                contrasena.any { it.isUpperCase() } &&
                contrasena.any { it.isDigit() }
    }

    println("La contraseña: $contrasena es válida: ${Valida(contrasena)}")

}
