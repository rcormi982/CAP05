package Capitulo5;
/*Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada.
Ejemplo 1:
Introduzca la altura de la pirámide maya: 5
    ******
   **    **
  **********
 ****    ****
**************
Ejemplo 2:
Introduzca la altura de la pirámide maya: 8
       ******
      **    **
     **********
    ****    ****
   **************
  ******    ******
 ******************
********    ********   */

//Mirar el del profesor que es más fácil

public class EJ69 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = Integer.parseInt(System.console().readLine());

              // Bucle for para recorrer las filas de la pirámide
        for (int i = 1; i <= altura; i++) {
            // Imprimimos los espacios en blanco
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimimos los asteriscos de la primera línea
            if (i == 1) {
                for (int k = 1; k <= 6; k++) {
                    System.out.print("*");
                }
            } else {
                // Imprimimos los asteriscos de las líneas centrales
                if ((i % 2) == 1) {
                    for (int k = 1; k <= 4; k++) {
                        System.out.print("*");
                    }
                } else {
                    // Imprimimos los asteriscos de las líneas laterales
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                }
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}