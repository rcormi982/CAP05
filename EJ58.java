package Capitulo5;

import java.util.Scanner;

/*Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado.
Ejemplo 1:
Introduzca un número: 609831
La media de sus dígitos es 4.5
Ejemplo 2:
Introduzca un número: 78201345
La media de sus dígitos es 3.75
Ejemplo 3:
Introduzca un número: 24
La media de sus dígitos es 3.0
Ejemplo 4:
Introduzca un número: 8
La media de sus dígitos es 8.0 */
public class EJ58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numeroIntroducido = s.nextLong();
        int suma = 0;
        int longitud = 0;

        while (numeroIntroducido !=0) {
            suma += numeroIntroducido % 10;
            numeroIntroducido /= 10;
            longitud++;
        }
        System.out.println("La media de sus dígitos es " + (double)suma / longitud);

        s.close();
    }
}
