package org.example.com.samuelsoares.decorators

import org.example.com.samuelsoares.componentes.Sanduiche

class PresuntoDecorator(sanduiche: Sanduiche): SanduicheDecorator(sanduiche) {

    private val recheio: String = "Presunto"
    override fun fazer(): String {
        return super.fazer()+" + "+ recheio
    }
}