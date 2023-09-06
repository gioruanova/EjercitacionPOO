package clases.deportista;

//Crear una clase llamada Deportista que tendrá los atributos nombre, apellido y
// deporte que practica y contenga las funcionalidades correr, saltar y descansar.

public class Deportista {
    String name;
    String lastName;
    String sportSelected;


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSportSelected(String sportSelected) {
        this.sportSelected = sportSelected;
    }



    public void Correr() {
        System.out.println("El jugador " + this.name + " " + this.lastName + " que practica " + this.sportSelected + ", se encuentra CORRIENDO.");
    }

    public void Saltar() {
        System.out.println("El jugador " + this.name + " " + this.lastName + " que practica " + this.sportSelected + ", se encuentra SALTANDO.");
    }

    public void Descansar() {
        System.out.println("El jugador " + this.name + " " + this.lastName + " que practica " + this.sportSelected + ", se encuentra DESCANSANDO.");
    }
}
