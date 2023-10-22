package Bloque2.PDF26

class Socio(var nombre: String, var antiguedad: Int) {
    override fun toString(): String {
        return "$nombre lleva siendo soci@ $antiguedad años."
    }
}