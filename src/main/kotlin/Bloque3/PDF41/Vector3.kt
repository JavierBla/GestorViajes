package Bloque3.PDF41

class Vector3 {
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

    operator fun inc(): Vector3 {
        var suma = Vector3()
        for (i in vector.indices) {
            suma.vector[i] = vector[i] + 1
        }
        return suma
    }

    operator fun dec(): Vector3 {
        var suma = Vector3()
        for (i in vector.indices) {
            suma.vector[i] = vector[i] - 1
        }
        return suma
    }
}