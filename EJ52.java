package Capitulo5;
/*Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual.
Ejemplo 1:
Introduzca un número: 609831
El número resultado es 98316
Ejemplo 2:
Introduzca un número: 78201345
El número resultado es 82013457
Ejemplo 3:
Introduzca un número: 24
El número resultado es 42
Ejemplo 4:
Introduzca un número: 8
El número resultado es 8 */
public class EJ52 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());

        long duplicado = numeroIntroducido;
        int longitud = 0;
        while (duplicado > 0) {
            duplicado /=10;
            longitud++;
        }
        int primero = (int)(numeroIntroducido / Math.pow(10, longitud - 1));
        long aux = (long)(primero * Math.pow(10, longitud - 1));
        long resultado = (numeroIntroducido - aux) * 10 + primero;
        System.out.println("El número resultado es " + resultado);
    }
}
