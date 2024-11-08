package ejerciciosIniciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // EJERCICIO 1: Pide dos números y muestra la suma, resta, multiplicación y división de ambos
        int num1, num2, suma, resta, multi, divi;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La división es: " + divi);
    }
}
