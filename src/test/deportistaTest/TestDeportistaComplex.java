package test.deportistaTest;

import clases.deportista.DeportistaComplex;

public class TestDeportistaComplex {
    public static void main(String[] args) {


        System.out.println("\n-----------\n");

        DeportistaComplex deportistaUno = new DeportistaComplex();
        deportistaUno.setAge(17);
        deportistaUno.setName("Jorgito");
        deportistaUno.Mostrar();
        deportistaUno.JugarPartido();


        System.out.println("\n-----------\n");

        DeportistaComplex deportistaDos = new DeportistaComplex();
        deportistaDos.setAge(22);
        deportistaDos.setName("Pepito");
        deportistaDos.Run();
        deportistaDos.Run();
        deportistaDos.Mostrar();
        deportistaDos.JugarPartido();

        System.out.println("\n-----------\n");

        DeportistaComplex deportistaTres = new DeportistaComplex();
        deportistaTres.setAge(35);
        deportistaTres.setName("Sultano");
        deportistaTres.Mostrar();
        deportistaTres.JugarPartido();


        System.out.println("\n-----------\n");


    }
}
