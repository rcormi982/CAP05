package Capitulo5;
/*Realiza un programa que pida un número por teclado y que luego
muestre ese número al revés. */
public class EJ25 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra un número introducido al revés");
        System.out.print("Introduce el número: ");
        int numero = Integer.parseInt(System.console().readLine());
        int volteado = 0;
        while (numero>0) {
            volteado =numero%10;
            numero/=10;
            System.out.print(volteado);
        }
        while (numero<0) {
            volteado = numero%10;
            numero/=10;
            System.out.print(Math.abs(-volteado));//Preguntar
        }
    }
}
