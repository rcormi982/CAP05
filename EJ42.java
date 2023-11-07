package Capitulo5;
/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.
Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo */
public class EJ42 {
    public static void main(String[] args) {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            int numero = Integer.parseInt(System.console().readLine());
            boolean esPrimo;
        if(numero<0)
            System.out.println("Por favor, introduzca un número positivo");
        else{
            for (int n = numero; n < numero + 5; n++) {
                esPrimo = true;
                for (int i = 2; i < n; i++) {
                    if(n % i == 0){
                        esPrimo = false;
                    }
                }
                if(esPrimo){
                    System.out.println(n+ " es primo");
                }else{
                    System.out.println(n+ " no es primo");
                }
            }
                System.out.println();
            }            
        }  
}
    

