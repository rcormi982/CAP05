package Capitulo5;
/*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
El 406783 contiene 4 dígitos pares y 2 dígitos impares.
Ejemplo 2:
Por favor, introduzca un número entero positivo: 3177840
El 3177840 contiene 3 dígitos pares y 4 dígitos impares. */
public class EJ41 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido;

        if(numero<0){
            System.out.println("Por favor, introduzca un número entero positivo");
        }else{
        int digitosPares=0;
        int digitosImpares=0;
        while (numero>0) {
            long digito = numero % 10;
            if(digito%2==0){
                digitosPares++;
            }else{
                digitosImpares++;
            } 
            numero /=10;
        }
        System.out.println("El " + numeroIntroducido + " contiene " + digitosPares + " dígitos pares y "+ digitosImpares + " dígitos impares");
    }
    }
}
