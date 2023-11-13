package Capitulo5;
/*Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
Ejemplo 1:
Introduzca un número: 772
El 772 es un número afortunado.
Ejemplo 2:
Introduzca un número: 7720
El 7720 no es un número afortunado.
Ejemplo 3:
Introduzca un número: 43081
El 43081 no es un número afortunado.
Ejemplo 4:
Introduzca un número: 888
El 888 es un número afortunado.
Ejemplo 5:
Introduzca un número: 1234
El 1234 no es un número afortunado.
Ejemplo 6:
Introduzca un número: 6789
El 6789 es un número afortunado. */

import java.util.Scanner;

public class EJ62 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numeroIntroducido = Long.parseLong(s.nextLine());
        long duplicado = numeroIntroducido;
        int afortunados = 0;
        int noAfortunados = 0;

        while (numeroIntroducido > 0) {
            int digito = (int)(numeroIntroducido % 10);
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afortunados++;
            } else {
                noAfortunados++;
            }
        numeroIntroducido /= 10;
        }
        if (afortunados > noAfortunados) {
            System.out.println("El " + duplicado + " es un número afortunado.");
        } else {
            System.out.println("El " + duplicado + " no es un número afortunado.");
        }

        s.close();
    }
}
    

