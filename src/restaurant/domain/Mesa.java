package domain;

public class Mesa {

    // Constantes
    public static final String MESA_OCUPADA = "La mesa esta ocupada";
    public static final String MESA_DISPONIBLE = "La mesa esta disponible";

    // Atributos
    private Integer idMesa;
  //  private boolean mesaEstado;

    // Cambie el boolean por un String para el estado de la mesa.
    private String mesaEstado;
    private Integer mesaCapacidad;


    // Getters & Setters
    public Mesa(Integer idMesa,String mesaEstado, Integer mesaCapacidad) {
        this.idMesa = idMesa;
        this.mesaEstado = mesaEstado;
        this.mesaCapacidad = mesaCapacidad;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public String getEstado() {
        return mesaEstado;
    }

    public void setMesaEstado(String mesaEstado) {
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

