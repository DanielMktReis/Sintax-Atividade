 fun main {//Exercício4
 
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()  
    
    
    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()  
    
   
    print("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()  
    
   
    print("Digite a quarta nota: ")
    val nota4 = readLine()!!.toDouble()  
   
    val media = (nota1 + nota2 + nota3 + nota4) / 4
    println("A média das notas é: $media")
  }
