package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main (String[] args) {

        //declaracion e inicializacion de variables para precios de helados
        double precioSimple=2.8; // precio de un helado simple
        double precioDoble=4.8; // precio de un helado doble
        double precioEspecil=6.8; // precio de un helado especial

        // declaracion de variable cantidad vendida de cada tipo de helado
         int cantidadSimple , cantidadDoble , cantidadEspecial;

         //declaracion de variables para almacenar los nombres que considere necesarios

         String nombreSimple = "helado simple";
         String nombreDoble = "helado doble";
         String nombreEspecial= "helado Especial";

         //declaracion de variables para totales de venta

        double totalVentasSimple, totalVentasDoble, totalventasEspecial, totalVentas;



        Scanner scanner = new Scanner(System.in);

        // entradas: cantidad vendida de cada tipo

        System.out.print("Ingrese la cantidad de helados simples vendidos:");
        cantidadSimple= scanner.nextInt();

        System.out.print("Ingrese la cantidad de helados dobles vendidos: ");
      cantidadDoble= scanner.nextInt();

        System.out.print("Ingrese la cantidad de helados especiales vendidos: ");
        cantidadEspecial = scanner.nextInt();

        // Cálculos: Totales de ventas para cada tipo de helado y total general
        totalVentasSimple = cantidadSimple * precioSimple;
        totalVentasDoble = cantidadDoble * precioDoble;
        totalventasEspecial = cantidadEspecial * precioEspecil;
        totalVentas = totalVentasSimple + totalVentasDoble + totalventasEspecial;

        // Salida: Mostrar los resultados
        System.out.println("\nVentas del día:");
        System.out.println(nombreSimple + ": $" + totalVentasSimple);
        System.out.println(nombreDoble + ": $" + totalVentasDoble);
        System.out.println(nombreEspecial + ": $" + totalventasEspecial);
        System.out.println("\nTotal general de ventas del día: $" + totalVentas);






    }
}