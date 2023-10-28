package Capitulo5;

public class EJ16 {
    public static void main(String[] args) {
        System.out.println("Programa que te dice si un número es primo o no");
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;
        
        for (int i = 2; i < num; i++) {
            if((num%i)==0){
                esPrimo = false;
            }
        }
        if(num<2){
            esPrimo = false;
            System.out.println("El número introducido no es primo");
        }else{
            if(esPrimo)
                System.out.println("El número introducido es primo");
            else{
                System.out.println("El número introducido no es primo");

            }

        }
    }
}
