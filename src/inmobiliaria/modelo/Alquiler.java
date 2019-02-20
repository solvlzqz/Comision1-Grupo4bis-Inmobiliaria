
package inmobiliaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author Esteban
 * CAMBIO
 */
public class Alquiler {
    private int id_alquiler;
    private int id_persona;
    private int id_inmuebles;
    private LocalDate fecha_inicio;
    private LocalDate fechaFin;
    private double costo;

    public Alquiler(int id_alquiler, int id_persona, int id_inmuebles, LocalDate fecha_inicio, LocalDate fechaFin, double costo) {
        this.id_alquiler = id_alquiler;
        this.id_persona = id_persona;
        this.id_inmuebles = id_inmuebles;
        this.fecha_inicio = fecha_inicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
    }

    public Alquiler(int id_persona, int id_inmuebles, LocalDate fecha_inicio, LocalDate fechaFin, double costo) {
        this.id_persona = id_persona;
        this.id_inmuebles = id_inmuebles;
        this.fecha_inicio = fecha_inicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.id_alquiler = -1;
    }
 
    public Alquiler() {
    }

    public Alquiler(int id_alquiler, LocalDate fecha, int costo, String inmueble, String nombre_apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public int getId_alquiler() {
        return id_alquiler;
    }

    public int getidPersona() {
        return id_persona;
    }

    public int getId_inmuebles() {
        return id_inmuebles;
    }

    public LocalDate getfecha_inicio() {
        return fecha_inicio;
    }

    public LocalDate getfechaFin() {
        return fechaFin;
    }

    public double getCosto() {
        return costo;
    }
    
    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public void setidPersona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setId_inmuebles(int id_inmuebles) {
        this.id_inmuebles = id_inmuebles;
    }

    public void setfecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setfechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
/*PROBANDO*/
