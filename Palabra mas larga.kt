package com.example.trabajo1

fun main() {
    val lista = listOf("juan", "equipo" , "carro" , "Profesores" , "perro " , "oro")
    val larga = lista.maxByOrNull { it.length }

    println("La palabra mas larga es: $larga")
}