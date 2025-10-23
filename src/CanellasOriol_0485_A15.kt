
import java.util.Scanner

fun main(){
    val lector = Scanner(System.`in`)
    var validacio: Boolean
    var numero: Int = 0
    var contadorpartidas = 0 //totes les partidas
    var contadorpartidasG = 0 //Partidas guanyadas
    var contadorpartidasP = 0 //partidas perdudes
    var contadorpartidasE = 0 //partidas empatadas
    println("Benbingut a pedra, paper, tisora, llangardaix, spock \n" +
    "Les opcions son les seguents: \n"+
    "0) Sortir del joc\n" +
    "1) Pedra\n" +
    "2) Paper\n" +
    "3) Tisora\n" +
    "4) Llangardaix\n" +
    "5) Spock\n")
    do {
        do {
            println("Donam un numero enter")
            if (lector.hasNextInt()){
                numero = lector.nextInt()
                if (numero < 0 || numero > 5){
                    println("El numero introduit($numero) no es cap opcio del joc")
                    validacio = false
                }else validacio = true
            }else {
                val OpcioNoValida = lector.next()
                println("O sentim pero la seva opcio($OpcioNoValida) no es un numero enter")
                validacio = false
            }
        }while (!validacio)
        var numeroIA = (1..5).random()
        //println(numeroIA) //Chivato
        when(numero) {
            1 -> {
                contadorpartidas ++
                if (numeroIA == numero){
                    println("Jugador a tret Pedra\n"+
                            "IA a tret Pedra\n"+
                            "Empat")
                    contadorpartidasE ++
                }else if(numeroIA == 2){
                    println("Jugador a tret Pedra\n"+
                            "IA a tret Paper\n"+
                            "IA Guanya")
                    contadorpartidasP ++
                }else if(numeroIA == 3){
                    println("Jugador a tret Pedra\n"+
                            "IA a tret Tisores\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }else if(numeroIA == 4){
                    println("Jugador a tret Pedra\n"+
                            "IA a tret Llengardaix\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }else {
                    println("Jugador a tret Pedra\n"+
                            "IA a tret Spock\n"+
                            "IA Guanya")
                    contadorpartidasP ++
                }
            }
            2 -> {
                contadorpartidas ++
                if (numeroIA == numero){
                    println("Jugador a tret Paper\n"+
                            "IA a tret Paper\n"+
                            "Empat")
                    contadorpartidasE ++
                }else if(numeroIA == 1){
                    println("Jugador a tret Paper\n"+
                            "IA a tret Pedra\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }else if(numeroIA == 3){
                    println("Jugador a tret Paper\n"+
                            "IA a tret Tisores\n"+
                            "Ia Guanya")
                    contadorpartidasP ++
                }else if(numeroIA == 4){
                    println("Jugador a tret Paper\n"+
                            "IA a tret Llengardaix\n"+
                            "IA Guanya")
                    contadorpartidasP ++
                }else {
                    println("Jugador a tret Paper\n"+
                            "IA a tret Spock\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }
            }
            3 -> {
                contadorpartidas ++
                if (numeroIA == numero){
                    println("Jugador a tret Tisores\n"+
                            "IA a tret Tisores\n"+
                            "Empat")
                    contadorpartidasE ++
                }else if(numeroIA == 1){
                    println("Jugador a tret Tisores\n"+
                            "IA a tret Pedra\n"+
                            "IA Guanya")
                    contadorpartidasP ++
                }else if(numeroIA == 2){
                    println("Jugador a tret Tisores\n"+
                            "IA a tret Paper\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }else if(numeroIA == 4){
                    println("Jugador a tret Tisores\n"+
                            "IA a tret Llengardaix\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }else {
                    println("Jugador a tret Tisores\n"+
                            "IA a tret Spock\n"+
                            "IA Guanya")
                    contadorpartidasP ++
                }
            }
            4 -> {
                contadorpartidas ++
                if (numeroIA == numero){
                    println("Jugador a tret Llengardaix\n"+
                            "IA a tret Llengardaix\n"+
                            "Empat")
                    contadorpartidasE ++
                }else if(numeroIA == 1){
                    println("Jugador a tret Llengardaix\n"+
                            "IA a tret Pedra\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }else if(numeroIA == 2){
                    println("Jugador a tret Llengardaix\n"+
                            "IA a tret Paper\n"+
                            "Ia Guanya")
                    contadorpartidasP ++
                }else if(numeroIA == 3){
                    println("Jugador a tret Llengardaix\n"+
                            "IA a tret Tisores"+
                            "IA Guanya")
                    contadorpartidasP ++
                }else {
                    println("Jugador a tret Paper\n"+
                            "IA a tret Spock\n"+
                            "Jugador Guanya")
                    contadorpartidasG ++
                }
            }
            }

    } while (numero != 0)

}