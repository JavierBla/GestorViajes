package Bloque3.PDF46

fun mostrarDiccionario(articulos: Map<String, Float>) {
    for ((articulo, precio) in articulos) {
        println("Las $articulo tiene un precio de $precio€.")
    }
}

fun mostrarMayores20(articulos: Map<String, Float>) {
    var cantidad = 0

    for (articulo in articulos) {
        if (articulo.value > 20) {
            cantidad++
        }
    }
    println("Hay $cantidad con un precio mayor a 20€.")
}

fun main(args: Array<String>) {
    val articulos: Map<String, Float> = mapOf(
        "Patatas" to 8.5f,
        "Peras" to 12f,
        "Manzanas" to 19.5f,
        "Televisiones" to 300f,
        "Consolas" to 500f
    )

    mostrarDiccionario(articulos)
    println()
    mostrarMayores20(articulos)
}