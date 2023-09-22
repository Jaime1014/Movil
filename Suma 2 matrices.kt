package com.example.a2taller

fun main() {
    val Matriz1 = listOf(
        listOf(17, 32, 5),
        listOf(6, 16, 23),
        listOf(9, 8, 54)
    )

    val Matriz2 = listOf(
        listOf(4, 12, 9),
        listOf(61, 32, 4),
        listOf(31, 21, 11)
    )

    val resultado = Matriz1.zip(Matriz2) { filaA, filaB ->
        filaA.zip(filaB) { elementoA, elementoB -> elementoA + elementoB }
    }

    resultado.forEach { fila ->
        println(fila.joinToString("\t"))
    }
}
