package FUTBOL;

public class Entrenador extends Personal {
    private String idFederacion;

    public Entrenador(String id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Estoy dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Estoy dirigiendo un entrenamiento.");
    }
}