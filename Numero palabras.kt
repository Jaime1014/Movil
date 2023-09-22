package com.example.a2taller

fun main() {
    val texto = "Jaime es un buen estudiante"
    val Palabras = { texto: String ->
        texto.split(Regex("\\s+")).size
    }(texto)

    println("El número de palabras en el texto: $texto, es: $Palabras")
}