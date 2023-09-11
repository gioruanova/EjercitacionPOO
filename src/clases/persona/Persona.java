package clases.persona;

//Crear una clase llamada Persona que tendrá los atributos nombre,apellido y edad
// y contenga las funcionalidades caminar,saltar,hablar.

public class Persona {
    private String name;
    private String lastname;
    private Integer age;

    private void setName(String name) {

        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String Mostrar(String name, String lastname, Integer age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        return "La persona " + name + " " + lastname + " de " + age + " años ";

    }


    public void Caminar(String name, String lastname, Integer age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        System.out.println(Mostrar(name,lastname,age) + ", esta caminando.\n");
    }



    public void Saltar(String name, String lastname, Integer age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        System.out.println(Mostrar(name,lastname,age) + ", esta saltando.\n");
    }

    public void Hablar(String name, String lastname, Integer age) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAge(age);
        System.out.println(Mostrar(name,lastname,age) + ", esta hablando.\n");
    }
}
