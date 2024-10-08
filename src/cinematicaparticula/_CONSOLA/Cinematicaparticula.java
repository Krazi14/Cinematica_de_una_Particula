package cinematicaparticula._CONSOLA;
import java.util.Scanner;

public class Cinematicaparticula {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            int a = 2;
            int b = 3;
            int c = 1;
            int d = 2;
            int n = 4;

    if (n >= 4) {
        System.out.println("Calculando derivada.....");

        System.out.println();

            String posicion = a + "t^" + n + " - " + b + "t^" + (n - 1) + " + " + c + "t^" + (n - 2) + " + " + d;
                System.out.println("La posicion es: " + posicion);
          
                int e, f, g;
                e = a*n;
                f = b*(n-1);
                g = c*(n-2);
            String velocidad = e + "t^" + (n-1) + " - " + f + "t^" + (n - 2) + " + " + g + "t^" + (n - 3);
                System.out.println("La velocidad es: " + velocidad);
          
                int h, i, j;
                h = e*(n-1);
                i = f*(n-2);
                j = g*(n-3);
            String aceleracion = h + "t^" + (n-2) + " - " + i + "t^" + (n - 3) + " + " + j + "t^" + (n - 4);
                System.out.println("La aceleracion es: " + aceleracion);
                
        System.out.println();
        
//AHORA EN FUNCION AL TIEMPO
        System.out.println("Ahora calculamos en direccion al tiempo");
        //ingresar que no se calcule tiempo (-)
            System.out.print("Cuanto es el tiempo que desea calular: ");
            int t = sc.nextInt();
            
            double posicionT = a * Math.pow(t, n) - b * Math.pow(t, n - 1) + c * Math.pow(t, n - 2) + d;
            System.out.println("El resultado de la posicion es: " + posicionT + " m");

            double velocidadT = e * Math.pow(t, n - 1) - f * Math.pow(t, n - 2) + g * Math.pow(t, n - 3);
            System.out.println("El resultado de la velocidad es: " + velocidadT + " m/s");

            double aceleracionT = h * Math.pow(t, n - 2) - i * Math.pow(t, n - 3) + j * Math.pow(t, n - 4);
            System.out.println("El resultado de la aceleracion es: " + aceleracionT + " m/s^2");
        
            System.out.println();
//Calcular distancia
        System.out.println("Ahora calculamos la Distancia:: ");
            System.out.print("La velocidad inicial siempre sera 0: ");
            double v0 = 0;
        
        double distanciaF = v0 * t + 0.5 * aceleracionT* (t*t);
        
            System.out.println("La distancia final es: " + distanciaF + " m");
            
    } else {
        System.out.println("Ingrese otro numero");
        }
    }
}
