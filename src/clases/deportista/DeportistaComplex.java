package clases.deportista;

public class DeportistaComplex {

    // Private attr
    private String name;
    private int resist;
    private int age;


    // Constructores
    public DeportistaComplex() {
        this.resist = 100;
    }


    // aca los getters y setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Metodos
    public void Run() {
        this.resist -= 2;
    }

    public void Mostrar() {
        System.out.println("El jugador " + this.name + " de edad " + this.age + " tiene de resistencia " + this.resist);
    }

    public void JugarPartido() {
        if (this.age >= 18 && this.resist > 99) {
            System.out.println("El jugador " + this.name + " de edad " + this.age + ", SI puede jugar el partido.");
        } else {
            System.out.println("El jugador " + this.name + " de edad " + this.age + ", NO puede jugar el partido.");
        }
    }
}
