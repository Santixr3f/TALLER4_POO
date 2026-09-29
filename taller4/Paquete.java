package taller4;

public class Paquete {
    String codigo;
    String destino;
    double peso;
    boolean asegurado;

    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }
    // Punto 1: código y destino → peso 1.0, sin seguro
public Paquete(String codigo, String destino) {
    this(codigo, destino, 1.0, false);
}

// Punto 2: solo código → destino "Por asignar"
public Paquete(String codigo) {
    this(codigo, "Por asignar");
}

    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino + " | " + peso + " kg | asegurado: " + asegurado);
    }
}