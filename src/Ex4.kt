import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Donam un preu en euros")
    val numero = scanner.nextDouble()
    if (numero >= 0) {
        print("Lliures esterlines: ${numero * 0.87} ")
    }else println("Numero no valid")
}