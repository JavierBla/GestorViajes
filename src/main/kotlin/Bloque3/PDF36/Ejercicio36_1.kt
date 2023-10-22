package Bloque3.PDF36

fun operar(valor1: Int, valor2: Int, fn: (Int,Int) -> Int): Int {
    return fn(valor1, valor2)
}
fun sumar(valor1: Int, valor2: Int) = valor1 + valor2
fun restar(valor1: Int, valor2: Int) = valor1 - valor2
fun multiplicar(valor1: Int, valor2: Int) = valor1 * valor2
fun dividir(valor1: Int, valor2: Int) = valor1 / valor2

fun main(args: Array<String>) {
    val resultado1 = operar(20, 15, ::sumar)
    println(resultado1)

    val resultado2 = operar(20, 15, ::restar)
    println(resultado2)

    val resultado3 = operar(20, 15, ::multiplicar)
    println(resultado3)

    val resultado4 = operar(20, 15, ::dividir)
    println(resultado4)
}