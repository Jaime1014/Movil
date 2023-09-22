package com.example.trabajo1

fun main() {
    val lista = listOf("bruno" , "maria", "mesa", "cortina" , "cargador")
    val total = lista.sumBy { it.length }
    println("Total letras es: $total")
}

