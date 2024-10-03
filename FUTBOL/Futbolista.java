package FUTBOL;

public class Futbolista extends Personal {

    public Futbolista(String id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void jugarPartido() {
        System.out.println("Estoy jugando el partido.");
    }

    public void entrenar() {
        System.out.println("Estoy entrenando.");
    }
}