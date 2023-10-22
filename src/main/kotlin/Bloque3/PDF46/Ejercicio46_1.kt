package Bloque3.PDF46

fun main(args: Array<String>) {
    val paises: Map<String, Int> = mapOf(
        Pair("Argenntina", 40000000),
        Pair("España", 46000000),
        Pair("Uruguay", 34000000)
    )
    println("Listado completo del Map:")
    println(paises)

    for ((clave, valor) in paises) {
        println("El pais $clave y tiene $valor habitantes.")
    }
}