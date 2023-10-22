package Bloque3.PDF38

fun main(args: Array<String>) {
    val vector = FloatArray(10)

    for (i in vector.indices) {
        print("Introduce un valor: ")
        vector[i] = readLine()!!.toFloat()
    }

    println()

    val cantidad = vector.count(){it < 50}
    println("Cantidad de valores menores a 50: $cantidad")

    if (vector.all { it < 50 }) {
        println("Todos los valores son menores a 50.")
    } else {
        println("No todos los valores son menores a 50.")
    }
}