package clases.persona;

//Crear una clase llamada Persona que tendrá los atributos nombre,apellido y edad
// y contenga las funcionalidades caminar,saltar,hablar.

public class Persona {
    private String name;
    private String lastname;
    private int age;

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public void Caminar(String name, String lastname, int age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        System.out.println(this.name + " " + this.lastname + " tiene " + this.age + " años y esta caminando.\n");
    }

    public void Saltar(String name, String lastname, int age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        System.out.println(this.name + " " + this.lastname + " tiene " + this.age + " años y esta saltando.\n");
    }

    public void Hablar(String name, String lastname, int age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        System.out.println(this.name + " " + this.lastname + " tiene " + this.age + " años y esta hablando.\n");
    }
}
