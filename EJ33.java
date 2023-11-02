package Capitulo5;
/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. */
public class EJ33 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la letra: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
            for (int j = 0; j < altura-2; j++) {
                System.out.print("   ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int i= 0; i < altura-2; i++) {
            System.out.print(" * ");
        }      
    }
}
