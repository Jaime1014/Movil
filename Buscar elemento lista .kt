package com.example.a2taller

fun main() {
    val lista = listOf( 34, 19, 24, 39, 3, 4)
    val Elemento = 24

    val indice = lista.indexOf(Elemento)

    if (indice != -1) {
        println("El elemento $Elemento se encuentra en el índice $indice.")
    } else {
        println("El elemento $Elemento no se encuentra en la lista.")
    }
}