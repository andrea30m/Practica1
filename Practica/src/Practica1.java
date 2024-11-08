import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        // 1. Presentación del juego (Ej. Bienvenido al juego tal)
        // 2. Presentación de los personajes: guerrero / mago / arquero
        // 3. Elección del personaje
        // 4. Aparece la figura ¿también barra de vida?
        // ¿Apartado de "estás seguro de tu elección?
        // 5. Crear un enemigo

        // Declaración de Scanner y variables
        Scanner sc = new Scanner(System.in);
        String personaje, dibujo = "";
        int vida, ataque, defensa, vida_enemigo, ataque_enemigo, defensa_enemigo;

        // Presentación del juego
        System.out.println("Bienvenido/a a JavaQuest: Un nuevo comienzo");
        System.out.println("En este juego te enfrentarás al peor enemigo del Reino Aetheria");
        System.out.println("¿Estás preparado?");
        System.out.println("El primer paso será elegir tu personaje entre las siguientes opciones:");
        System.out.println("****************************************");
        System.out.println("*                Vida  Ataque  Defensa *");
        System.out.println("* 1. Guerrero:    70     80       60   *");
        System.out.println("* 2. Mago:        50     60       90   *");
        System.out.println("* 3. Arquero:     80     50       40   *");
        System.out.println("****************************************");
        System.out.println("¿En quién te quieres convertir?");

        // Usuario decide el personaje. Convertimos a minúsculas para que no haya problemas
        personaje = sc.nextLine().toLowerCase();

        // Controlar que elija correctamente un personaje de los disponibles
        while (!(personaje.equals("guerrero") || personaje.equals("mago") || personaje.equals("arquero"))) {
            System.out.println("Este personaje no se encuentra en el Reino. Tienes que elegir entre los presentados.");
            personaje = sc.nextLine();
        }
        System.out.println("Personaje elegido correctamente");

        // Asignar las características segun el personaje
        switch (personaje) {
            case "guerrero":
                vida = 70;
                ataque = 80;
                defensa = 60;
                dibujo = "(Dibujo guerrero)"; // Agregar aquí el dibujo https://www.asciiart.eu/
                break;
            case "mago":
                vida = 50;
                ataque = 60;
                defensa = 50;
                dibujo = "(Dibujo mago)"; // Agregar aquí el dibujo https://www.asciiart.eu/
                break;
            case "arquero":
                vida = 60;
                ataque = 90;
                defensa = 40;
                dibujo = "(Dibujo arquero)"; // Agregar aquí el dibujo https://www.asciiart.eu/
                break;
        }

        // Mostrar personaje elegido
        System.out.println("Tu personaje es: " + personaje);
        System.out.println(dibujo);

        // ENEMIGO: con % de características aleatorias
        vida_enemigo = (int) (Math.random()*51) + 50;  // Numero aleatorio entre 50 y 100
        ataque_enemigo = (int) (Math.random()*51) + 50;
        defensa_enemigo = (int) (Math.random()*51) + 50;

        System.out.println("Tu enemigo es un Troll con las siguientes características:");
        System.out.println("***************************");
        System.out.println("* Vida: " + vida_enemigo + "                *");
        System.out.println("* Ataque: " + ataque_enemigo + "              *");
        System.out.println("* Defensa: " + defensa_enemigo + "             *");
        System.out.println("***************************");
    }
}
