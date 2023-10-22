package Bloque3.PDF45

fun main(args: Array<String>) {
    var lista: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println("Imprimir lista completa:")
    println(lista)
    println()

    println("Imprimir el primer valor de la lista:")
    println(lista.first())
    println()

    println("Imprimir el último valor de la lista:")
    println(lista.last())
    println()

    println("Imprimir el último valor de la lista:")
    println(lista[lista.size - 1])
    println()

    println("Imprimir la cantidad de elementos de la lista:")
    println(lista.size)
    println()

    println("Recorrer la lista completa con un for:")
    for (elemento in lista) {
        print("$elemento ")
    }
    println()
}