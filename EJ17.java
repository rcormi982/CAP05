package Capitulo5;
/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
un número positivo).*/
public class EJ17 {
    public static void main(String[] args) {
        System.out.println("Suma de los siguientes 100 números enteros al introducido por teclado");
        System.out.print("Introduce un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        int suma = 0;
        if (num<0){
            System.out.println("El número introducido no es positivo");
            return;
        }
        for (int i = num; i <(num + 100); i++) {
            suma+= i;
        }
        System.out.println("La suma de los 100 números siguientes es = " + suma);
    }
}
