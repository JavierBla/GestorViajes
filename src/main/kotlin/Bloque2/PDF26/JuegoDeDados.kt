package Bloque2.PDF26

class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar() {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()

        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor) {
            println("Ganó")
        } else {
            println("Perdió")
        }
    }
}