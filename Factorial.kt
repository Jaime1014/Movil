package com.example.a2taller

fun main() {
    val numero = 20
    val Factorial: (Int) -> Long = { n ->
        if (n < 0) {
            throw IllegalArgumentException("El número no debe ser negativo.")
        }

        var factorial: Long = 1

        for (i in 1..n) {
            factorial *= i
        }

        factorial
    }

    val Resultado = Factorial(numero)
    println("El factorial de $numero es $Resultado")
}