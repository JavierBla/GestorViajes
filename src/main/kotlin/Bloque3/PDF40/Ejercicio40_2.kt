package Bloque3.PDF40

fun IntArray.imprimir() {
    print("[")
    for (elemento in this) {
        print("$elemento ")
    }
    print("]")
}

fun main(args: Array<String>) {
    val vector = IntArray(10,{it})
    vector.imprimir()
}