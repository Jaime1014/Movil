package com.example.a2taller

fun main() {
    val numero = 1014656725

    val suma: (Int) -> Int = { n ->
        var numeroActual = n
        var suma = 0

        while (numeroActual > 0) {
            suma += numeroActual % 10
            numeroActual /= 10
        }

        suma
    }

    val resultado = suma(numero)
    println("La suma de los dígitos de $numero es $resultado")
}