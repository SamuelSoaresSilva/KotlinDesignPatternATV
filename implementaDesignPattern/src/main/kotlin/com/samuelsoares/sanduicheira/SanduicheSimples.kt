package org.example.com.samuelsoares.sanduicheira

class SanduicheSimples : Sanduiche() {

    val recheio: String = "Queijo Carne Molho "

    override fun fazer(): String {

        val receita: String = pao + recheio + pao

        return receita
    }

}