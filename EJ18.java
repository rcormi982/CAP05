package Capitulo5;

import java.util.Scanner;

/*Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por
el menor de los enteros introducidos e ir incrementando de 7 en 7. */
public class EJ18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ordenar números enteros comprendidos entre dos números");
        System.out.print("Introduce el primer número: ");
        int num1 = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = s.nextInt();

        if(num1!=num2 && num1<num2){
            for (int i = num1; i < num2; i+=7) {
                System.out.print(i +" ");
            }
        }else{
            System.out.println("Los números introducidos no son válidos");
        }
        if(num1!=num2 && num2<num1){
            for (int i = num2; i < num1; i+=7) {
                System.out.print(i + " ");
            }
        }
        s.close();
    }
}
