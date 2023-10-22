package Bloque3.PDF39

fun main(args: Array<String>) {
    val vectorPersonas: Array<Persona> = arrayOf(
        Persona("Ana", 12),
        Persona("Marta", 22),
        Persona("Manolo", 56),
        Persona("Juan", 18)
    )

    var cantidad = 0

    vectorPersonas.forEach {
        if (it.esMayor()) {
            cantidad++
        }
    }

    println("Hay $cantidad personas que son mayores de edad.")
}