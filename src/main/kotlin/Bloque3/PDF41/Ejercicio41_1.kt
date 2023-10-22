package Bloque3.PDF41

fun main(args: Array<String>) {
    val vector1 = Vector()
    vector1.cargar()

    val vector2 = Vector()
    vector2.cargar()

    vector1.imprimir()
    vector2.imprimir()

    val vecSuma = vector1 + vector2
    println("Suma componente a componente de los dos vectores:")
    vecSuma.imprimir()

    val vecResta = vector1 - vector2
    println("La resta componente a componente de los dos vectores:")
    vecResta.imprimir()

    val vecMultiplicacion = vector1 * vector2
    println("El producto a componente de los dos vectores:")
    vecMultiplicacion.imprimir()

    val vecDivision = vector1 / vector2
    println("La división a componente de los dos vectores:")
    vecDivision.imprimir()
}