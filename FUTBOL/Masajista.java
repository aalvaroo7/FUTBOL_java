package FUTBOL;

public class Masajista extends Personal {

    public Masajista(String id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void darMasaje() {
        System.out.println("Estoy dando un masaje.");
    }
}