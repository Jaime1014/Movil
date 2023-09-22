package com.example.myapplication

fun main() {
    println("Bienvenidos a la calculadora")
    println("por favor seleccione una opcion 1 suma. 2 resta. 3 multiplicacion. 4 division")
    val V1 = readln().toInt()



    if (V1 == 1) {

        println("por favor digite el primer numero")
        val N5 = readln().toInt()
        println("por favor digite el segundo numero")
        val N6 = readln().toInt()
        val ResultadoSuma = N5 + N6
        println("La suma de $N5 y $N6 es $ResultadoSuma")
    }

        else if (V1 == 2) {


            println("por favor digite el primer numero")
            val N7 = readln().toInt()
            println("por favor digite el segundo numero")
            val N8 = readln().toInt()
            val ResultadoResta = N7 - N8
            println("La resta de $N7 y $N8 es $ResultadoResta")

        }
        else if (V1 == 3) {

            println("por favor digite el primer numero")
            val N9 = readln().toInt()
            println("por favor digite el segundo numero")
            val N10 = readln().toInt()
            val ResultadoMultiplicacion = N9 * N10
            println("La multiplicacion de $N9 y $N10 es $ResultadoMultiplicacion")

        }
        else {

            println("por favor digite el primer numero")
            val N11 = readln().toInt()
            println("por favor digite el segundo numero")
            val N12 = readln().toInt()
            val ResultadoDivision = N11 / N12
            println("La division de $N11 y $N12 es $ResultadoDivision")
        }


}