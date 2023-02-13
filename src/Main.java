import Exceptions.AlumnosValuesExceptions;
import Exceptions.EquipoValuesException;
import Exceptions.ExceptionEquipo;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = null;
        try {
            equipo1 = new Equipo("Equipo 1");
        } catch (EquipoValuesException e) {
            System.err.println(e.getMessage());
        }
        Equipo equipo2 = null;
        try {
            equipo2 = new Equipo("Equipo 2");
        } catch (EquipoValuesException e) {
            System.err.println(e.getMessage());
        }

        Alumno alumno1 = null;
        try {
            alumno1 = new Alumno("Jose", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno alumno2 = null;
        try {
            alumno2 = new Alumno("Juan", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno alumno3 = null;
        try {
            alumno3 = new Alumno("Ana", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno alumno4 = null;
        try {
            alumno4 = new Alumno("Vanessa", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno alumno5 = null;
        try {
            alumno5 = new Alumno("Paloma", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno alumno6 = null;
        try {
            alumno6 = new Alumno("Paco", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }
        Alumno alumno7 = null;
        try {
            alumno7 = new Alumno("Damian", "123456789");
        } catch (AlumnosValuesExceptions e) {
            System.err.println(e.getMessage());
        }

        //AÑADIMOS A LOS ALUMNOS A LOS EQUIPOS Y COMPROBAMOS SI EXISTEN.

        try {
            equipo1.addAlumno(alumno1);
            if (equipo1.alumnoIntroducido(alumno1)) {
                System.out.println("El alumno " + alumno1 + " ha sido introducido.");
            }

            equipo1.addAlumno(alumno2);
            if (equipo1.alumnoIntroducido(alumno2)) {
                System.out.println("El alumno " + alumno2 + " ha sido introducido.");
            }

            equipo1.addAlumno(alumno3);
            if (equipo1.alumnoIntroducido(alumno3)) {
                System.out.println("El alumno " + alumno3 + " ha sido introducido.");
            }

            equipo2.addAlumno(alumno4);
            if (equipo2.alumnoIntroducido(alumno4)) {
                System.out.println("El alumno " + alumno4 + " ha sido introducido.");
            }
            equipo2.addAlumno(alumno5);
            if (equipo2.alumnoIntroducido(alumno5)) {
                System.out.println("El alumno " + alumno5 + " ha sido introducido.");
            }


            equipo2.addAlumno(alumno6);
            if (equipo2.alumnoIntroducido(alumno6)) {
                System.out.println("El alumno " + alumno6 + " ha sido introducido.");
            }

            equipo2.addAlumno(alumno7);
            if (equipo2.alumnoIntroducido(alumno7)) {
                System.out.println("El alumno " + alumno7 + " ha sido introducido.");
            }


            System.out.println("EQUIPO 1: ");
            equipo1.mostrarConjunto();
            System.out.println("EQUIPO 2: ");
            equipo2.mostrarConjunto();

            System.out.println("BORRANDO ALUMNO 2 DE EQUIPO 1");
            equipo1.removeAlumno(alumno2);
            System.out.println("EQUIPO 1: ");
            equipo1.mostrarConjunto();
            System.out.println("BORRANDO ALUMNO 7 DE EQUIPO 1");
            equipo2.removeAlumno(alumno7);
            System.out.println("EQUIPO 2: ");
            equipo2.mostrarConjunto();

            System.out.println("Existe :" + equipo1.existeAlumno(alumno1));

            equipo1.volcado(equipo2);
            System.out.println("Equipo1 unido equipo2");
            equipo1.mostrarConjunto();
            System.out.println("Equipo2.");
            equipo2.mostrarConjunto();

        } catch (ExceptionEquipo e) {
            System.err.println(e.getMessage());
        }





    }
}