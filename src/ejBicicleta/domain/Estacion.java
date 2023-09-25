package ejBicicleta.domain;

import java.util.Arrays;

public class Estacion {
    // Constantes
    private static final int CANTIDAD_DE_BICICLETAS = 5;

    // Atributos
    private Integer id;
    private String nombre;
    private Bicicleta[] bicicletas;


    // Constructor
    public Estacion(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.bicicletas = new Bicicleta[CANTIDAD_DE_BICICLETAS];
    }

    // Sobreescribir el constructor par hacer la cantidad variable
    public Estacion(Integer id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.bicicletas = new Bicicleta[cantidad];
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    private void setBicicletas(Bicicleta[] bicicletas) {
        this.bicicletas = bicicletas;
    }

    public void addBicicleta(Bicicleta bicicleta) {
        // con FOR
//        for (int i = 0; i < bicicletas.length; i++) {
//            if (this.bicicletas[i] == null) {
//                this.bicicletas[i] = bicicleta;
//                break;
//            }
//        }
//        con WHILE
        // Variable de control
        int i = 0;
        while (i < bicicletas.length) { // control de la variable

            if (this.bicicletas[i] == null) {
                this.bicicletas[i] = bicicleta;
                break;
            }
            i++; // incremento de la variable de control
        }

        // Controlar si la estacion ya esta completa
        if (i >= bicicletas.length) {
            System.out.println("ERROR - Maximo alcanzado");
        }
    }

    // Metodo de negocio
    public int obtenerDisponibles() {
        return obtenerCantidadPorEstado(Bicicleta.ESTADO_DISPONIBLE);
    }

    public int obtenerEnUso() {
        return obtenerCantidadPorEstado(Bicicleta.ESTADO_EN_USO);
    }

    public int obtenerEnReparacion() {
        return obtenerCantidadPorEstado(Bicicleta.ESTADO_REPARACION);
    }

    private int obtenerCantidadPorEstado(String estado) {
        int cantidad = 0;
        for (int i = 0; i < this.bicicletas.length; i++) {
            if (bicicletas[i] != null && bicicletas[i].getEstado().equals(estado)) {
                cantidad = cantidad + 1; // ó resultado++;
            }
        }

        return cantidad;
    }

    public int obtenerTotalBicicletas() {
        int cantidad = 0;
        for (int i = 0; i < this.bicicletas.length; i++) {
            if (bicicletas[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public Double mostrarEstadoDeLaEstacion(String estadoDeBicicleta){
        double cantidadPorEstado = (double) obtenerCantidadPorEstado(estadoDeBicicleta);
        double totalBicicletas= (double) obtenerTotalBicicletas();


        double porcentajePorEstado = (cantidadPorEstado / totalBicicletas)*100;



        return porcentajePorEstado;
    }

    //    Metodo sobreescrito
    @Override
    public String toString() {
        return "Estacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", bicicletas=" + Arrays.toString(bicicletas) +
                '}';
    }
}
