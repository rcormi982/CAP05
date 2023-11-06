package Capitulo5;
/*Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura del reloj de arena: 5
*****
 ***
  *
 ***
***** */
public class EJ38 {
    public static void main(String[] args) {
        System.out.println("Programa que dibuja un reloj de arena de asteriscos al pedir una altura.");
        System.out.print("Por favor, introduzca la altura del reloj: ");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura % 2 == 0 || altura<3){
            System.out.println("Por favor, introduzca un número impar mayor o igual a 3");
            return;
        }else{
        for (int i = (altura/2) + 1; i >= 1; i--) {
            for (int j = 1; j <= ((altura/2)+1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =2 ; i <= (altura/2) + 1; i++) {
            for (int j = 1; j <= ((altura/2)+1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}
