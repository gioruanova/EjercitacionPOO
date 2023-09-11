package test.libroTest;

import clases.ejercicioLibro.Libro;

public class TestLibro {
    public static void main(String[] args) {

        System.out.println("\n");
        Libro libroUno = new Libro();
        libroUno.setTituloLibro("1984");
        libroUno.setAutorLibro("George Orwell");
        libroUno.setIsbn("#12345ABCD");
        libroUno.setNumeroPaginasLibro(350);
        libroUno.Mostrar();

        System.out.println("\n-------------------\n");


        Libro libroDos = new Libro();
        libroDos.setTituloLibro("Hacia Rutas Salvajes");
        libroDos.setAutorLibro("Jon Krakauer");
        libroDos.setIsbn("#C145B450X");
        libroDos.setNumeroPaginasLibro(224);
        libroDos.Mostrar();

        System.out.println("\n");

        if (libroUno.getNumeroPaginasLibro() > libroDos.getNumeroPaginasLibro()) {
            System.out.println("El libro " + libroUno.getTituloLibro() + " tiene mas paginas que el libro " + libroDos.getTituloLibro());
        } else if (libroUno.getNumeroPaginasLibro() < libroDos.getNumeroPaginasLibro()) {
            System.out.println("El libro " + libroDos.getTituloLibro() + " tiene mas paginas que el libro " + libroUno.getTituloLibro());
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de paginas");
        }
        System.out.println("\n");
    }
}
