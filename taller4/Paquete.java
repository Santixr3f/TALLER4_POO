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

    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino + " | " + peso + " kg | asegurado: " + asegurado);
    }
}