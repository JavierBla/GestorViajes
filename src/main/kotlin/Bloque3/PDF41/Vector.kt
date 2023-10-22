package Bloque3.PDF41

class Vector {
    val vector = IntArray(5)

    fun cargar() {
        for (i in vector.indices) {
            vector[i] = (Math.random() * 11 + 1).toInt()
        }
    }

    fun imprimir() {
        for (elemento in vector) {
            print("$elemento ")
        }
        println()
    }

    operator fun plus(vector2: Vector): Vector {
        var suma = Vector()
        for (i in vector.indices) {
            suma.vector[i] = vector[i] + vector2.vector[i]
        }
        return suma
    }

    operator fun minus(vector2: Vector): Vector {
        var resta = Vector()
        for (i in vector.indices) {
            resta.vector[i] = vector[i] - vector2.vector[i]
        }
        return resta
    }

    operator fun times(vector2: Vector): Vector {
        var producto = Vector()
        for (i in vector.indices) {
            producto.vector[i] = vector[i] * vector2.vector[i]
        }
        return producto
    }

    operator fun div(vector2: Vector): Vector {
        var division = Vector()
        for (i in vector.indices) {
            division.vector[i] = vector[i] / vector2.vector[i]
        }
        return division
    }
}