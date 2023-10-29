package Capitulo5;
/*Igual que el ejercicio anterior pero esta vez se debe pintar una
pirámide hueca.*/

import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pintar una pirámide");
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el carácter de la pirámide: ");
        String caracter = System.console().readLine();

        for (int i = 0; i < altura; i++) {
            for (int j = 1; j < altura-i; j++) {
                System.out.print(" ");   
        }
            System.out.println(caracter);
            for (int j = 2; j <=i; j++) {
                if(j==0 || j==i){
                    System.out.print(caracter + " ");
                }else{
                    System.out.println(" ");
                }
            }
        }
    System.out.println();
    s.close();
    }
}

