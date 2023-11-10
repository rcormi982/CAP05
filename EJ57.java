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
**
*
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
*  *
* *
**
* */
public class EJ57 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <=altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if(i==1 || j==1 || i+j==altura+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
