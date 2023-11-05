package Capitulo5;
/*Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes. */
public class EJ37 {
    public static void main(String[] args) {
        System.out.println("Conversor de sistema decimal a sistema de palotes");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int numero = numeroIntroducido;
        int invertido = 0;
        int numDigitos = 0;

        if(numeroIntroducido<0){
            System.out.println("El número introducido no es positivo");
            return;
        }
        while (numero > 0) {
            invertido = (invertido * 10) + (numero % 10);
            numero /= 10;
            numDigitos++;
        }
        int cifra = 0;
        for (int i = 0; i < numDigitos; i++) {
            cifra = invertido % 10;
            invertido /= 10;
            for (int j = 0; j < cifra; j++) {
                System.out.print("|");
            }
            if(i < numDigitos - 1){
                System.out.print("-");
            }
        }
    }
}

