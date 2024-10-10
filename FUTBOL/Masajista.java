package FUTBOL;

public class Masajista extends Personal {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("Estoy dando un masaje.");
    }
}