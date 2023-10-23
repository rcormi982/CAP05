package Capitulo5;
/*Muestra los números del 320 al 160, contando de 20 en 20 hacia
atrás utilizando un bucle for.*/
public class EJ04 {
    public static void main(String[] args) {
        int intervaloMin = 160;
        int intervaloMax = 320;
        int salto = 20;
        for (int i =intervaloMin; i>=intervaloMax; i-=salto) {
            System.out.println(i);
        }
    }
}