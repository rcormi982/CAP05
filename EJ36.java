package Capitulo5;
/*Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.
Ejemplo 2:
Por favor, introduzca un número entero positivo: 2019102
El 2019102 es capicúa. */
public class EJ36 {
    public static void main(String[] args) {
        System.out.println("Programa que te dice si el número introducico es capícua");
        System.out.print("Por favor, introduce un número: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido; 
        long invertido = 0;
        if(numero<0){
            System.out.println("El número introducido no es capicúa");
            return;
        }
        while (numero > 0) {
            invertido = (invertido * 10) + (numero % 10);
            numero /= 10;
        }
        if(invertido == numeroIntroducido){
            System.out.println("El número " + numeroIntroducido + " es capícua");
        }else{
            System.out.println("El número introducido no es capícua");
        }
    }
}
