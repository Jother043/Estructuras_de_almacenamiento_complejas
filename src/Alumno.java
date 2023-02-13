import Exceptions.AlumnosValuesExceptions;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private String dni;

    public Alumno(String nombre, String dni) throws AlumnosValuesExceptions {
        setDni(dni);
        setNombre(nombre);
    }

    public void setNombre(String nombre) throws AlumnosValuesExceptions {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new AlumnosValuesExceptions("El nombre del alumno puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setDni(String dni) throws AlumnosValuesExceptions {
        if (dni == null || dni.trim().isEmpty()) {
            throw new AlumnosValuesExceptions("El dni del alumno no puede estar vacío");
        }
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno:" + nombre + "," + dni ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }
}
