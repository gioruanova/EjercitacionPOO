package domain;

import java.util.Arrays;

public class Restaurant {

    private static final int CANTIDAD_MESAS = 5;

    private String nombre;
    private Mesa[] mesas;
    public Restaurant(String nombre) {
        this.nombre = nombre;
        this.mesas = new Mesa[CANTIDAD_MESAS];
    }

    // Validacion de que la mesa no se pise con una ya existente
    public void addMesa(Mesa mesa){

        for (int i = 0; i < mesas.length;i++) {
            if (mesas[i] != null && mesas[i].getIdMesa().equals(mesa.getIdMesa())) {
                System.out.println("ERROR: La mesa con el ID: " + mesa.getIdMesa() + " ya existe.");
                return;
            }
        }
            int i = 0;
                while(i < mesas.length){
                    if(this.mesas[i]== null){
                        this.mesas[i] = mesa;
                        break;
                    }
                    i++;
        }
                if (i < mesas.length){

                    System.out.println("Mesa con ID: " + mesa.getIdMesa() + " creada con exito");
                } else {
                    System.out.println("ERROR: Restaurante lleno");
                }
    }

    // Uso el metodo de Mesa setId pero como el padre es Restaurant es quien deberia poder cambiar el ID
    // pero habia que validar para que no se pise con uno existente
    public void cambiarIdMesa(Mesa mesa, Integer nuevoId){
        for (Mesa m : mesas){
            if(m != null && m.getIdMesa().equals(nuevoId)){
                System.out.println("ERROR: El nuevo ID " + nuevoId + " ya existe.");
                return;
            }
        }
        System.out.println("Se ha modificado el Id de la "+ mesa + "por el ID: " + nuevoId);
        mesa.setIdMesa(nuevoId);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mesa[] getMesas(Integer mesaCapacidad) {
        return mesas;
    }

    private void setMesas(Mesa[] mesas) {
        this.mesas = mesas;
    }

    // Metodos para Obtener Todas las mesas o por estado
    public Integer obtenerMesasDisponibles(){
        return obtenerMesasPorEstado(Mesa.MESA_DISPONIBLE);
    }
    public Integer obtenerMesasOcupadas(){
        return obtenerMesasPorEstado(Mesa.MESA_OCUPADA);
    }

    private Integer obtenerMesasPorEstado(String estado){
        int cantidad = 0;
        for(int i = 0; i < mesas.length; i++){
            if (mesas[i] != null && mesas[i].getEstado().equals(estado)){
                cantidad += 1;
            };
        }
        return cantidad;
    }

    public int obtenerTotalMesas(){
        int cantidad = 0;
        for(int i = 0; i < mesas.length;i++){
            if(mesas[i] != null){
                cantidad += 1;
            }
        }
        return cantidad;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "nombre='" + nombre + '\'' +
                ", mesas=" + Arrays.toString(mesas) +
                '}';
    }

}
