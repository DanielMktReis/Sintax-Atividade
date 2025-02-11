fun main() {
 
    print("Digite o raio do círculo: ")
    val raio = readLine()?.toDoubleOrNull()

    if (raio != null && raio > 0) {
      
        val area = PI * raio * raio
       
        println("A área do círculo é: $area")
    } else {
        println("Por favor, insira um valor válido para o raio.")
    }
}