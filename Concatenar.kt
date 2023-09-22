package com.example.trabajo1

fun main() {
    val lista = listOf("Hola", "soy" , "Jaime", "Barbosa",  "y" , "me" , "gusta" , "comer")
    val cadena = lista.reduce { acc, cadena -> acc+ cadena }
    println("cadena concatenada: $cadena")
}