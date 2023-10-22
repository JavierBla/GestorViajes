package Bloque3.PDF39

fun recorrerTodo(vector: IntArray, fn:(Int) -> Unit) {
    for (elemento in vector) {
        fn(elemento)
    }
}

fun main(args: Array<String>) {
    val vector = IntArray(10)
    for (i in vector.indices) {
        vector[i] = ((Math.random()*100).toInt())
    }

    println("Mostrando contenido del array: ")
    for (elemento in vector) {
        print("$elemento ")
    }

    println()

    var cantidad = 0
    recorrerTodo(vector) {
        if (it % 3 == 0) {
            cantidad++
        }
    }

    println("Cantidad de valores que son múltiplos de 3: $cantidad")

    var suma = 0
    recorrerTodo(vector) {
        if (it > 50) {
            suma += it
        }
    }

    println("Suma de los valores que son mayores a 50: $suma")
}