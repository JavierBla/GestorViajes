package Bloque3.PDF39

class Dado(var valor: Int = 1) {

    fun tirar() {
        valor = ((Math.random()*6)+1).toInt()
    }

    fun mostrar() {
        println("Valor del dado: $valor")
    }
}