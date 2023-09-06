package clases.ascensor;

//Crear una clase llamada Ascensor que tendrá los atributos numero de serie y
// marca y contenga las funcionalidades subir y bajar.

public class Ascensor {
    int nroSerie;
    String marca;


    public Ascensor(String marca, int nroSerie) {
        this.marca = marca;
        this.nroSerie = nroSerie;
    }

    public void Subir() {
        System.out.println("El ascensor " + this.marca + " nro de serie: " + this.nroSerie + " se encuentra SUBIENDO.");
    }

    public void Bajar() {
        System.out.println("El ascensor " + this.marca + " nro de serie: " + this.nroSerie + " se encuentra BAJANDO.");
    }

}
