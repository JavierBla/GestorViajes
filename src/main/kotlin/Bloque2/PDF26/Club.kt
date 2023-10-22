package Bloque2.PDF26

class Club {
    val socio1 = Socio("Manolo", 67)
    val socio2 = Socio("Ana", 15)
    val socio3 = Socio("Antonio", 32)

    fun mostrarMayorAntiguedad() {
        println(socio1.toString())
        println(socio2.toString())
        println(socio3.toString())

        print("Socio con mayor antuguedad: ")
        if (socio1.antiguedad > socio2.antiguedad) {
            println(socio1.nombre)
        } else if (socio2.antiguedad > socio3.antiguedad) {
            println(socio2.nombre)
        } else {
            println(socio3.nombre)
        }
    }
}