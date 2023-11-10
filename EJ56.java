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
public class EJ56 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = altura; i >=1 ; i--) {
            for (int j = 1; j <= altura; j++) {
                if (j <= altura - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }       
            }
            System.out.println();
        }
    }
}
