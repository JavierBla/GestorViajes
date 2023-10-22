package Bloque3.PDF41

fun main(args: Array<String>) {
    val vector2 = Vector2()

    vector2.cargar()
    vector2.imprimir()

    val vecProductoEntero = vector2 * 3
    println("El producto de un vector con un entero:")
    vecProductoEntero.imprimir()
}