import Exceptions.EquipoValuesException;
import Exceptions.ExceptionEquipo;

import java.util.HashSet;
import java.util.Set;

public class Equipo {
    private String nombreEquipo;
    private Set<Alumno> alumnos;

    public Equipo(String nombreEquipo) throws EquipoValuesException {
        setNombreEquipo(nombreEquipo);
        this.alumnos = new HashSet<>();
        ;
    }

    public void setNombreEquipo(String nombreEquipo) throws EquipoValuesException {
        if (nombreEquipo == null || nombreEquipo.trim().isEmpty()) {
            throw new EquipoValuesException("El nombre del equipo no puede estar vacío.");
        }
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Método con el que añadimos un alumno siempre y cuando no exista, ya que con el Set
     * solo podemos tener 1 objeto igual.
     * El alumno lo añadimos con el método add de la interfaz collections.
     * @param alumno
     * @throws ExceptionEquipo
     */
    public void addAlumno(Alumno alumno) throws ExceptionEquipo {
        if (!this.alumnos.add(alumno)) {
            throw new ExceptionEquipo("No se puede añadir al jugador");
        } else {
            this.alumnos.add(alumno);
        }
    }

    /**
     * Método que elimina alumnos del equipo con el método remove de la interfaz collection.
     * @param alumno
     * @throws ExceptionEquipo
     */
    public void removeAlumno(Alumno alumno) throws ExceptionEquipo {
        if (!this.alumnos.remove(alumno)) {
            throw new ExceptionEquipo("El alumno no se puede eliminar del equipo");
        } else {
            this.alumnos.remove(alumno);
        }
    }

    /**
     * Método con el que comprobamos si existe un alumno en un equipo devolviendo el jugador
     * si existe en ese momento en el equipo y null si no existe esto lo comprobamos con el método contains
     * de la interfaz collection.
     * @param alumno
     * @return
     */
    public Alumno existeAlumno(Alumno alumno) {
        if (this.alumnos.contains(alumno)) {
            return alumno;
        } else {
            return null;
        }
    }

    /**
     * Método booleano que nos dice si un alumno pertenece a un equipo nos devuelve true.
     * @param alumno
     * @return
     */
    public boolean alumnoIntroducido(Alumno alumno) {
        if (this.alumnos.contains(alumno)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que simplemente muestra el contenedor con un foreach.
     */
    public void mostrarConjunto() {
        for(Alumno alumno : alumnos){
            System.out.println("ALUMNO : " + alumno);
        }
    }

    /**
     * método que vuelca el contenido de un contenedor a otro, mediante el método addAll de
     * la interfaz Collection.
     * @param equipo
     */
    public void volcado(Equipo equipo) {
        this.alumnos.addAll(equipo.getAlumnos());
    }



}
