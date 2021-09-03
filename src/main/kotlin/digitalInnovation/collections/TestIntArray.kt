package digitalInnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("1----------------------------")
    for (valor in values){ println(valor) }

    println("2----------------------------")
    values.forEach {  println(it) }

    println("3----------------------------")
    values.forEach { valor -> println(valor) }

    println("4----------------------------")
    for (index in values.indices){ println(values[index]) }

    println("5----------------------------")
    values.sort() //"sort ordena do menor p o maior"//
    for (valor in values){ println(valor) }
}

