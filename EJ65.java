package Capitulo5;

import java.util.Scanner;

/*Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
Ejemplo 1:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 5
      *
     * *
    *   *
   *     *
  *********
 *         *
*           *
Ejemplo 2:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 6
      *
     * *
    *   *
   *     *
  *       *
 ***********
*           *
Ejemplo 3:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 7
La fila introducida no es correcta.
Ejemplo 4:
Introduzca la altura de la A (un número mayor o igual a 3): 2
La altura introducida no es correcta.
Ejemplo 5:
Introduzca la altura de la A (un número mayor o igual a 3): 4
Introduzca la fila del palito horizontal (entre 2 y 3): 2
   *
  ***
 *   *
*     *
Ejemplo 1:
Introduzca la altura de la A (un número mayor o igual a 3): 5
Introduzca la fila del palito horizontal (entre 2 y 4): 4
    *
   * *
  *   *
 *******
*       * */
public class EJ65 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        int altura = s.nextInt();
        System.out.print("Introduzca la fila de palito horizontal (entre 2 y 6): ");
        int alturaPalo = s.nextInt(); 

        if(altura<3 || (alturaPalo <2 && alturaPalo>6)){
            System.out.println("Altura errónea, por favor introduzca una altura válida");
            return;
        }
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            if (i == alturaPalo) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (i - 2); j++) {
                    System.out.print(" ");
                }
                if (i > 1) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        s.close();
    }
}