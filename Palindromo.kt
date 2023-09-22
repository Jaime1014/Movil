package com.example.a2taller

fun main() {
    val Palindromo: (String) -> Boolean = { texto ->
        val texto = texto.toLowerCase().replace(Regex("[^a-zA-Z0-9]"), "")
        texto == texto.reversed()
    }

    val Textoa = "jaime" // Reemplaza con tu cadena de texto
    val Textob = "anilina"    // Reemplaza con otra cadena de texto

    println("'$Textoa' es un palíndromo: ${Palindromo(Textoa)}")
    println("'$Textob' es un palíndromo: ${Palindromo(Textob)}")
}
