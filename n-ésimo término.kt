package com.example.a2taller

fun main() {
    val n = 10

    val Fibonacci: (Int) -> Long = { n ->
        if (n <= 0) {
            throw IllegalArgumentException("El valor de n debe ser un número positivo.")
        }

        var a = 0L
        var b = 1L

        repeat(n) {
            val temp = a + b
            a = b
            b = temp
        }

        a
    }

    val Resultado = Fibonacci(n)
    println("El $n-ésimo término de la secuencia de Fibonacci es $Resultado")
}