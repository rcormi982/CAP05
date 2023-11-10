package Capitulo5;

import java.util.Scanner;

/*Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual.
Ejemplo 1:
Introduzca un número: 609831
El número resultado es 160983
Ejemplo 2:
Introduzca un número: 78201345
El número resultado es 57820134
Ejemplo 3:
Introduzca un número: 24
El número resultado es 42
Ejemplo 4:
Introduzca un número: 8
El número resultado es 8 */
public class EJ55 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numeroIntroducido = s.nextLong();
        long numero = numeroIntroducido;
        int longitud = 0;

        while (numero>0) {
            numero /=10;
            longitud++;
        }
        int ultimo = (int)(numeroIntroducido % 10);
        long aux = numeroIntroducido / 10;
        long resultado = ultimo * (long)Math.pow(10, longitud - 1) + aux;

        System.out.printf("El número resultado es: %d", resultado);

        s.close();

    }
}
