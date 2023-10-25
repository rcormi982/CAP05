package Capitulo5;
/*Escribe un programa que muestre los n primeros términos de la
serie de Fibonacci. El primer término de la serie de Fibonacci
es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1,
2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
introducir por teclado.*/
public class EJ12 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra los n primeros números de la serie Fibonacci");
        System.out.print("Introduce cuántos números quiere mostrar: ");
        int numerosMostrar = Integer.parseInt(System.console().readLine());
        long primerNumFibonacci = 0;
        long segundoNumFibonacci = 1;
        long sigNumFibonacci = primerNumFibonacci + segundoNumFibonacci;
        int i = 1;
            System.out.print(primerNumFibonacci);
        while(i<numerosMostrar){
            System.out.print(" " +sigNumFibonacci);
            sigNumFibonacci = segundoNumFibonacci + primerNumFibonacci;
            primerNumFibonacci = segundoNumFibonacci;
            segundoNumFibonacci = sigNumFibonacci;
            i++;
        }
    }
}
