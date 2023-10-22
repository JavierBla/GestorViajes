package Bloque3.PDF40

fun String.primeraMitad(): String {
    return this.substring(0..this.length/2-1)
}

fun String.segundaMitad(): String {
    return this.substring(this.length/2..this.length-1)
}

fun main(args: Array<String>) {
    val texto = "Vientos"

    println(texto.primeraMitad())
    println(texto.segundaMitad())
}