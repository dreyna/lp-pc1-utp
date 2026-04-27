package pc1;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String nombre, nombrePlan;
        int plan, edad;
        double tarifaBase = 0, descuento, montoFinal;

        System.out.print("Ingrese nombre del cliente: ");
        nombre = sc.nextLine();

        System.out.println("Seleccione plan:");
        System.out.println("1. Básico");
        System.out.println("2. Full");
        System.out.println("3. Premium");
        System.out.print("Opción: ");
        plan = sc.nextInt();

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

        switch (plan) {
            case 1 -> {
                nombrePlan = "Básico";
                tarifaBase = 90;
            }
            case 2 -> {
                nombrePlan = "Full";
                tarifaBase = 140;
            }
            case 3 -> {
                nombrePlan = "Premium";
                tarifaBase = 200;
            }
            default -> {
                nombrePlan = "No válido";
                tarifaBase = 0;
            }
        }

        if (tarifaBase == 0) {
            System.out.println("Plan inválido.");
        } else {
            if (plan == 3 && edad >= 60) {
                descuento = tarifaBase * 0.25;
            } else if (edad < 18) {
                descuento = tarifaBase * 0.15;
            } else if (edad >= 60) {
                descuento = tarifaBase * 0.20;
            } else {
                descuento = 0;
            }

            montoFinal = tarifaBase - descuento;

            System.out.println("\n--- REPORTE DE MEMBRESÍA ---");
            System.out.println("Cliente: " + nombre);
            System.out.println("Plan: " + nombrePlan);
            System.out.printf("Tarifa base: S/ %.2f\n", tarifaBase);
            System.out.printf("Descuento: S/ %.2f\n", descuento);
            System.out.printf("Monto final: S/ %.2f\n", montoFinal);
        }

        sc.close();
     
    }

}
