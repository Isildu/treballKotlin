import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Donam la allargaria de la piscina")
    val llargaria = scanner.nextDouble()
    println("Donam la amplada de la piscina")
    val amplada = scanner.nextDouble()
    println("Donam la alçada de la piscina")
    val alsada = scanner.nextDouble()
    if (llargaria >= 0 && amplada >= 0 && alsada >= 0 ) {
        val volumMetres = llargaria * amplada * alsada
        print("La piscina medeix un total de : $volumMetres m³ i ${volumMetres * 1000}")
    }else println("Numero no valid")

}