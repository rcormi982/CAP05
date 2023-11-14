package Capitulo5;
/*Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
Ejemplo 1:
Introduzca el número de escalones: 4
Introduzca la altura de cada escalón: 2
****
****
********
********
************
************
****************
****************
Ejemplo 2:
Introduzca el número de escalones: 3
Introduzca la altura de cada escalón: 3
****
****
****
********
********
********
************
************
************ */
public class EJ67 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número de escalones: ");
        int escalones = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de cada escalón: ");
        int alturaEscalon = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <=escalones ; i++) {
            for (int j = 1; j <=alturaEscalon; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("****");
                }
                    System.out.println();

            }
        }
    }
}
