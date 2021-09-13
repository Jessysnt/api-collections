package digitalInnovation.collections

fun main() {
    val joao = Funcionario("Joao", 5000.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "CLT")
    val clark = Funcionario("Clark", 3000.0, "PJ")

    val funcionario1 = setOf(joao, clark)
    val funcionario2 = setOf(maria)

    println("1---------------------")
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("2---------------------")
    val funcionario3 = setOf(joao, clark, maria)
    val resultSubtra = funcionario3.subtract(funcionario2)
    resultSubtra.forEach { println(it) }

    println("3---------------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }

}