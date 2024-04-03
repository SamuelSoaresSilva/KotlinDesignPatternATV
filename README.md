# Final code idea:

## package componentes
```
open class Sanduiche {
    open fun fazer(): String {
        return "Pão"
    }
}
```
```
class SanduicheSimples : Sanduiche()
```
## package decorators
```
import componentes.Sanduiche

open class SanduicheDecorator(private val sanduiche: Sanduiche) : Sanduiche() {
    override fun fazer(): String {
        return sanduiche.fazer()
    }
}
```
```
class QueijoDecorator(sanduiche: Sanduiche) : SanduicheDecorator(sanduiche) {

    override fun fazer(): String {
        return super.fazer() + " + Queijo"
        
    }
}
```
```
class PresuntoDecorator(sanduiche: Sanduiche) : SanduicheDecorator(sanduiche) {

    override fun fazer(): String {
        return super.fazer() + " + Presunto"
    }
    
}
```
## package main
```
import componentes.SanduicheSimples
import decorators.QueijoDecorator
import decorators.PresuntoDecorator

fun main() {

    var sanduiche: Sanduiche = SanduicheSimples()
    println(sanduiche.fazer())

    sanduiche = QueijoDecorator(sanduiche)
    println(sanduiche.fazer())

    sanduiche = PresuntoDecorator(sanduiche)
    println(sanduiche.fazer())
  }
```  
