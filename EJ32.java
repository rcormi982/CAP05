package Capitulo5;

import java.util.Scanner;

/*Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos. */
public class EJ32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número entero positivo: ");
        long numeroIntroducido = s.nextLong();
        long numero=numeroIntroducido;
        long volteado = 0;
        int longitud = 0;
        if(numero==0){
            longitud=1;
        }
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }
        System.out.println("Muestra los dígitos pares");
        int digito;
        int sumaPares=0;
        for (int i = 0; i < longitud; i++) {
            digito =(int)(volteado%10);
            if((digito%2) == 0){
                System.out.print(digito+ " ");
                sumaPares+=digito;
            }
            volteado/=10;   
        }
        System.out.println("\nLa suma de los digitos pares es = " + sumaPares);
        s.close();
    }
}
