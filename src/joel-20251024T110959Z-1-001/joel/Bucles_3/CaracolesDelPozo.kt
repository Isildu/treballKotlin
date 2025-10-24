package `joel-20251024T110959Z-1-001`.joel.Bucles_3

import java.util.Scanner
var lector = Scanner(System.`in`)
fun main(){
    var repeticions = comprovacio2()
    repeat(repeticions){
        var contador = 0
        var profunditat = comprovacio2()
        var pujada = comprovacio1()
        var caiguda = comprovacio1()
        if ((pujada - caiguda)> 0){
            do {
                if ((profunditat - pujada) >0)
            }while (profunditat > 0)
            println(contador)
        }else println("NO")
    }
}

fun comprovacio1(): Int{
    var numero: Int = 0
    var validacio: Boolean
    do {
        println("Donam un numero: ")
        if (lector.hasNextInt()){
            numero = lector.nextInt()
            if (numero >= 0 && numero <= 999){
                validacio = true
            }else {
                println("numero introduit es inferior a 0 o superior a 999 lo que no esta permes")
                validacio = false
            }
        }else{
            val opcio = lector.next()
            println("A introduit una opcio no valida ($opcio), introdueix un numero enter")
            validacio = false
        }
    }while (!validacio)
    return numero
}

fun comprovacio2(): Int{
    var numero: Int = 0
    var validacio: Boolean
    do {
        println("Donam un numero: ")
        if (lector.hasNextInt()){
            numero = lector.nextInt()
            if (numero > 0 && numero <= 999){
                validacio = true
            }else {
                println("numero introduit es inferior a 1 o superior a 999 lo que no esta permes")
                validacio = false
            }
        }else{
            val opcio = lector.next()
            println("A introduit una opcio no valida ($opcio), introdueix un numero enter")
            validacio = false
        }
    }while (!validacio)
    return numero
}