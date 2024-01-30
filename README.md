# Adivina el Número - Guess the Number

## Índice
1. [Resumen](#1-resumen)
2. [Archivos](#2-archivos)
3. [Cómo Ejecutar](#3-cómo-ejecutar)
4. [Jugabilidad](#4-jugabilidad)
5. [Códigos de Colores](#5-códigos-de-colores)
6. [Objetivos de Aprendizaje](#6-objetivos-de-aprendizaje)
7. [Nota](#7-nota)
8. [Diviértete Jugando](#8-diviértete-jugando)


## 1. Resumen

Este proyecto implementa un sencillo juego de adivinanzas de números basado en la consola en Java. El juego involucra a dos jugadores: un jugador humano y un jugador de computadora. El objetivo es que los jugadores adivinen un número generado aleatoriamente entre 1 y 100.


## 2. Archivos

1. **GuessTheNumberGame.java:** La clase principal que orquesta el juego. Incluye métodos para generar un número aleatorio, jugar el juego y mostrar el historial de suposiciones.

2. **ComputerPlayer.java:** Una clase que representa al jugador de computadora. Extiende la clase abstracta `Player` e implementa el método `makeGuess` para generar una suposición aleatoria.

3. **HumanPlayer.java:** Una clase que representa al jugador humano. También extiende la clase `Player` e incluye métodos para ingresar el nombre del jugador y hacer una suposición.

4. **Player.java:** Una clase abstracta que sirve como clase base tanto para jugadores humanos como para jugadores de computadora. Incluye métodos para obtener y establecer el nombre del jugador, así como para gestionar el historial de suposiciones.

5. **GuessTheNumberGameTest.java:** Pruebas JUnit para el proyecto. Incluye pruebas para generar un número aleatorio, recuperar nombres de jugadores y evaluar suposiciones de jugadores.


## 3. Cómo Ejecutar
Para compilar y ejecutar GuessTheNumberGame, sigue estos pasos:

```bash
javac src/GuessTheNumberGame.java
java -cp . src.GuessTheNumberGame
```

Para ejecutar las pruebas JUnit, utiliza el siguiente comando:

```bash
java -cp "lib/junit-platform-console-standalone-1.10.1.jar;$(pwd)\src;$(pwd)\test" org.junit.platform.console.ConsoleLauncher --scan-classpath
```


## 4. Jugabilidad

1. El juego comienza dando la bienvenida a los jugadores a GuessTheNumber.
2. Se genera un número aleatorio entre 1 y 100.
3. Se solicita al jugador que ingrese su nombre.
4. Los jugadores se turnan para adivinar el número.
5. El juego proporciona comentarios sobre si la suposición es demasiado alta, demasiado baja o correcta.
6. El juego termina cuando uno de los jugadores adivina correctamente el número.
7. El historial de suposiciones se muestra al final del juego.


## 5. Códigos de Colores

- **Rojo:** Texto resaltado y mensajes de error.
- **Verde:** Retroalimentación positiva.
- **Amarillo:** Mensajes y indicaciones especiales.
- **Morado:** Indicaciones de entrada.
- **Cyan:** Nombres de jugadores.
- **Blanco:** Texto general.


## 6. Objetivos de Aprendizaje

### Java

- [ ] **Datos primitivos vs no primitivos**

- [ ] **Cadenas**

- [ ] **Arreglos**

- [ ] **Modificadores de acesso (public, private, protected)**

- [ ] **Uso de condicionales**

- [ ] **Uso de bucles (Loops)**

- [ ] **ArrayList**

- [ ] **JUnit**

- [ ] **Mockito**

### Programación Orientada a Objetos (OOP)

- [ ] **Clases**

- [ ] **Objetos**

- [ ] **Métodos**

- [ ] **Atributos**

- [ ] **Constructores**

- [ ] **Encapsulamiento**

- [ ] **Abstracción**

- [ ] **Composición**

- [ ] **Interfaces**

- [ ] **Herencia (super, extends, override)**

- [ ] **Lenguaje de Modelado Unificado (UML, class diagrams)**


## 7. Nota
- Asegúrate de que la biblioteca JUnit requerida esté incluida en el classpath para ejecutar las pruebas.


## 8. Diviértete Jugando

**_¡Diviértete jugando a GuessTheNumber!! 🎲🎮_**


 /\_/\
( o.o ) 
 > ^ <  