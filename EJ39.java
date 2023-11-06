package Capitulo5;
/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
Ejemplo:
Por favor, introduzca un número entero positivo: 7
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040 */
public class EJ39 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula factorial de un número");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(System.console().readLine());
        long factorial = 1;
        if(numero == 0){
            factorial = 1;           
        }
        for (long i = 1; i <=numero; i++) {
            factorial *=i;
            System.out.println(i+ "! = "+ factorial);
        }
    }
}
