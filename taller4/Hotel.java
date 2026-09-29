/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author estuam
 */
public class Hotel {
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion(101, "Sencilla");                 // constructor abreviado
        Habitacion h2 = new Habitacion(102, "Doble");                    // constructor abreviado
        Habitacion h3 = new Habitacion(201, "Suite", 350000, false);     // constructor completo

        h2.ocupar();

        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        System.out.println("Estadía de 3 noches en la 101: " + h1.calcularEstadia(3));
        System.out.println("Con 10% de descuento: " + h1.calcularEstadia(3, 10));
    }
}