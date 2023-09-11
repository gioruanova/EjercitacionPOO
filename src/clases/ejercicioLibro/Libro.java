package clases.ejercicioLibro;


//Crear una clase Libro que contenga los siguientes atributos:
//        • ISBN
//        • Titulo
//        • Autor
//        • Número de páginas
//        Crear sus respectivos métodos correspondientes para acceder a los atributos.
//        Crear el o los constructores que crea necesario.
//        Crear el método mostrar() para mostrar la información relativa al libro con el siguiente formato:
//        “El libro con ISBN creado por el autor tiene páginas”
//        En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla. Por
//        último, indicar cuál de los 2 tiene más páginas.

public class Libro {
    private String isbn;
    private String tituloLibro;
    private String autorLibro;
    private Integer numeroPaginasLibro;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public void setNumeroPaginasLibro(Integer numeroPaginasLibro) {
        this.numeroPaginasLibro = numeroPaginasLibro;
    }

    public Integer getNumeroPaginasLibro() {
        return numeroPaginasLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void Mostrar() {
        System.out.println("El libro " + this.tituloLibro + " con ISBN " + this.isbn + " creado por el autor " + this.autorLibro + ", tiene páginas" + this.numeroPaginasLibro);
    }


}
