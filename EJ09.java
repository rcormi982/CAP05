package Capitulo5;
/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.*/
public class EJ09 {
    public static void main(String[] args) {
        int numeroDeDigitos=1;
        
        System.out.print("Introduzca el número que desea conocer el número de dígitos: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
        while(numeroIntroducido>10){
            numeroIntroducido/=10;//preguntar
            numeroDeDigitos++;
        }
        System.out.println("El " + numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos");
    }
}
