import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Donam una distancia en metres")
    val numero = scanner.nextDouble()
    if (numero >= 0) {
        print("Millas marinas: ${numero * 0.00053996} ")
    }else println("Numero no valid")

}