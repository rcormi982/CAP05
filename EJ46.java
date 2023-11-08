package Capitulo5;
/*Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
Ejemplo 1:
Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
Ahora introduzca la altura (como mínimo 2): 1
Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altur\
a es 2.
Ejemplo 2:
Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
Ahora introduzca la altura (como mínimo 2): 4
* * * * * *
*         *
*         *
* * * * * *  */
public class EJ46 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        int altura = Integer.parseInt(System.console().readLine());

        if((altura < 2) || (anchura < 2)){
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }else{
            for (int i = 1; i <=altura; i++) {
                for (int j = 1; j <= anchura; j++) {
                    if(i==1 || i==altura || j==1 || j==anchura)
                        System.out.print(" * " );
                    else
                        System.out.print("   " );
                }
                System.out.println();
            }
        }
    }
}



