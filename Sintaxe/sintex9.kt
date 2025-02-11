fun main() {
    
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readLine()?.toDoubleOrNull()

    if (fahrenheit != null) {
        
        val celsius = (fahrenheit - 32) * 5 / 9
       
        println("A temperatura em Celsius é: $celsius")
    } else {
        println("Por favor, insira um valor numérico válido para a temperatura.")
    }
}
