package org.example.com.samuelsoares.decorators

import org.example.com.samuelsoares.componentes.Sanduiche

/*******************
 *    Decorator    *
 *******************/
class QueijoDecorator(sanduiche: Sanduiche): SanduicheDecorator(sanduiche) {
    val recheio: String = "Queijo"
    override fun fazer(): String {
        return super.fazer()+ " + " + recheio
    }
}