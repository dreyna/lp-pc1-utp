package pc1;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre, nombreSala, nombreDia;
        int tipoSala, cantidad;
        char dia;
        double tarifa = 0, subtotal, recargo, descuento, totalFinal;

        System.out.print("Ingrese nombre del cliente: ");
        nombre = sc.nextLine();

        System.out.println("Seleccione tipo de sala:");
        System.out.println("1. 2D");
        System.out.println("2. 3D");
        System.out.println("3. VIP");
        System.out.print("Opción: ");
        tipoSala = sc.nextInt();

        System.out.print("Ingrese día L(Lunes a jueves) o F(Viernes a domingo): ");
        dia = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese cantidad de entradas: ");
        cantidad = sc.nextInt();

        switch (tipoSala) {
            case 1 -> {
                nombreSala = "2D";
                tarifa = 12;
            }
            case 2 -> {
                nombreSala = "3D";
                tarifa = 18;
            }
            case 3 -> {
                nombreSala = "VIP";
                tarifa = 25;
            }
            default -> {
                nombreSala = "No válido";
                tarifa = 0;
            }
        }

        if (tarifa == 0) {
            System.out.println("Tipo de sala inválido.");
        } else {
            subtotal = tarifa * cantidad;

            if (dia == 'F') {
                nombreDia = "Viernes a domingo";
                recargo = subtotal * 0.10;
            } else if (dia == 'L') {
                nombreDia = "Lunes a jueves";
                recargo = 0;
            } else {
                nombreDia = "Día no válido";
                recargo = 0;
            }

            double subtotalConRecargo = subtotal + recargo;

            if (cantidad >= 5) {
                descuento = subtotalConRecargo * 0.08;
            } else {
                descuento = 0;
            }

            totalFinal = subtotalConRecargo - descuento;

            System.out.println("\n--- REPORTE DE COMPRA ---");
            System.out.println("Cliente: " + nombre);
            System.out.println("Sala: " + nombreSala);
            System.out.println("Día: " + nombreDia);
            System.out.printf("Subtotal: S/ %.2f\n", subtotal);
            System.out.printf("Recargo: S/ %.2f\n", recargo);
            System.out.printf("Descuento: S/ %.2f\n", descuento);
            System.out.printf("Total final: S/ %.2f\n", totalFinal);
        }

        sc.close();
    }

}
