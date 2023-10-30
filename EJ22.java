package Capitulo5;

/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/
public class EJ22 {
    public static void main(String[] args) {
        System.out.println("Muestra todos los números primos entre el 2 y el 100");
        boolean esPrimo = true;
        for (int n = 2; n <=100; n++) {
            esPrimo = true;
            for (int i = 2; i < n; i++) {
                if(n%i==0)
                    esPrimo=false;
            }
        if(esPrimo)
            System.out.print(n + " ");
        }
    }
}
