package Capitulo5;
/*Escribe un programa que pida un número por teclado y que luego lo “disloque”
de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
Ejemplo 1:
Por favor, introduzca un número: 9402
Dislocando el 9402 sale el 8513.
Ejemplo 2:
Por favor, introduzca un número: 870958422
Dislocando el 870958422 sale el 961849533.
Ejemplo 3:
Por favor, introduzca un número: 137
Dislocando el 137 sale el 26 */

import java.util.Scanner;

public class EJ68 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long numeroIntroducido = Long.parseLong(s.nextLine());
        long duplicado = numeroIntroducido;
        long resultado = 0;
        int cuentaDigitos = 0;

        while (numeroIntroducido != 0) {
            int digito = (int) (numeroIntroducido % 10);
            int nuevoDigito;
            if (digito % 2 == 1) {
                nuevoDigito = digito - 1;
            } else {
                nuevoDigito = digito + 1;
            }
            resultado = (long) (nuevoDigito * Math.pow(10, cuentaDigitos) + resultado);
            numeroIntroducido /= 10;
            cuentaDigitos++;
        }
        System.out.println("Dislocando el " + duplicado + " sale el " + resultado);
        s.close();

    }
}
