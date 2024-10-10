
package FUTBOL;

public class MedicoRehabilitador extends Personal {
    public MedicoRehabilitador(String id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void pasarConsulta() {
        System.out.println("Estoy pasando consulta.");
    }

    public void darSesionRehabilitacion() {
        System.out.println("Estoy dando una sesión de rehabilitación.");
    }
}