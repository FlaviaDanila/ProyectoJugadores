
package cfs003.proyectojugadores;


/**
 *
 * @author FlaviaDanila
 */
public class Jugador {
    
    private int dni;
    private String nombre;
    private int edad;
    private int idEquipo;

    public Jugador() {
        super();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    
}
