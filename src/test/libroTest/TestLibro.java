package test.libroTest;

import clases.ejercicioLibro.Libro;

public class TestLibro {
    public static void main(String[] args) {

        System.out.println("\n");
        Libro libroUno = new Libro();
        libroUno.setTituloLibro("1984");
        libroUno.setAutorLibro("George Orwell");
        libroUno.setIsbn("#12345ABCD");
        libroUno.setNumeroPaginasLibro(224);
        libroUno.Mostrar();

        System.out.println("\n-------------------\n");


        Libro libroDos = new Libro();
        libroDos.setTituloLibro("Hacia Rutas Salvajes");
        libroDos.setAutorLibro("Jon Krakauer");
        libroDos.setIsbn("#C145B450X");
        libroDos.setNumeroPaginasLibro(224);
        libroDos.Mostrar();

        System.out.println("\n");

        libroUno.CompararLibro(libroDos);
        libroDos.CompararLibro(libroUno);

        System.out.println("\n");
    }


}
