package Bloque3.PDF45

fun cargar(): Int {
    print("Introduce un entero: ")
    val valor = readLine()!!.toInt()
    return valor
}

fun main(args: Array<String>) {
    var lista = List(5) { cargar() }
    println(lista)
}