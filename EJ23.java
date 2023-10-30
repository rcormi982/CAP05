package Capitulo5;

import java.util.Scanner;

/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */
public class EJ23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa que calcula la suma de números introducidos hasta 10000 que es cuando para");
        System.out.print("Por favor vaya introduciendo números: ");

        double numero;
        double suma = 0;
        int contador = 0;
        do {
            numero = s.nextDouble();
            suma+=numero;
            contador++;
        } while (suma<=10000);
        System.out.println("El total acumulado es = " + suma);
        System.out.println("El número total de números introducidos es = " + contador);
        System.out.println("La media de los números = " + (double)(suma/contador));

        s.close();
    }    
}
