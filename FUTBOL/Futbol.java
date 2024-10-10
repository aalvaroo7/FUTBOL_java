package FUTBOL;

import java.util.ArrayList;
import java.util.List;

public class Futbol {
    public static void main(String[] args) {
        // Crear objetos de las clases Entrenador, Futbolista, Masajista, MedicoRehabilitador y Traumatologo
        Entrenador entrenador = new Entrenador("E001", "Juan", "Pérez", 45, "FED001");
        Futbolista futbolista = new Futbolista("F001", "Carlos", "Gómez", 28, 10, "Delantero");
        Masajista masajista = new Masajista("M001", "Ana", "López", 35, "Fisioterapia", 10);
        MedicoRehabilitador medicoRehabilitador = new MedicoRehabilitador("MR001", "Luis", "Martínez", 40);
        Traumatologo traumatologo = new Traumatologo("T001", "María", "Fernández", 38);

        // Crear una lista para almacenar los objetos
        List<Personal> personalList = new ArrayList<>();
        personalList.add(entrenador);
        personalList.add(futbolista);
        personalList.add(masajista);
        personalList.add(medicoRehabilitador);
        personalList.add(traumatologo);

        // Recorrer la lista y mostrar nombre, apellidos e invocar a concentrarse()
        for (Personal personal : personalList) {
            System.out.println(personal.getNombre() + " " + personal.getApellidos());
            personal.concentrarse();
        }

        // Invocar métodos específicos de cada clase
        System.out.println(entrenador.getNombre() + " " + entrenador.getApellidos());
        entrenador.dirigirEntrenamiento();

        System.out.println(futbolista.getNombre() + " " + futbolista.getApellidos());
        futbolista.entrenar();

        System.out.println(masajista.getNombre() + " " + masajista.getApellidos());
        masajista.darMasaje();

        System.out.println(medicoRehabilitador.getNombre() + " " + medicoRehabilitador.getApellidos());
        medicoRehabilitador.pasarConsulta();
        medicoRehabilitador.darSesionRehabilitacion();

        System.out.println(traumatologo.getNombre() + " " + traumatologo.getApellidos());
        traumatologo.pasarConsulta();
        traumatologo.operar();

        // Recorrer la lista y mostrar nombre, apellidos e invocar métodos específicos
        for (Personal personal : personalList) {
            System.out.println(personal.getNombre() + " " + personal.getApellidos());
            if (personal instanceof Entrenador) {
                ((Entrenador) personal).dirigirEntrenamiento();
            } else if (personal instanceof Futbolista) {
                ((Futbolista) personal).entrenar();
            } else if (personal instanceof Masajista) {
                ((Masajista) personal).darMasaje();
            } else if (personal instanceof MedicoRehabilitador) {
                ((MedicoRehabilitador) personal).pasarConsulta();
                ((MedicoRehabilitador) personal).darSesionRehabilitacion();
            } else if (personal instanceof Traumatologo) {
                ((Traumatologo) personal).pasarConsulta();
                ((Traumatologo) personal).operar();
            }
        }
    }
}