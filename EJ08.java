package Capitulo5;
/*Muestra la tabla de multiplicar de un número introducido por teclado.*/
public class EJ08 {
    public static void main(String[] args) {
        System.out.print("Introduce el número de la tabla de multiplicar que desea: ");
        int numeroIntroducido= Integer.parseInt(System.console().readLine());
        int resultado;
        for (int i = 1; i <=10; i++) {
            resultado = numeroIntroducido*i;
            System.out.println(numeroIntroducido + " x " + i + " = " + resultado);  
        }
    }
}
