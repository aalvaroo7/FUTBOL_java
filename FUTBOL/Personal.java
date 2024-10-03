package FUTBOL;

public class Personal {
    private String id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Personal(String id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }
}
