package Capitulo5;

import java.util.Scanner;

/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
número leído por teclado. */
public class EJ27 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra los múltiplos de 3 que hay entre 1 y un número introducido.");
        System.out.print("Introduce un número: ");
        int numero=Integer.parseInt(System.console().readLine());
        int contador=0;
        int suma =0;
        System.out.print("Los múltiplos de " + numero + " son: ");
        for (int i = 1; i <= numero; i++) {
            if((i%3)==0){
                contador++;
                suma+=i;
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Desde 1 hasta " + numero + " hay " + contador + " múltiplos de 3.");
        System.out.println("La suma de los múltiplos de " + numero + " es = " + suma + ".");


    }
}
