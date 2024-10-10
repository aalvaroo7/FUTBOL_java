package FUTBOL;

public class Futbolista extends Personal {
    private int dorsal;
    private String demarcacion;

    public Futbolista(String id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("Estoy jugando el partido.");
    }

    public void entrenar() {
        System.out.println("Estoy entrenando.");
    }
}