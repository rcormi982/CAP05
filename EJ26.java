package Capitulo5;

import java.util.Scanner;

/*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */
public class EJ26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero= s.nextInt();
        System.out.print("Introduce el dígito que quieres conocer la posición: ");
        int digito = s.nextInt();
        int longitud = 0;
        int volteado = 0;
        int posicion = 1;
        if(numero == 1){
            longitud=1;
        }
        while (numero>0) {
            volteado = (volteado*10) + (numero%10);
            numero/=10;
            longitud++;
        }
        while (volteado>0) {
            if((volteado%10)==digito){
                System.out.println("El digito " + digito + " está en la siguiente posición: " + posicion);
            }
            volteado/=10;
            posicion++;
            }
        
        s.close();
     }
}



