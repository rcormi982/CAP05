package Capitulo5;
/*Muestra los números del 320 al 160, contando de 20 en 20 hacia
atrás utilizando un bucle while.*/
public class EJ05 {
    public static void main(String[] args) {
        int intervaloMin = 160;
        int intervaloMax = 320;
        int salto = 20;
        int i = intervaloMax;
        while (i>=intervaloMin) {
            System.out.println(i);
            i-=salto;
        }
    }
}
