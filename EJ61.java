package Capitulo5;
/*Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
Ejemplo 1:
Introduzca la altura de la V (un número mayor o igual a 3): 7
 ***             ***
  ***           ***
   ***         ***
    ***       ***
      ***    ***
       ***  ***
        ******
Ejemplo 2:
Introduzca la altura de la V (un número mayor o igual a 3): 4
*** ***
*** ***
*** ***
******
Ejemplo 3:
Introduzca la altura de la V (un número mayor o igual a 3): 9
*** ***
*** ***
*** ***
*** ***
*** ***
*** ***
*** ***
*** ***
******
Ejemplo 4:
Introduzca la altura de la V (un número mayor o igual a 3): 2
La altura debe ser mayor o igual a 3. */
public class EJ61 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
        int altura = Integer.parseInt(System.console().readLine());

        if(altura < 3) {
            System.out.print("Por favor, introduce una altura mayor o igual a 4");
            return;
        }
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco en la parte izquierda
            for (int j = 1; j <= i- 1; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            System.out.print("***");

            // Imprimir espacios en blanco en el medio
            for (int j = 1; j <= 2 * (altura - i); j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos en la parte derecha
            System.out.print("***");

            System.out.println();
        }
    }
}