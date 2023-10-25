package Capitulo5;
/*Escribe un programa que muestre en tres columnas, el cuadrado y
el cubo de los 5 primeros números enteros a partir de uno que se
introduce por teclado. */
public class EJ11 {
    public static void main(String[] args) {
        System.out.println("Cálculo del cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado");
        System.out.print("Introduce un número: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());

        for (int i = numeroIntroducido; i <numeroIntroducido + 5 ; i++) {
            System.out.printf("%-8d %-8d %4d\n", i, i*i, i*i*i);
        }
    }
}
