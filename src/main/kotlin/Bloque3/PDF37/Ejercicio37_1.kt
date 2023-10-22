package Bloque3.PDF37

fun operar(valor1: Int, valor2: Int, fn: (Int,Int) -> Int): Int {
    return fn(valor1, valor2)
}

fun main(args: Array<String>) {
    val suma = operar(12, 33) { x, y -> x + y }
    println(suma)

    val resta = operar(12, 33) { x, y -> x - y }
    println(resta)

    val elevarCuarta = operar(2, 4) { x, y ->
        var valor = 1
        for (i in 1..y) {
            valor *= x
        }
        valor
    }
    println(elevarCuarta)
}