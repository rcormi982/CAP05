package Capitulo5;
/*Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783 */
public class EJ45 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición dentro del número: ");
        long posicion = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca el nuevo dígito: ");
        long digito = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido;
        int longitud = 0;
        do {
            numero /= 10;
            longitud++;
        } while (numero > 0);
        long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
        parteIzquierda = parteIzquierda * 10 + digito;
        long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion));
            System.out.print("El número resultante es:  " + parteIzquierda + parteDerecha + ".");
    }
}
