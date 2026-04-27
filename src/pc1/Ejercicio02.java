
package pc1;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String nombre, clasificacion;
        double productividad, responsabilidad, trabajoEquipo, promedio;
        
        System.out.print("Ingrese nombre del trabajador: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese puntaje en productividad: ");
        productividad = sc.nextDouble();

        System.out.print("Ingrese puntaje en responsabilidad: ");
        responsabilidad = sc.nextDouble();

        System.out.print("Ingrese puntaje en trabajo en equipo: ");
        trabajoEquipo = sc.nextDouble();

        promedio = (productividad + responsabilidad + trabajoEquipo) / 3;

        if (productividad < 8 || responsabilidad < 8 || trabajoEquipo < 8) {
            clasificacion = "Observado";
        } else if (promedio >= 18 && promedio <= 20) {
            clasificacion = "Sobresaliente";
        } else if (promedio >= 15) {
            clasificacion = "Muy bueno";
        } else if (promedio >= 12) {
            clasificacion = "Bueno";
        } else if (promedio >= 11) {
            clasificacion = "Regular";
        } else {
            clasificacion = "Deficiente";
        }

        System.out.println("\n--- REPORTE DE DESEMPEÑO ---");
        System.out.println("Trabajador: " + nombre);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("Clasificación final: " + clasificacion);

        sc.close();
    }
    
}
