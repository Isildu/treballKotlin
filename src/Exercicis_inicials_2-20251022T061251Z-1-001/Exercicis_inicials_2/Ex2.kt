package Exercicis_inicials_2
import java.util.*
import kotlin.math.*

/*
Escriu un programa que presenti el següent menú d’opcions relacionades amb les propietats dels triangles i que permeti resoldre les operacions indicades.
 */
fun main() {
    val lector = Scanner(System.`in`)
    var validacio: Boolean
    var a: Double
    var b: Double
    var c: Double
    println("Menu de opcions:")
    println("Opcio 1: Introdueix la longitud del triangle")
    println("Opcio 2: Comprobar si es un triangle rectangle")
    println("Opcio 3: Classifica l’últim triangle vàlid en equilàter, isòsceles o escalè.")
    println("Opcio 4: Calcular perímetre i àrea")
    println("Opcio 0: Sortir")
    do {
        println("Introdueix el numero corresponent a la opcio que vulguis començar")
        var opcio = lector.nextInt()
        when {
            opcio == 1 -> {
                    do {
                        do {
                            println("Donam la longitud del primer costat")
                            a = lector.nextDouble()
                            println("Donam la longitud del segon costat")
                            b = lector.nextDouble()
                            println("Donam la longitud del tercer costat")
                            c = lector.nextDouble()
                            if (a > 0 && b > 0 && c > 0) {
                                validacio = true
                            } else {
                                println("ERROR: Un dels costats te longitud negativa o en zero")
                                validacio = false
                            }
                        }while ( validacio == false)
                        if ((a - c) < b && b < (a+c)){
                            validacio = true
                        } else {
                            validacio = false
                            println("o sento pero els numeros introduits no poden fotmar part de un triangle")
                        }
                    }while (validacio == false)
                    do {
                        println("Introdueix el numero corresponent a la opcio que vulguis començar")
                        opcio = lector.nextInt()
                        when{
                            opcio == 1 -> {
                                do {
                                    do {
                                        println("Donam la longitud del primer costat")
                                        a = lector.nextDouble()
                                        println("Donam la longitud del segon costat")
                                        b = lector.nextDouble()
                                        println("Donam la longitud del tercer costat")
                                        c = lector.nextDouble()
                                        if (a > 0 && b > 0 && c > 0) {
                                            validacio = true
                                        } else {
                                            println("ERROR: Un dels costats te longitud negativa o en zero")
                                            validacio = false
                                        }
                                    }while ( validacio == false)
                                    if ((a - c) < b && b < (a+c)){
                                        validacio = true
                                    } else {
                                        validacio = false
                                        println("o sento pero els numeros introduits no poden fotmar part de un triangle")
                                    }
                                }while (validacio == false)
                            }
                            opcio == 2 ->{
                                if(a * a == b * b  + c * c){
                                    println("Tens un triangle rectangle")
                                }else{
                                    println("No tens un triangle rectangle")
                                }
                            }
                            opcio == 3 ->{
                                if (a == b && b == c){
                                    println("El teu triangle es equilàter")
                                }else if (a != b && b != c && a != c){
                                    println("El teu triangle es escalè")
                                }else{
                                    println("El teu triangle es isòsceles")
                                }
                            }
                            opcio == 4 -> {
                                val P = a + b + c //Perimetre
                                val SP = P /2 //SemiPerimetre
                                val A = sqrt(SP *((SP - a)*(SP - b)*(SP - c))) //Area
                                println("El perimetre del teu triangle es $P i la seva area es $A")
                            }
                            opcio > 4 || opcio < 0 -> println("numero no corresponetn a cap opcio")
                        }
                    }while (opcio != 0)
            }
            opcio in 2..4 -> println("la opcio $opcio no es valida fins que se inici la 1")
            opcio > 4 || opcio < 0 -> println("numero no corresponetn a cap opcio")
        }
    }while (opcio != 0)
    println("Adeu")
}