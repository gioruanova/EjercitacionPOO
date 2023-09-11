package test.ascensorTest;

import clases.ascensor.Ascensor;

public class TestAscensor {
    public static void main(String[] args) {

        System.out.println("\n-----------\n");

        Ascensor ascensorUno = new Ascensor("Samsung",12345);
        ascensorUno.Subir();

        System.out.println("\n-----------\n");

        Ascensor ascensorDos = new Ascensor("LG",7500004);
        ascensorDos.Bajar();


        System.out.println("\n-----------\n");

    }
}
