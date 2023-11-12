package Capitulo5;
/*Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
Ejemplo 1:
Por favor, introduzca la altura del árbol: 7
     *
     ^
    ^ ^
   ^   ^
  ^     ^
 ^^^^^^^^^
     Y
Ejemplo 2:
Por favor, introduzca la altura del árbol: 4
 *
 ^
^^^
 Y
Ejemplo 3:
Por favor, introduzca la altura del árbol: 10
       *
       ^
      ^ ^
     ^   ^
    ^     ^
   ^       ^
  ^         ^
 ^           ^
^^^^^^^^^^^^^^^
       Y
Ejercicio */
public class EJ59 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura del árbol: ");
        int altura = Integer.parseInt(System.console().readLine());
        int nuevaAltura=altura-2;

        for (int i = 1; i <=((2*altura))/2-3; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 1; i <= nuevaAltura; i++) {
            for (int j = 1; j <= nuevaAltura - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == nuevaAltura) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <=((2*altura)/2)-3; i++) {
            System.out.print(" ");
        }
        System.out.print("Y");
        System.out.println();
    }
}


    