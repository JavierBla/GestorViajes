package Bloque3.PDF41

fun main(args: Array<String>) {
    var vector1 = Vector3()
    vector1.cargar()

    println("Vector original:")
    vector1.imprimir()

    vector1++

    println("Luego de llamar al operador ++")
    vector1.imprimir()

    vector1--

    println("Luego de llamar al operador --")
    vector1.imprimir()
}