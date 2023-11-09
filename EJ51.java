package Capitulo5;
/*El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
Ejemplo 1:
Introduzca un número entero (mayor que cero): 51803458
Después de haber sido comido por el gusano numérico se queda en 51345
Ejemplo 2:
Introduzca un número entero (mayor que cero): 29614
El gusano numérico no se ha comido ningún dígito. */
public class EJ51 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero (mayor que cero): ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido;
        long invertido = 0;
        boolean numeroComido = false;

        while (numero > 0) {
            if ((numero % 10 != 0) && (numero % 10 != 8)) {
                invertido = (invertido * 10) + (numero % 10);
            } else {
                numeroComido = true;
            }
            numero /= 10;
            }
            // Se le vuelve a dar la vuelta al número
            numero = invertido;
            invertido = 0;
            while (numero > 0) {
               invertido = (invertido * 10) + (numero % 10);
                numero /= 10;
            }
            if (numeroComido) {
                System.out.print("Después de haber sido comido por el gusano numérico");
                System.out.println(" se queda en " + invertido);
            } else {
                System.out.println("El gusano numérico no se ha comido ningún dígito.");
            }
    }
}
