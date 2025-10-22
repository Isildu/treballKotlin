package org.example.Exercicis_inicials_2
import java.util.Scanner
/*
Fes un programa que demani dos enters positius i que determini si són amics.
 */
val lector = Scanner(System.`in`)
fun main(){
    var contadorA = 0
    var contadorB = 0
    val a = validacio()
    val b = validacio()
    for (x in 1..a - 1) {
        if (a % x == 0) contadorA  = x + contadorA
    }
    for (x in 1..b - 1) {
        if (b % x == 0) contadorB  = x + contadorB
    }
    if (contadorA == contadorB) println("Son amics")
    else println("No son amics")
}

fun validacio(): Int{
    var validacio: Boolean
    var numero: Int = 0
    do {
        println("Donam un numero enter")
        if (lector.hasNextInt()) {
            numero = lector.nextInt()
            if (numero <= 1){
                println("Ha de introduir un numero positiu i superior a 1")
                validacio = false
            }else validacio = true
        } else {
            val OpcioNoValida = lector.next()
            println("O sentim pero la seva opcio($OpcioNoValida) no es un numero enter")
            validacio = false
        }
    }while (!validacio)
    return numero
}