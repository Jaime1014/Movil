package com.example.trabajo1

fun main() {
    val Palabras = listOf("Carro", "Jaime", "Jose", "Alexander", "Foto")
    val letra ="a"
    val Resultado = Palabras.filter { it.contains(letra) }
    if (Resultado.isNotEmpty())
        println("palabras que tienen la letra $letra: $Resultado")
    else println("Ninguna palabra contiene la letra $letra")

}