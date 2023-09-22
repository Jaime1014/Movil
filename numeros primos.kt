package com.example.trabajo1

fun main() {
    val lista = listOf(5, 9, 13, 45, 33, 23, 19, 99)
    val primos = lista.filter { num -> (2 until num).none { num % it == 0 } }
    println("Numeros primos : $primos")
}