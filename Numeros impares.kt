package com.example.trabajo1

fun main(){
    val numeros = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19)
    val impar = numeros.filter { it % 2 !=0 }
    println("Numeros impares: $impar")

}