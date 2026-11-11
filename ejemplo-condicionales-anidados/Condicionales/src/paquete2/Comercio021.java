/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio021 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2

        String nombreEmpresa;
        String Localidad;
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;

        double productividad;
        double coeficiente = 0.6;
        double bono = 0;

        double porcentajeSeguro = 8;
        double adicionalSeguro;

        double sueldoFinal;

       System.out.println("Ingrese el nombre de la empresa por favor");
        nombreEmpresa = entrada.nextLine();
        
        System.out.println("Ingrese el nombre de la Localidad por favor");
        Localidad = entrada.nextLine();

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();

        // calcular la productividad
        productividad = numeroProductos * coeficiente;

        if (productividad <= 30) {
            bono = 25; // $25
        } else {
            if (productividad > 30 && productividad < 80) {
                bono = 50;
            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                } else {
                    if (productividad >= 200 && productividad <= 500) {
                        bono = 200;
                    } else {
                        bono = 300;
                    }
                }
            }
        }

        if (Localidad.equals("sierra")) {
            porcentajeSeguro = 10; //10%
        } else {
            if (Localidad.equals("costa")) {
                porcentajeSeguro = 12;//12%
            } else {
                if (Localidad.equals("oriente")) {
                    porcentajeSeguro = 15; //15%
                } else {
                    if (Localidad.equals("insular")) {
                        porcentajeSeguro = 30; //30%
                    }else{
                        porcentajeSeguro = 8;/*persona extranjera se le pone el 
                        porcentaje asignado al principio 
                        */
                    }
                }
            }
        }

        adicionalSeguro = (sueldoBasico * porcentajeSeguro) / 100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;

        System.out.printf("%s\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n",
                nombreEmpresa,
                nombre,
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);

    }

}
/*
De acuerdo a nueva normativa el % del seguro es variable si el empleado es de 
la sierra el % del seguro es 10%, costa 12%, oriente 15%, Insular 30%,acoplar la 
solucion para que considere la nueva normativa 
 */
