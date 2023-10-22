package Bloque3.PDF39

fun main(args: Array<String>) {
    val dados: Array<Dado> = arrayOf(Dado(), Dado(), Dado(), Dado(), Dado())

    for (dado in dados) {
        dado.tirar()
        dado.mostrar()
    }

    var cantidadDe1 = 0
    var cantidadDe2 = 0
    var cantidadDe3 = 0
    var cantidadDe4 = 0
    var cantidadDe5 = 0
    var cantidadDe6 = 0

    dados.forEach {
        when(it.valor) {
            1 -> cantidadDe1++
            2 -> cantidadDe2++
            3 -> cantidadDe3++
            4 -> cantidadDe4++
            5 -> cantidadDe5++
            6 -> cantidadDe6++
        }
    }

    println("Cantidad de veces que ha salido el 1: $cantidadDe1")
    println("Cantidad de veces que ha salido el 2: $cantidadDe2")
    println("Cantidad de veces que ha salido el 3: $cantidadDe3")
    println("Cantidad de veces que ha salido el 4: $cantidadDe4")
    println("Cantidad de veces que ha salido el 5: $cantidadDe5")
    println("Cantidad de veces que ha salido el 6: $cantidadDe6")
}