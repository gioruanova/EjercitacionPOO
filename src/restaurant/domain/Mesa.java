package restaurant.domain;

public class Mesa {

    // Constantes
    public static final String MESA_OCUPADA = "La mesa esta ocupada";
    public static final String MESA_DISPONIBLE = "La mesa esta disponible";

    // Atributos
    private Integer idMesa;
    private boolean mesaEstado;
    private Integer mesaCapacidad;


    // Getters & Setters
    public Mesa(Integer idMesa, Integer mesaCapacidad) {
        this.idMesa = idMesa;
        this.mesaEstado = true;
        this.mesaCapacidad = mesaCapacidad;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public boolean isMesaEstado() {
        return mesaEstado;
    }

    public void setMesaEstado(boolean mesaEstado) {
        this.mesaEstado = mesaEstado;
    }

    public Integer getMesaCapacidad() {
        return mesaCapacidad;
    }

    public void setMesaCapacidad(Integer mesaCapacidad) {
        this.mesaCapacidad = mesaCapacidad;
    }


    // Metodos

    @Override
    public String toString() {
        return "Mesa{" +
                "idMesa=" + idMesa +
                ", mesaEstado=" + mesaEstado +
                ", mesaCapacidad=" + mesaCapacidad +
                '}';
    }
}

