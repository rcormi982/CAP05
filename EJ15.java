package Capitulo5;

import java.util.Scanner;

/*Escribe un programa que dados dos números, uno real (base) y un
entero positivo (exponente), saque por pantalla todas las potencias
con base el numero dado y exponentes entre uno y el exponente introducido.
No se deben utilizar funciones de exponenciación. Por ejemplo, si
introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2￿ y 2￿. */
public class EJ15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cáculo de potencia");
        System.out.print("Introduce la base: ");
        double base = s.nextDouble();
        
        System.out.print("Introduce el exponente: ");
        int exponenteFinal = s.nextInt();

        double resultado;
        int exponente;

        for (int i = 0; i < exponenteFinal + 1; i++) {
            resultado = 1;
            exponente = i;
            for (int j = 0; j < exponente; j++) {
                resultado *= base; 
            }
                System.out.println(base + "^" + exponente + " = " + resultado);
    
        }
    }
}
