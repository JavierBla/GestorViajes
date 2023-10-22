package Bloque3.PDF38

fun main(args: Array<String>) {
    val vector = IntArray(20) {(Math.random()*11).toInt()}
    println("Listado completo del array:")
    for (elemento in vector) {
        print("$elemento ")
    }
    println()
    val cant1 = vector.count() {it <= 5}
    println("Cantidad de valores menores o iguales a 5: $cant1")

    if (vector.all { it <= 9 }) {
        println("Todos los valores son menores o iguales a 9")
    } else {
        println("Todos los valores son menores o iguales a 9")
    }

    if (vector.any() { it == 10 }) {
        println("Alguno de los valores es igual a 10")
    } else {
        println("Todos los valores son distintos a 10")
    }
}