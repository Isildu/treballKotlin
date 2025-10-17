import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Donam un numero")
    val numero = scanner.nextDouble()
    print("Numero anterior: ${numero - 1}  Numero posterior: ${numero + 1}")
}