package Capitulo5;

import java.util.Scanner;

/*Realiza un programa que pinte una pirámide por pantalla. La altura
se debe pedir por teclado. El carácter con el que se pinta la pirámide
también se debe pedir por teclado. */
public class EJ19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pintar una pirámide");
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el carácter de la pirámide: ");
        String caracter = ""+System.console().readLine().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 1; j<=(altura-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
