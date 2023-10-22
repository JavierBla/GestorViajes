package Bloque3.PDF45

fun main(args: Array<String>) {
    val lista = MutableList(20) {((Math.random()*6)+1).toInt()}

    val cantidad = contar1(lista)
    println("Cantidad de unos: $cantidad")

    lista.removeAll {it == 6}
    println(lista)
}

fun contar1(lista: MutableList<Int>): Int {
    var cantidad = 0

    for (elemento in lista) {
        if (elemento == 1) {
            cantidad++
        }
    }
    return cantidad
}