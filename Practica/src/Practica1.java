import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        // 1. Presentación del juego (Ej. Bienvenido al juego tal)
        // 2. Presentación de los personajes: guerrero / mago / arquero
        // 3. Elección del personaje
        // 4. Aparece la figura ¿también barra de vida?
        // ¿Apartado de "estás seguro de tu elección?
        // 5. Crear un enemigo

        Scanner sc = new Scanner(System.in);
        String personaje;
        int vida, ataque, defensa;

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

        personaje = sc.nextLine();

        // PARA ASEGURARNOS DE QUE ELIJA UN PERSONAJE DE LOS PRESENTADOS
        while (!(personaje.equalsIgnoreCase("guerrero") || personaje.equalsIgnoreCase("mago") || personaje.equalsIgnoreCase("arquero"))) {
            System.out.println("Este personaje no se encuentra en el Reino. Tienes que elegir entre los presentados.");
            personaje = sc.nextLine();
        }
        System.out.println("Personaje elegido correctamente");

        // ASIGNAR LAS CARACTERISTICAS SEGUN EL PERSONAJE
        switch (personaje) {
            case "Guerrero":
                vida = 70;
                ataque = 80;
                defensa = 60;
                break;
            case "Mago":
                vida = 50;
                ataque = 60;
                defensa = 50;
                break;
            case "Arquero":
                vida = 60;
                ataque = 90;
                defensa = 40;
                break;
        }

        System.out.println("Tu personaje es: " + personaje);

        // Dibujo

        System.out.println("                    ____ \n" +
                "                  .'* *.'\n" +
                "               __/_*_*(_\n" +
                "              / _______ \\\n" +
                "             _\\_)/___\\(_/_ \n" +
                "            / _((\\- -/))_ \\\n" +
                "            \\ \\())(-)(()/ /\n" +
                "             ' \\(((()))/ '\n" +
                "            / ' \\)).))/ ' \\\n" +
                "           / _ \\ - | - /_  \\\n" +
                "          (   ( .;''';. .'  )\n" +
                "          _\\\"__ /    )\\ __\"/_\n" +
                "            \\/  \\   ' /  \\/\n" +
                "             .'  '...' ' )\n" +
                "              / /  |  \\ \\\n" +
                "             / .   .   . \\\n" +
                "            /   .     .   \\\n" +
                "           /   /   |   \\   \\\n" +
                "         .'   /    b    '.  '.\n" +
                "     _.-'    /     Bb     '-. '-._ \n" +
                " _.-'       |      BBb       '-.  '-. \n" +
                "(_________(______.dBBBb.________)____)");


        System.out.println();

    }
}
