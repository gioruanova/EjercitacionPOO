package test.deportistaTest;
import clases.deportista.DeportistaComplex;

//> 18 años && resistencia >=99 = puede jugar

public class TestDeportistaComplex {
    public static void main(String[] args) {


        System.out.println("\n-----------\n");

        DeportistaComplex deportistaUno = new DeportistaComplex();
        deportistaUno.setAge(17);
        deportistaUno.setName("Uno");
        deportistaUno.Mostrar();
        deportistaUno.JugarPartido();


        System.out.println("\n-----------\n");

        DeportistaComplex deportistaDos = new DeportistaComplex();
        deportistaDos.setAge(22);
        deportistaDos.setName("Dos");
        deportistaDos.Run();
        deportistaDos.Run();
        deportistaDos.Mostrar();
        deportistaDos.JugarPartido();

        System.out.println("\n-----------\n");

        DeportistaComplex deportistaTres = new DeportistaComplex();
        deportistaTres.setAge(35);
        deportistaTres.setName("Tres");
        deportistaTres.Mostrar();
        deportistaTres.JugarPartido();


        System.out.println("\n-----------\n");


    }
}
