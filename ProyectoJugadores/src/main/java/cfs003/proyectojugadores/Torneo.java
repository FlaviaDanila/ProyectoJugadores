package cfs003.proyectojugadores;

import java.util.Calendar;

/**
 *
 * @author FlaviaDanila
 */
public class Torneo {

    private int idTorneo;
    private String nombre;
    private Calendar fecha;

    public Torneo() {
        super();
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

}
