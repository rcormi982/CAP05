package Capitulo5;
/*Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
*    *
 *  *
  *
 *  *
*    * */
public class EJ35 {
    public static void main(String[] args) {
        System.out.println("Programa que dibuja una X de asteriscos al pedir una altura.");
        System.out.print("Por favor, introduzca la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura % 2 == 0 || altura<3){
            System.out.println("Por favor, introduzca un número impar mayor o igual a 3");
        }else{
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= altura; j++) {
                    if (i == j || i + j == altura + 1) {
                        System.out.print("*");
                    } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            /*for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    if (i == j || i + j == altura - 1) {
                        System.out.print("*");
                    } else {
                    System.out.print(" ");
                }
            } */
        }
    }
    }
}