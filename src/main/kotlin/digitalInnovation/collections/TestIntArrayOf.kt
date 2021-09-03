package digitalInnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("1----------------------------")
    values.forEach { println(it) }

    println("Ordenado----------------------------")
    values.sort()
    values.forEach { println(it) }
}