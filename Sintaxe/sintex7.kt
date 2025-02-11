fun main() {
     
    print("Digite o valor do lado do quadrado: ")
    val lado = readLine()?.toDoubleOrNull()

    if (lado != null && lado > 0) {
        
        val area = lado * lado
         
        val dobroArea = area * 2
         
        println("A área do quadrado é: $area")
        println("O dobro da área é: $dobroArea")
    } else {
        println("Por favor, insira um valor válido para o lado do quadrado.")
    }
}
