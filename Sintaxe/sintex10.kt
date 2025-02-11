fun main() {
  
    print("Digite a temperatura em Celsius: ")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
       
        val fahrenheit = (celsius * 9 / 5) + 32
       
        println("A temperatura em Fahrenheit é: $fahrenheit")
    } else {
        println("Por favor, insira um valor numérico válido para a temperatura.")
    }
}
