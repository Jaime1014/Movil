package com.example.a2taller

fun main() {
    val numeros = listOf(4,32 ,12 ,67 ,19 ,24 ,33 ,8 ,31 )


    val ascendente = numeros.sortedBy { it }
    println("Orden ascendente: $ascendente")


    val descendente = numeros.sortedByDescending { it }
    println("Orden descendente: $descendente")
}