package Capitulo5;
/*La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error.
Ejemplo 1:
Por favor, introduzca la altura de la figura: 7
*  *
 *  *
  *  *
   *  *
  *  *
 *  *
*  *
Ejemplo 2:
Por favor, introduzca la altura de la figura: 3
*  *
 *  *
*  *
Ejemplo 3:
Por favor, introduzca la altura de la figura: 4
La altura no es correcta, debe ser un número impar mayor o igual que 3. */
public class EJ66 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());

        if(altura % 2 == 0 || altura <3){
            System.out.println("La altura introducida no es correcta, tiene que ser igual o mayor a 3 e impar.");
            return;
        }
        for (int i = 1; i <=(altura + 1)/2; i++) {
            for (int j = 1; j <= (altura + 1)/2; j++) {
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            for (int j = 1; j <= (altura + 1)/2; j++) {
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = ((altura + 1)/2)-1; i >=1; i--) {
            for (int j = 1; j <= (altura + 1)/2; j++) {
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            for (int j = 1; j <= (altura + 1)/2; j++) {
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
