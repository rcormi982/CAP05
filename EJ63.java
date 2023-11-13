package Capitulo5;
/*Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base.
Ejemplo 1:
Introduzca la altura de la primera pirámide: 7
Introduzca la altura de la segunda pirámide: 3
      *
     ***
    *****
   *******
  *********     *
 ***********   ***
************* *****
Ejemplo 2:
Introduzca la altura de la primera pirámide: 4
Introduzca la altura de la segunda pirámide: 5
            *
   *       ***
  ***     *****
 *****   *******
******* *********   */
public class EJ63 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int altura1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int altura2 = Integer.parseInt(System.console().readLine());
        
        int alturaMaxima = Math.max(altura1, altura2);
        int espacios1 = altura1 - 1;
        int espacios2 = altura2 - 1;
        int base1 = altura1 * 2 - 1;
        int base2 = altura2 * 2 - 1;
        int asteriscos1 = 1;
        int asteriscos2 = 1;

        for (int i = alturaMaxima; i > 0; i--) {
        // Pirámide 1
            if (i > altura1) {
            // Si la pirámide 1 queda por debajo, pinta el hueco.
            for (int j = 0; j <= base1; j++) {
                System.out.print(" ");
            }
            } else {
            // Espacios por delante de la pirámide 1
            for (int j = 0; j < espacios1; j++) {
                System.out.print(" ");
            }
            // Pirámide 1
            for (int j = 0; j < asteriscos1; j++) {
                System.out.print("*");
            }
            // Espacios por detrás de la pirámide 1
            for (int j = 0; j <= espacios1; j++) {
                System.out.print(" ");
            }
            espacios1--;
            asteriscos1 += 2;
            }
        // Pirámide 2
            if (i > altura2) {
            // Si la pirámide 2 queda por debajo, pinta el hueco.
            for (int j = 0; j < base2; j++) {
                System.out.print(" ");
            }
            } else {
            // Espacios por delante de la pirámide 1
            for (int j = 0; j < espacios2; j++) {
                System.out.print(" ");
            }
            // Pirámide 1
            for (int j = 0; j < asteriscos2; j++) {
                System.out.print("*");
            }
            // Espacios por detrás de la pirámide 1
            for (int j = 0; j <= espacios1; j++) {
                System.out.print(" ");
            }
            espacios2--;
            asteriscos2 += 2;
            }
            System.out.println();
        }
    }
}
