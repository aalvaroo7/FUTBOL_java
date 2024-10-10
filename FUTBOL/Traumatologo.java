
package FUTBOL;

public class Traumatologo extends Personal {
    public Traumatologo(String id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void pasarConsulta() {
        System.out.println("Estoy pasando consulta.");
    }

    public void operar() {
        System.out.println("Estoy operando.");
    }
}