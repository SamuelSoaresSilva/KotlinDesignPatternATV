package org.example.com.samuelsoares.sanduicheira

open class Sanduiche {

    open val pao: String = "Pão"

    open fun fazer(): String {

        return pao + pao
    }
}

