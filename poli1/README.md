# Ejercicio de Polimorfismo en Java

Ejercicio básico que muestra polimorfismo en Java usando una jerarquía de animales:
una clase abstracta `Animal`, varias subclases que implementan `hacerSonido()` cada una a su manera,
y un conjunto de interfaces (`ITerrestre`, `IVolador`, `IAcuatico`) que modelan las capacidades de movimiento de cada animal.

## Estructura

```
poli1/
├── Main.java
└── dominio/
    ├── Animal.java
    ├── ITerrestre.java
    ├── IVolador.java
    ├── IAcuatico.java
    ├── Perro.java
    ├── Gato.java
    ├── Vaca.java
    ├── Pajaro.java
    └── Pato.java
```

- `dominio/Animal.java` — clase abstracta base (paquete `dominio`).
- `dominio/ITerrestre.java` — interfaz con el método `caminar()`.
- `dominio/IVolador.java` — interfaz con el método `volar()`.
- `dominio/IAcuatico.java` — interfaz con el método `nadar()`.
- `dominio/Perro.java`, `Gato.java`, `Vaca.java` — subclases concretas que implementan `ITerrestre`.
- `dominio/Pajaro.java` — subclase concreta que implementa `IVolador` e `ITerrestre`.
- `dominio/Pato.java` — subclase concreta que implementa `IAcuatico`, `ITerrestre` e `IVolador`.
- `Main.java` — importa las clases de `dominio`, recorre un arreglo de tipo `Animal[]` y llama `hacerSonido()` polimórficamente.

## Diagrama de clases

```mermaid
classDiagram
    class Animal {
        <<abstract>>
        #String nombre
        +Animal(nombre: String)
        +getNombre() String
        +hacerSonido()* String
        +cagar() void
    }

    class ITerrestre {
        <<interface>>
        +caminar() void
    }

    class IVolador {
        <<interface>>
        +volar() void
    }

    class IAcuatico {
        <<interface>>
        +nadar() void
    }

    class Perro {
        +Perro(nombre: String)
        +hacerSonido() String
        +caminar() void
    }

    class Gato {
        +Gato(nombre: String)
        +hacerSonido() String
        +caminar() void
    }

    class Vaca {
        +Vaca(nombre: String)
        +hacerSonido() String
        +caminar() void
    }

    class Pajaro {
        +Pajaro(nombre: String)
        +hacerSonido() String
        +volar() void
        +caminar() void
    }

    class Pato {
        +Pato(nombre: String)
        +hacerSonido() String
        +volar() void
        +caminar() void
        +nadar() void
    }

    class Main {
        +main(args: String[]) void
    }

    Animal <|-- Perro
    Animal <|-- Gato
    Animal <|-- Vaca
    Animal <|-- Pajaro
    Animal <|-- Pato

    ITerrestre <|.. Perro
    ITerrestre <|.. Gato
    ITerrestre <|.. Vaca
    ITerrestre <|.. Pajaro
    ITerrestre <|.. Pato
    IVolador <|.. Pajaro
    IVolador <|.. Pato
    IAcuatico <|.. Pato

    Main ..> Animal : usa
```

## Ejecutar

```bash
javac dominio/*.java Main.java
java Main
```

### Salida esperada

```
Firulais dice: Guau guau y 
Estoy cagando
Michi dice: Miau y 
Estoy cagando
Lola dice: Muu y 
Estoy cagando
Donald dice: Cuac y 
Estoy cagando
```
