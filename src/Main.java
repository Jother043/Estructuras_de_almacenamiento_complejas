import Exceptions.AlumnosValuesExceptions;
import Exceptions.EquipoValuesException;

public class Main {
    public static void main(String[] args) {
        try {
            Equipo equipo1 = new Equipo("Equipo 1");
        } catch (EquipoValuesException e) {
            System.err.println(e.getMessage());
        }
        try {
            Equipo equipo2 = new Equipo("Equipo 2");
        } catch (EquipoValuesException e) {
            System.err.println(e.getMessage());
        }

        Alumno Alumno1 = null;
        try {
            Alumno1 = new Alumno("Jose", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno Alumno2 = null;
        try {
            Alumno2 = new Alumno("Juan", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno Alumno3 = null;
        try {
            Alumno3 = new Alumno("Ana", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno Alumno4 = null;
        try {
            Alumno4 = new Alumno("Vanessa", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno Alumno5 = null;
        try {
            Alumno5 = new Alumno("Paloma", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno Alumno6 = null;
        try {
            Alumno6 = new Alumno("juan", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno Alumno7 = null;
        try {
            Alumno7 = new Alumno("Jose", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }

            e1.add(a2);
            e1.add(a3);
            e1.add(a4);


            e2.add(a3);
            e2.add(a4);
            e2.add(a5);
            e2.add(a6);

            e1.muestraEquipo();
            System.out.println("----------------");
            e2.muestraEquipo();
            System.out.println("----------------");

            //e1.union(e2);
            e1.interseccion2(e2);
            e1.muestraEquipo();

    }
}