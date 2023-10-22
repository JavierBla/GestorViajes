package Bloque3.PDF36

fun main(args: Array<String>) {
    val persona1 = Persona("Manolo", 54)

    if (persona1.esMayor(::esMayorEEUU)) {
        println("${persona1.nombre} es mayor si vive en EEUU")
    } else {
        println("${persona1.nombre} no es mayor si vive en EEUU")
    }

    if (persona1.esMayor(::esMayorArgentina)) {
        println("${persona1.nombre} es mayor si vive en Argentina")
    } else {
        println("${persona1.nombre} no es mayor si vive en Argentina")
    }
}