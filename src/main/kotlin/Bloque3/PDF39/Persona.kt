package Bloque3.PDF39

class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre Edad: $edad")
    }
    fun esMayor() = edad >= 18
}