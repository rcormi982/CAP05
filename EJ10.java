package Capitulo5;
/*Escribe un programa que calcule la media de un conjunto de números
positivos introducidos por teclado. A priori, el programa no sabe
cuántos números se introducirán. El usuario indicará que ha terminado
de introducir los datos cuando meta un número negativo.*/
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa que calcula media de números introducidos");
        System.out.print("Por favor, introduce los números deseados separados por espacio (puede parar introduciendo un número negativo):");
        int contador = 0;
        float numeroIntroducido;
        float suma = 0f;
        while((numeroIntroducido = s.nextFloat())>=0){
            contador = contador + 1;
            suma = suma + numeroIntroducido;
        }
        if(contador == 0){
            System.out.println("No se ha introducido números");
        }else{
            System.out.println("La media de los números introducidos es: " + suma/contador);
        }
        s.close();
    }
}
