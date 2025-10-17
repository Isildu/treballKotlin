import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Donam un numero")
    val numero = scanner.nextDouble()
    println("Donam un altre numero per calcular amb el anterior numero")
    val numero2 = scanner.nextDouble()
    print("Suma: ${numero + numero2}  Resta: ${numero - numero2} Multiplicacio: ${numero * numero2}  Divisio: ${numero / numero2}")
}