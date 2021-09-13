package digitalInnovation.collections

fun main() {
    val joao = Funcionario("Joao", 5000.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "CLT")
    val clark = Funcionario("Clark", 3000.0, "PJ")

    val funcionarios = listOf(joao, maria, clark)

    println("1---------------------")
    funcionarios.forEach { println(it) }

    println("2---------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("3---------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("4---------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }


}


