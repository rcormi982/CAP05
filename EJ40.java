package Capitulo5;
/*Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
Ejemplo:
Por favor, introduzca la altura del rombo: 5
  *
 * *
*   *
 * *
  *   */
public class EJ40 {
    public static void main(String[] args) {
        System.out.println("Programa que dibuja un rombo de altura introducia por teclado");
        System.out.print("Por favor, introduce la altura del rombo: ");
        int altura = Integer.parseInt(System.console().readLine());

        if(altura % 2 == 0 || altura<3){
            System.out.println("Por favor, introduzca un número impar mayor o igual a 3");
        }else{
            for (int i = 1; i <= (altura/2)+1; i++) {
                for (int j = 1; j <= ((altura/2)+1) - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            if(i>1){
                for(int j = 2;j <=(2*i-1)-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i = (altura/2); i >= 1; i--) {
                for (int j = 1; j <= ((altura/2)+1) - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            if(i>1){
                for(int j = 2;j <=(2*i-1)-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
}
 
