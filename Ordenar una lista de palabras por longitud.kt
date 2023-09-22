package com.example.trabajo1

    fun ordenar(palabras: List<String>): List<String> {
        return palabras.sortedBy { it.length }
    }

    fun main() {
        val listaPalabras = listOf("Carro", "Moto", "Naranja", "Carlos", "Bafle")
        val PalabrasOrdenadas = ordenar(listaPalabras)
        println("Nombres ordenados por longitud: $PalabrasOrdenadas")
    }


