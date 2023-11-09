package Capitulo5;
/*Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
Ejemplo 1:
Introduzca la altura de la figura: 8
********
*******
******
*****
****
***
**
*
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
****
***
**
* */
public class EJ53 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura del triángulo: ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < altura-i; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
