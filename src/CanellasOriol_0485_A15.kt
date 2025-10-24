
import java.util.Scanner

fun main(){
    val lector = Scanner(System.`in`)
    var validacio: Boolean
    var numero: Int = 0
    var contadorpartidas = 0.0 //totes les partidas
    var contadorpartidasG = 0.0  //Partidas guanyadas
    var contadorpartidasP = 0.0  //partidas perdudes
    var contadorpartidasE = 0.0  //partidas empatadas
    var contadorPedraJ = 0.0  //partidas del jugador amb pedra
    var contadorPaperJ = 0.0  //partidas del jugador amb paper
    var contadorTisoresJ = 0.0  //partidas del jugador amb tisores
    var contadorLlengardaixJ = 0.0  //partidas del jugador amb Llengardaix
    var contadorSpockJ = 0.0  //partidas del jugador amb Spock
    var contadorPedraIA = 0.0  //partidas del IA amb pedra
    var contadorPaperIA = 0.0  //partidas del IA amb paper
    var contadorTisoresIA = 0.0  //partidas del IA amb tisores
    var contadorLlengardaixIA = 0.0  //partidas del IA amb Llengardaix
    var contadorSpockIA = 0.0  //partidas del IA amb Spock
    println("Benbingut a pedra, paper, tisora, llangardaix, spock \n" +
    "Les opcions son les seguents: \n"+
    "1) Pedra\n" +
    "2) Paper\n" +
    "3) Tisora\n" +
    "4) Llangardaix\n" +
    "5) Spock\n")
    do {
        var numeroIA = (1..5).random()
        println(numeroIA) //Chivato
        do {
            println("Donam un numero enter")
            if (lector.hasNextInt()){
                numero = lector.nextInt()
                if (numero < 1 || numero > 5){
                    println("El numero introduit($numero) no es cap opcio del joc")
                    validacio = false
                }else validacio = true
            }else {
                val OpcioNoValida = lector.next()
                println("O sentim pero la seva opcio($OpcioNoValida) no es un numero enter")
                validacio = false
            }
        }while (!validacio)
        contadorpartidas ++
        when(numero){
            1->{println("Has tret pedra: \uD83E\uDEA8")
            contadorPedraJ ++}
            2->{println("Has tret paper: \uD83D\uDCC3")
            contadorPaperJ ++}
            3->{println("Has tret tisores: ✂\uFE0F")
            contadorTisoresJ ++}
            4->{println("Has tret llengardaix: \uD83E\uDD8E")
            contadorLlengardaixJ ++}
            5->{println("Has tret Spock: \uD83D\uDD96")
            contadorSpockJ ++}
        }
        when(numeroIA){
            1->{println("IA a tret pedra: \uD83E\uDEA8")
            contadorPedraIA ++}
            2->{println("IA a tret paper: \uD83D\uDCC3")
            contadorPaperIA ++}
            3->{println("IA a tret tisores: ✂\uFE0F")
            contadorTisoresIA ++}
            4->{println("IA a tret llengardaix: \uD83E\uDD8E")
            contadorLlengardaixIA ++}
            5->{println("IA a tret Spock: \uD83D\uDD96")
            contadorSpockIA ++}
        }
        when{
            numero == numeroIA ->{println("Empat")
            contadorpartidasE ++}
            numero == 1 && (numeroIA == 3 || numeroIA == 4) -> {println("Has guanyat")
                contadorpartidasG ++}
            numero == 2 && (numeroIA == 1 || numeroIA == 5) -> {println("Has guanyat")
                contadorpartidasG ++}
            numero == 3 && (numeroIA == 2 || numeroIA == 4) -> {println("Has guanyat")
                contadorpartidasG ++}
            numero == 4 && (numeroIA == 2 || numeroIA == 5) -> {println("Has guanyat")
                contadorpartidasG ++}
            numero == 5 && (numeroIA == 1 || numeroIA == 3) -> {println("Has guanyat")
                contadorpartidasG ++}
            else ->{println("Has perdut")
                contadorpartidasP ++}
        }
        do {
            println("vols continuar (s/n): ")
            var repeticio = lector.next()
            if (repeticio == "s"){
                validacio = true
            }else if (repeticio == "n"){
                validacio = true
                numero = 0
            }else {
                println("Opcio no es ni Si (s) ni No (n)")
                validacio = false
            }
        }while (!validacio)
        println(numero)
    } while (numero != 0)
    println("Has jugat un total de $contadorpartidas partidas\n"+
    "Has guanyat el ${(contadorpartidasG/contadorpartidas) * 100}% de les partidas \n"+
    "Has perdut el ${(contadorpartidasP/contadorpartidas) * 100}% de les partidas\n"+
    "Has empatat el ${(contadorpartidasE/contadorpartidas) * 100}% de les partidas \n")
    println("Jugadas teves: \n"+
    "Has utilitzat la pedra el ${(contadorPedraJ / contadorpartidas) * 100}% de les partidas\n" +
    "Has utilitzat el paper el ${(contadorPaperJ / contadorpartidas) * 100}% de les partidas\n"+
    "Has utilitzat las tisores el ${(contadorTisoresJ / contadorpartidas) * 100}% de les partidas\n"+
    "Has utilitzat el llengardaix el ${(contadorLlengardaixJ / contadorpartidas) * 100}% de les partidas\n"+
    "Has utilitzat Spock el ${(contadorSpockJ / contadorpartidas) * 100}% de les partidas\n")
    println("Jugadas IA: \n"+
            "IA a utilitzat la pedra el ${(contadorPedraIA / contadorpartidas) * 100}% de les partidas\n" +
            "IA a utilitzat el paper el ${(contadorPaperIA / contadorpartidas) * 100}% de les partidas\n"+
            "IA a utilitzat las tisores el ${(contadorTisoresIA / contadorpartidas) * 100}% de les partidas\n"+
            "IA a utilitzat el llengardaix el ${(contadorLlengardaixIA / contadorpartidas) * 100}% de les partidas\n"+
            "IA a utilitzat Spock el ${(contadorSpockIA / contadorpartidas) * 100}% de les partidas\n")
}