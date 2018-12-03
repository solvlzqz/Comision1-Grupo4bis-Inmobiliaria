/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.modelo;

/**
 *
 * @author Esteban
 */
public class Inmueble {
    private int id_inmueble;
    private String domicilio;
    private String ambientes;
    private double costo;
    private boolean disponibilidad;
    private int id_duenio;

    public Inmueble(int id_inmueble, String domicilio, String ambientes, double costo, boolean disponibilidad, int id_duenio) {
        this.id_inmueble = id_inmueble;
        this.domicilio = domicilio;
        this.ambientes = ambientes;
        this.costo = costo;
        this.disponibilidad = disponibilidad;
        this.id_duenio = id_duenio;
    }

    public Inmueble() {
    }

    
    public int getId_inmueble() {
        return id_inmueble;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getAmbientes() {
        return ambientes;
    }

    public double getCosto() {
        return costo;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setAmbientes(String ambientes) {
        this.ambientes = ambientes;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setDisponible(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }
    
    
}
