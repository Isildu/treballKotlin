package Exercicis_inicials_2
import java.util.Scanner

/*
Escriu un programa que llegeixi una data de naixement i ens digui el signe zodiacal corresponent. Has d’assegurar-te que l’usuari introdueix una data de naixement correcta.
 */
fun main(){
    var lector = Scanner(System.`in`)
    println("Donam el numero de dia que vas neixer")
    var dia = lector.nextInt()
    println("Donam el numero de mes que vas neixer")
    var mes = lector.nextInt()
    println("Donam el numero de any que vas neixer")
    var any = lector.nextInt()
    if ((dia in 1..31) && (mes in 1..12) && any > 0) {
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31){
            println("El mes $mes no te 31 dies")
            main()
        } else if (mes == 2 && dia > 28){
            if((dia == 29 && (any % 4 != 0 ) || (any % 4 == 0 && any % 100 == 0 && any % 400 != 0)) || dia > 29){
                println("El mes $mes no te mes de 29 dies i en cas de haver introduit 29 dies el any $any no pot tenir 29 dies")
                main()
            }
        }
    }
    else {
        println("Haver has introduit la data: $dia/$mes/$any i aixo es imposible. Torna a intentar")
        main()
    }
    when {
        mes == 3 && dia > 20 || mes == 4 && dia < 20 -> println("Ets Àries")
        mes == 4 && dia > 19 || mes == 5 && dia < 21 -> println("Ets Taure")
        mes == 5 && dia > 20 || mes == 6 && dia < 21 -> println("Ets Gèminis")
        mes == 6 && dia > 20 || mes == 7 && dia < 23 -> println("Ets Càncer")
        mes == 7 && dia > 22 || mes == 8 && dia < 23 -> println("Ets Lleó")
        mes == 8 && dia > 22 || mes == 9 && dia < 23 -> println("Ets Verge")
        mes == 9 && dia > 22 || mes == 10 && dia < 23 -> println("Ets Balança")
        mes == 10 && dia > 22 || mes == 11 && dia < 22 -> println("Ets Escorpió")
        mes == 11 && dia > 21 || mes == 12 && dia < 22 -> println("Ets Sagitari")
        mes == 12 && dia > 21 || mes == 1 && dia < 20 -> println("Ets Capricorn")
        mes == 1 && dia > 19 || mes == 2 && dia < 19 -> println("Ets Aquari")
        mes == 2 && dia > 18 || mes == 11 && dia < 21 -> println("Ets Peixos")
    }
}