package Bloque2.PDF26

class Dado(var valor: Int) {
    fun tirar() {
        valor = ((Math.random()*6)+1).toInt()
        imprimir()
    }
    fun imprimir() {
        println("Valor del dado: $valor")
    }
}