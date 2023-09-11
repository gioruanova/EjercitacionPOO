package clases.avion;

//Crear una clase llamada Avion que tendrá los atributos modelo, capacidad depersonas y altura maxima (en metros) y contenga las funcionalidades volar y
// aterrizar.


public class Avion {
    private String modelo;
    private Integer capacidadPasajeros;
    protected Double alturaMaxima;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAlturaMaxima(Double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }


    public void Volar() {
        System.out.println("El avion modelo " + this.modelo + " con capacidad de " + this.capacidadPasajeros + " pasajeros, y su maximo de altitud es " + this.alturaMaxima + "mts, esta VOLANDO.");
    }

    public void Despegar() {
        System.out.println("El avion modelo " + this.modelo + " con capacidad de " + this.capacidadPasajeros + " pasajeros, y su maximo de altitud es " + this.alturaMaxima + "mts, esta DESPEGANDO.");
    }

    public void Aterrizar() {
        System.out.println("El avion modelo " + this.modelo + " con capacidad de " + this.capacidadPasajeros + " pasajeros, y su maximo de altitud es " + this.alturaMaxima + "mts, esta ATERRIZANDO.");

    }

}
