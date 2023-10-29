package Capitulo5;

import java.util.Scanner;

/*Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo
y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
se incluye en el cómputo.*/
public class EJ21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa que pide números");
        System.out.print("Introduce un número (puede terminar introduciendo un número negativo): ");
        double numeroIntroducido=0;
        int contadorNumeros=0;
        int contadorPares=0;
        int contadorImpares=0;
        double sumaImpares=0;
        double maxPar=0;
            while (numeroIntroducido>=0) {
            try{
            numeroIntroducido = s.nextDouble();
            contadorNumeros++;
            if((numeroIntroducido%2==1)){
                sumaImpares+=numeroIntroducido;
                contadorImpares++;
            }else{
                if(numeroIntroducido>maxPar){
                    maxPar = numeroIntroducido;
                }
                contadorPares++;
            }
            }catch (Exception e) {
                if(contadorPares==0){
                System.out.println("No hay máximo de números pares que mostrar");//Preguntar porque no lo muestra
                }
            }
        }
                System.out.println("La media de los impares es = " + sumaImpares/contadorImpares);
                System.out.println("El mayor de los pares es = " + maxPar);
                System.out.println("El número de números introducidos es = " + (contadorNumeros-1));

            s.close();

    }
}

