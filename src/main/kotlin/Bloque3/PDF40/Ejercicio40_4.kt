package Bloque3.PDF40

fun Int.hasta(fin: Int) {
    for (valor in this..fin) {
        print("$valor-")
    }
    println()
}

fun main(args: Array<String>) {
    val valor = 10
    valor.hasta(30)
    5.hasta(12)
}