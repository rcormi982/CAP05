package Capitulo5;
/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.*/
public class EJ02 {
    public static void main(String[] args) {
        int intervaloMin = 0;
        int intervaloMax = 100;
        int multiplos = 5;
        int i =intervaloMin;
        while (i<=intervaloMax) {
                if(i%multiplos ==0){
                    System.out.println(i);
                    i++;
                }
        }
    }
}
