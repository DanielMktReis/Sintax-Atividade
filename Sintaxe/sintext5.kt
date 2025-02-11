fun main (){
 
    print("Digite a quantidade de metros: ")
    val metros = readLine()!!.toDouble() 
 
    val centimetros = metros * 100

    println("$metros metros equivalem a $centimetros centímetros")


}