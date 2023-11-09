package Capitulo5;
/*Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.
Ejemplo 1:
Introduzca la altura (5 como mínimo): 5 
Introduzca el número de espacios entre los números (1 como mínimo): 2
* **** ****
* *    *
* **** ****
*    *    *
* **** ****
Ejemplo 2:
Introduzca la altura (5 como mínimo): 7 
Introduzca el número de espacios entre los números (1 como mínimo): 3
* **** ****
* *    *
* **** ****
*    *    *
*    *    *
*    *    *
* **** ****
Ejemplo 3:
Introduzca la altura (5 como mínimo): 6 
Introduzca el número de espacios entre los números (1 como mínimo): 1
* **** ****
* *    *
* **** ****
*    *    *
*    *    *
* **** **** */
public class EJ50 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura (5 como mínimo): "); 
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): "); 
        int espacios = Integer.parseInt(System.console().readLine());

        if(altura < 5){
            System.out.println("Por favor, introduzca una altura válida");
            return;
        }
        if(espacios < 1){
            System.out.println("Por favor, introduzca números de espacio correcto");
            return;
        }
        //fila1
        System.out.print("*");
        for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i =1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
        //fila2
        System.out.print("*");
        for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("* ");
        for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("  *");
        //fila3
        System.out.print("*");
        for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i =1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");

        //filas variables
        for (int fila = 1; fila < altura - 3; fila++) {
            System.out.print("*");
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("   *");
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            System.out.println("   *");
            }
        //última fila
        System.out.print("*");
        for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i =1; i <= espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
    }
}
