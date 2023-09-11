package test.avionTest;

import clases.avion.Avion;

public class TestAvion {
    public static void main(String[] args) {

        System.out.println("\n-----------\n");

        Avion avionUno = new Avion();
        avionUno.setModelo("Airbus");
        avionUno.setAlturaMaxima(10000.00);
        avionUno.setCapacidadPasajeros(800);
        avionUno.Volar();

        System.out.println("\n-----------\n");

        Avion avionDos = new Avion();
        avionDos.setModelo("Cesna");
        avionDos.setAlturaMaxima(5000.00);
        avionDos.setCapacidadPasajeros(4);
        avionDos.Aterrizar();

        System.out.println("\n-----------\n");

        Avion avionTres = new Avion();
        avionTres.setModelo("747");
        avionTres.setAlturaMaxima(10000.0);
        avionTres.setCapacidadPasajeros(450);
        avionTres.Aterrizar();

        System.out.println("\n-----------\n");
    }
}
