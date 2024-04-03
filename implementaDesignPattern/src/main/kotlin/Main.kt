package org.example
import org.example.com.samuelsoares.sanduicheira.Sanduiche
import org.example.com.samuelsoares.sanduicheira.SanduicheSimples

fun main() {

    val sanduiche: Sanduiche = SanduicheSimples()
    println(formataIgredientes(sanduiche.fazer()))

}

fun formataIgredientes(input: String): String {
    val sanduichePronto = StringBuilder()

    for (char in input) {
        if (char.isUpperCase() && char != input[0]) {
            sanduichePronto.append(", ")
        }
        sanduichePronto.append(char)
    }

    return sanduichePronto.toString()
}