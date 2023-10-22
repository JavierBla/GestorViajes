package Bloque3.PDF45

fun main(args: Array<String>) {
    val edades = mutableListOf<Int>(12, 45, 22, 67)

    println("Lista de edades:")
    println(edades)

    edades[0] = 18

    println("Lista de edades tras modificar el primer valor:")
    println(edades)

    println("Promedio de edades:")
    println(edades.average())

    println("Agregar edad:")
    println(edades.add(20))

    println("Eliminar primera edad:")
    println(edades.removeAt(0))

    println("Lista de edades:")
    println(edades)
}