package Capitulo5;
/*Realiza el control de acceso a una caja fuerte. La combinación
será un número de 4 cifras. El programa nos pedirá la combinación
para abrirla. Si no acertamos, se nos mostrará el mensaje
“Lo siento, esa no es la combinación” y si acertamos se nos dirá
“La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
oportunidades para abrir la caja fuerte.*/
public class EJ07 {
    public static void main(String[] args) {
    
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;
        do {
            System.out.print("Introduzca la clave de la caja fuerte: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            if(numeroIntroducido==1212){
                acertado = true;
            }else{
                System.out.println("El número introducido es erróneo");   
            }
            intentos--;
             
        } while ((intentos>0) && (!acertado));
        if(acertado){
            System.out.println("Ha abierto la caja fuerte");
        }else{
            System.out.println("Ha agotado todos los intentos");
        }
    }
}
