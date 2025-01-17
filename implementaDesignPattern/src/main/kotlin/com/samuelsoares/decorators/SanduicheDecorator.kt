package org.example.com.samuelsoares.decorators

import org.example.com.samuelsoares.componentes.Sanduiche

/************************
 *    Decorator Base    *
 ************************/
open class SanduicheDecorator(private val sanduiche: Sanduiche): Sanduiche() {

    override fun fazer(): String {
        return super.fazer()
    }

}