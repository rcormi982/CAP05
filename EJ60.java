package Capitulo5;
/*Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
Ejemplo 1:
Introduzca la altura de los calcetines: 7
*** ***
*** ***
*** ***
*** ***
*** ***
****** ******
****** ******
Ejemplo 2:
Introduzca la altura de los calcetines: 4
*** ***
*** ***
****** ******
****** ******
Ejemplo 3:
Introduzca la altura de los calcetines: 9
*** ***
*** ***
*** ***
*** ***
*** ***
*** ***
*** ***
****** ******
****** ****** */
public class EJ60 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = Integer.parseInt(System.console().readLine());

        if(altura < 4){
            System.out.print("Por favor, introduce una altura mayor o igual a 4");
            return;
        }
        for (int i = 1; i <= altura - 2; i++) {
            System.out.println("***    ***");
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println("****** ******");
        }
    }
}

