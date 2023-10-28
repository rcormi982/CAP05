package Capitulo5;
/* Escribe un programa que pida una base y un exponente (entero positivo)
y que calcule la potencia.*/
public class EJ14 {
    public static void main(String[] args) {
        System.out.println("Cáculo de potencia: ");
        System.out.print("Introduce la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());
        double resultado = 1;
        if(exponente==0) {
            resultado = 1;
        }else if(exponente>0){
            for (int i = 0; i < exponente; i++) {
                resultado = resultado * (double) base;
            }
        }else{
            for (int i = 0; i < -exponente; i++) {
                resultado = resultado * base;
        }
            resultado = 1/resultado;
        }
        System.out.println(base + "^" + exponente + " = " + resultado);

    }
}

    

