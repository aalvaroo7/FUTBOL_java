package FUTBOL;

public class Entrenador extends Personal {

    public Entrenador(String id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void dirigirPartido() {
        System.out.println("Estoy dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Estoy dirigiendo un entrenamiento.");
    }
}