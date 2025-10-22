package org.example.Exercicis_inicials_2
import java.util.Scanner

/*
Fes un programa que demani un número enter major que 1 a l'usuari i digui si el nombre és primer o no. Després, ens dirà quin és el nombre primer immediatament superior.
 */
fun main(){
    val lector = Scanner(System.`in`)
    var validacio: Boolean
    var numero: Int = 1
    var contador: Int
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
    var numinc = numero + 1
    do {
        contador = 0
        for (x in 1..numinc) {
            if (numinc % x == 0) contador ++
        }
        if (contador == 2)
            validacio = true
        else{
            numinc = numinc + 1
            validacio = false
        }
    }while (!validacio)
    contador = 0
    for (x in 1..numero) {
        if (numero % x == 0) contador ++
    }
    if (contador == 2)
        println("$numero és primer. El primer immediatament superior a $numero és el $numinc")
    else println("$numero no és primer. El primer immediatament superior a $numero és el $numinc")

}
