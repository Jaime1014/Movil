package com.example.trabajo1

fun main() {

    val lista = listOf("actor" , "altar" ,"daniela" , "jaime")
    val Numero = 5
    val Longitud = lista.filter { it.length  > Numero}
    println("Palabras con mas de $Numero letras: ${Longitud.joinToString(",")}")

}

