package Bloque3.PDF36

class Persona(val nombre: String, val edad: Int) {
    fun esMayor(fn: (Int) -> Boolean): Boolean {
        return fn(edad)
    }
}
fun esMayorEEUU(edad: Int): Boolean {
    return edad >= 21
}
fun esMayorArgentina(edad: Int): Boolean {
    return edad >= 18
}