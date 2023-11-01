package Capitulo5;
/*Escribe un programa que calcule el factorial de un número entero leído por
teclado. */
public class EJ28 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el factorial de un número");
        System.out.print("Introduce un número entero: ");
        long numero = Long.parseLong(System.console().readLine());
        long factorial=1;
        for (long i = numero; i > 1; i--) {
            if(numero==0){
                factorial=1;
            }else{
                factorial*=i;
            }
            
        }
        System.out.println("El factorial de " + numero + " es = " + factorial);
    }
}
