package org.example
import org.example.com.samuelsoares.componentes.Sanduiche
import org.example.com.samuelsoares.componentes.SanduicheSimples
import org.example.com.samuelsoares.decorators.PresuntoDecorator
import org.example.com.samuelsoares.decorators.QueijoDecorator

fun main() {
    var sanduiche: Sanduiche = SanduicheSimples()
    println(sanduiche.fazer())

    sanduiche = QueijoDecorator(sanduiche)
    println(sanduiche.fazer())

    sanduiche = PresuntoDecorator(sanduiche)
    println(sanduiche.fazer())
}

//fun formataIgredientes(input: String): String {
//    val sanduichePronto = StringBuilder()
//
//    for (char in input) {
//        if (char.isUpperCase() && char != input[0]) {
//            sanduichePronto.append(", ")
//        }
//        sanduichePronto.append(char)
//    }
//
//    return sanduichePronto.toString()
//}