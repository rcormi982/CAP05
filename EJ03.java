package Capitulo5;
/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.*/
public class EJ03 {
    public static void main(String[] args) {
        int numero=0;
        do{//Hacerlo con las variables del ejercicio 1 y 2
            System.out.println(numero);
            numero+=5;
        }while(numero<=100);
    }
}
