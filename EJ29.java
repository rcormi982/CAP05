package Capitulo5;
/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */
public class EJ29 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un número entero: ");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.print("Los números enteros positivos menores que " + num1 + " que no son divisibles entre " + num2 + " son los siguientes: ");
        
        for (int i = 1; i < num1; i++) {
            if((i%num2)!=0){
                System.out.print(i + " ");
            }   
        }
    }
}
