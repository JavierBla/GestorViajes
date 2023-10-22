package Bloque3.PDF46

fun cargar(diccionario: MutableMap<String, String>) {
    do {
        print("Introduce una palabra en castellano: ")
        val palabraCastellano = readln()

        print("Introduce la misma palabra en ingles: ")
        val palabraIngles = readln()

        diccionario[palabraIngles] = palabraCastellano

        print("Continuar introducioendo otra palabra en el diccionario? (si/no): ")
        val continuar = readln()
    } while (continuar != "no")
}

fun listado(diccionario: MutableMap<String,String>) {
    for((ingles, castellano) in diccionario)
        println("$ingles: $castellano")
    println()
}

fun consultaIngles(diccionario: MutableMap<String, String>) {
    print("Introduce una palabra en ingles para confirmar su traducción: ")
    val palabraIngles = readln()
    if (palabraIngles in diccionario) {
        println("La traducció de $palabraIngles en castellano es ${diccionario[palabraIngles]}")
    } else {
        println("No existe esa plaabra en el diciionario.")
    }
}

fun main(args: Array<String>) {
    val diccionario: MutableMap<String, String> = mutableMapOf()
    cargar(diccionario)
    listado(diccionario)
    consultaIngles(diccionario)
}