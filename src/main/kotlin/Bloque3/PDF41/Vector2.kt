package Bloque3.PDF41

class Vector2 {
    val arreglo = IntArray(5)

    fun cargar() {
        for(i in arreglo.indices)
            arreglo[i] = (Math.random() * 11 + 1).toInt()
    }

    fun imprimir() {
        for(elemento in arreglo) {
            print("$elemento ")
        }
        println()
    }

    operator fun times(valor: Int): Vector2 {
        var producto = Vector2()
        for (i in arreglo.indices) {
            producto.arreglo[i] = arreglo[i] * valor
        }
        return producto
    }
}