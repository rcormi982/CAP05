package Capitulo5;
/*Escribe un programa que lea una lista de diez números y determine
cuántos son positivos, y cuántos son negativos. */
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa que lee 10 números y te dice cuáles son positivos y cuáles negativos");
        System.out.print("Introduce los diez números: ");
        int contadorPositivos=0;
        int contadorNegativos=0;

        for (int i = 0; i < 10; i++) {
            float numero = s.nextFloat();
            if(numero>=0){
                contadorPositivos++;
            }else{
                contadorNegativos++;
            }
        }
        System.out.println("Los números positivos son: " + contadorPositivos);
        System.out.println("Los números negativos son: " + contadorNegativos);
        
        s.close();
    }
}
