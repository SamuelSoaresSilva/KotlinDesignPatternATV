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

/*
No contexto do padrão Decorator, temos os seguintes elementos:
Componente: É a interface comum para todos os objetos que podem ser decorados. No seu exemplo, a classe Sanduiche atua como o componente, definindo a interface básica para fazer um sanduíche.
Componente Concreto: É a implementação concreta do componente. Em seu código, a classe SanduicheSimples é um exemplo de componente concreto, pois implementa diretamente a interface Sanduiche e fornece uma implementação básica de fazer um sanduíche (apenas pão).
Decorator: É uma classe que implementa a interface do componente e contém uma instância do componente. O decorador pode adicionar comportamentos adicionais antes ou depois de chamar métodos do componente. Em seu código, as classes QueijoDecorator e PresuntoDecorator são exemplos de decoradores, pois estendem SanduicheDecorator e adicionam ingredientes extras (queijo e presunto) ao sanduíche.
Onde o SanduicheSimples se encaixa nisso:
SanduicheSimples atua como o componente concreto na hierarquia. Ele fornece a implementação básica de um sanduíche, que é apenas um pão. Este é o objeto base sobre o qual os decoradores podem ser aplicados.
Então, no padrão Decorator, o SanduicheSimples é o objeto inicial, o componente básico ao qual você adicionará funcionalidades extras usando os decoradores. Os decoradores envolvem o SanduicheSimples para adicionar os ingredientes adicionais e fornecer uma funcionalidade mais complexa.
*/
