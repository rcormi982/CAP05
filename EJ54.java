package Capitulo5;
/*Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
Ejemplo 1:
Introduzca la altura de la figura: 8
********
*     *
*    *
*   *
*  *
* *
* 
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
*  *
* *
**
* */
public class EJ54 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura del triángulo: ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = altura; i > 0; i--) {
            for (int j = 0 ; j < i; j++) {
                if (j == 0 || j == i-1 || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
