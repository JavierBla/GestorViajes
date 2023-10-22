package Bloque3.PDF42

fun sumar(vararg numeros: Int): Int {
    var suma = 0

    for (elemento in numeros) {
        suma += elemento
    }
    return suma
}

fun main(args: Array<String>) {
    val total = sumar(12,23,34,45,56,67,78,89,90)
    println(total)
}