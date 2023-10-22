package Bloque2.PDF27

class Operaciones {
    fun cargarDatos() {
        print("Introduce un primer valor: ")
        val valor1 = readLine()!!.toInt()

        print("Introduce un segundo valor: ")
        val valor2 = readLine()!!.toInt()

        sumar(valor1, valor2)
        multiplicar(valor1, valor2)
    }

    private fun sumar(valor1: Int, valor2: Int) {
        val suma = valor1 + valor2
        println("El resultado de sumar los valores $valor1 y $valor2 es $suma")
    }
    private fun multiplicar(valor1: Int, valor2: Int) {
        val producto = valor1 * valor2
        println("El resultado de sumar los valores $valor1 y $valor2 es $producto")
    }

}