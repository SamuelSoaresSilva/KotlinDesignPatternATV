# Final code idea:

## com.samuelsoares.componentes
```
open class Sanduiche {

    open val pao: String = "Pão"

    open fun fazer(): String {

        return pao
    }
}
```
```
class SanduicheSimples : Sanduiche()
```
## com.samuelsoares.decorators
```
import componentes.Sanduiche

class SanduicheDecorator(private val sanduiche: Sanduiche): Sanduiche() {

    override fun fazer(): String {
        return super.fazer()
    }

}
```
```
class QueijoDecorator(sanduiche: Sanduiche): SanduicheDecorator(sanduiche) {
    
    val recheio: String = "Queijo"
    override fun fazer(): String {
        return super.fazer()+ " + " + recheio
    }
}
```
```
class PresuntoDecorator(sanduiche: Sanduiche): SanduicheDecorator(sanduiche) {

    private val recheio: String = "Presunto"
    override fun fazer(): String {
        return super.fazer()+" + "+ recheio
    }
}
```
## src.main.kotlin
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
## Console:
```  
Pão
Pão + Queijo
Pão + Presunto
```
