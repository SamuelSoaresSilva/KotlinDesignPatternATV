package org.example.com.samuelsoares.componentes

/********************
 * interface básica *
 ********************/
open class Sanduiche {

    open val pao: String = "Pão"

    open fun fazer(): String {

        return pao
    }
}

