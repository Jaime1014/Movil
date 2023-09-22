package com.example.trabajo1

fun Promedio(numeros: List<Int>): Double {
    val total = numeros.sum()
    return total.toDouble() / numeros.size
}

fun main() {
    val listaNumeros = listOf(17, 45, 44, 19, 89)
    val promedio = Promedio(listaNumeros)
    println("El promedio es: $promedio")

}