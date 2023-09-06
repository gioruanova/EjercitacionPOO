package test.personaTest;

import clases.persona.Persona;

public class TestPersona {
    public static void main(String[] args) {

        System.out.println("\n-----------\n");

        Persona personaUno = new Persona();
        personaUno.Caminar("Jorge","Ruanova",32);


        System.out.println("\n-----------\n");

        Persona personaDos = new Persona();
        personaDos.Saltar("Carlos","Perez",40);


        System.out.println("\n-----------\n");

        Persona personaTres = new Persona();
        personaTres.Hablar("Lio","Messi",37);

        System.out.println("\n-----------\n");
    }
}
