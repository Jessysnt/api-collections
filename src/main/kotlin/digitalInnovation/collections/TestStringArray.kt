package digitalInnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Rebeca"
    nomes[2] = "Cida"

    println("1----------------------------")
    for (nome in nomes){ println(nome) }

    println("Ordenado----------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("2----------------------------")
    val nomes2 = arrayOf("Marcos", "Celso", "Roberto")
    nomes2.sort()
    nomes2.forEach { println(it) }

}