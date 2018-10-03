package com.developer.bretts.com.kotlinintroduction


fun main(args: Array<String>) {
    fun checkNota() {
        print("Ingrese nota: ")
        var nota: Int? = readLine()!!.toIntOrNull()

        if (nota == null) {
            println("El valor ingresado no es un número entero, vuelva a intentarlo")
            println("")

            checkNota()
        } else {
            when (nota) {
                in 0..10 -> println("Condición: Jalado, Nota: $nota")
                in 11..13 -> println("Condición: Regular, Nota: $nota")
                in 14..16 -> println("Condición: Bueno, Nota: $nota")
                in 17..18 -> println("Condición: Excelente, Nota: $nota")
                in 19..20 -> println("Condición: Sobresaliente, Nota: $nota")
                else -> {
                    println("El valor ingresado no está en la escala vigesimal")
                    println("")

                    checkNota()
                }
            }
        }
    }

    var entry = "191"
    var numbers = entry.map { it.toString().toInt() }
    numbers = numbers.sortedDescending()
    var result = numbers.joinToString(separator = "", prefix = "", postfix = "")

    println(result)
}