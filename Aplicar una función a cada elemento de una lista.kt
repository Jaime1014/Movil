package com.example.trabajo1

fun main() {
    val lista = listOf(5, 9, 13, 5, 2, 13, 11, 10)
    val sumacuadrados = lista.map { it * it }.sum()
    println("Suma de los cuadrados: $sumacuadrados")

}