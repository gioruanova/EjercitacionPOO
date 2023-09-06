package test.deportistaTest;

import clases.deportista.Deportista;

public class TestDeportista {
    public static void main(String[] args) {

        System.out.println("\n-----------\n");

        Deportista deportistaUno = new Deportista();
        deportistaUno.setName("Lio");
        deportistaUno.setLastName("Messi");
        deportistaUno.setSportSelected("Futbol");
        deportistaUno.Correr();

        System.out.println("\n-----------\n");

        Deportista deportistaDos = new Deportista();
        deportistaDos.setName("Tiger");
        deportistaDos.setLastName("Woods");
        deportistaDos.setSportSelected("Golf");
        deportistaDos.Descansar();

        System.out.println("\n-----------\n");

        Deportista deportistaTres = new Deportista();
        deportistaTres.setName("Michael");
        deportistaTres.setLastName("Jordan");
        deportistaTres.setSportSelected("Basket");
        deportistaTres.Saltar();

        System.out.println("\n-----------\n");


    }
}
