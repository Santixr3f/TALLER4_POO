/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author estuam
 */
public class Habitacion {
    int numero;
    String tipo;
    double precioNoche;
    boolean ocupada;

    // Constructor completo
    public Habitacion(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }

    // Constructor abreviado: precio 120000 y sin ocupar
    public Habitacion(int numero, String tipo) {
        this(numero, tipo, 120000, false);
    }

    public void ocupar() {
        ocupada = true;
    }

    public boolean estaDisponible() {
        return !ocupada;
    }

    public double calcularEstadia(int noches) {
        return precioNoche * noches;
    }

    // Reutiliza la versión de un parámetro
    public double calcularEstadia(int noches, double descuento) {
        double subtotal = calcularEstadia(noches);
        return subtotal - subtotal * descuento / 100;
    }

    public void mostrarInformacion() {
        System.out.println("Habitación " + numero + " | " + tipo + " | " + precioNoche
                + " por noche | ocupada: " + ocupada);
    }
}
