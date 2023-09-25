package ejBicicleta.domain;

public class Bicicleta {

    // Constantes
    public static final String ESTADO_DISPONIBLE = "DISPONIBLE";
    public static final String ESTADO_EN_USO = "EN USO";
    public static final String ESTADO_REPARACION = "EN REPARACION";

    //Atributos
    private Integer codigo;
    private String estado;

    //Constructor
    public Bicicleta(Integer codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    // Getters & Setters
    public Integer getCodigo() {
        return codigo;
    }

    private void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodo sobreescrito
    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigo=" + codigo +
                ", estado='" + estado + '\'' +
                '}';
    }
}
