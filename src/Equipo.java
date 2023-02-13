import Exceptions.EquipoValuesException;
import Exceptions.ExceptionEquipo;

import java.util.Set;

public class Equipo {
    private String nombreEquipo;
    private Set<Alumno> alumnos;

    public Equipo(String nombreEquipo) throws EquipoValuesException {
        setNombreEquipo(nombreEquipo);
        this.alumnos = alumnos;
    }

    public void setNombreEquipo(String nombreEquipo) throws EquipoValuesException {
        if(nombreEquipo == null || nombreEquipo.trim().isEmpty()){
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
     * @param alumno
     * @throws ExceptionEquipo
     */
    public void addAlumno(Alumno alumno) throws ExceptionEquipo {
        if(!this.alumnos.add(alumno)){
            throw new ExceptionEquipo("No se puede añadir al jugador");
        }else{
            this.alumnos.add(alumno);
        }
    }

    public void removeAlumno(Alumno alumno) throws ExceptionEquipo {
        if(!this.alumnos.remove(alumno)){
            throw new ExceptionEquipo("El alumno no se puede eliminar del equipo");
        }else{
            this.alumnos.remove(alumno);
        }
    }

    public Alumno existeAlumno(Alumno alumno){
        if(this.alumnos.contains(alumno)){
            return alumno ;
        }else{
            return null;
        }
    }

    public void mostrarConjunto(Alumno alumno){
        while(this.alumnos.iterator().hasNext()){
            System.out.println("Jugador : " + this.alumnos.iterator().next());
        }
    }

}
