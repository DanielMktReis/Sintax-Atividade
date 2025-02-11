fun main() {
     
    print("Digite quanto você ganha por hora: ")
    val ganhoPorHora = readLine()?.toDoubleOrNull()

    
    print("Digite o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readLine()?.toDoubleOrNull()

    if (ganhoPorHora != null && horasTrabalhadas != null && ganhoPorHora > 0 && horasTrabalhadas > 0) {
        
        val salarioTotal = ganhoPorHora * horasTrabalhadas
        
        println("O seu salário total no mês é: R$ $salarioTotal")
    } else {
        println("Por favor, insira valores válidos para o ganho por hora e o número de horas trabalhadas.")
    }
}
