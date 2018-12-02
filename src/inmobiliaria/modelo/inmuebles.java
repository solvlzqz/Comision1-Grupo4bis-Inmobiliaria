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
public class inmuebles {
    private int id_inmuebles;
    private String domicilio;
    private int ambientes;
    private double costo;
    private boolean disponible;
    private int id_duenio;

    public inmuebles(int id_inmuebles, String domicilio, int ambientes, double costo, boolean disponible, int id_duenio) {
        this.id_inmuebles = id_inmuebles;
        this.domicilio = domicilio;
        this.ambientes = ambientes;
        this.costo = costo;
        this.disponible = disponible;
        this.id_duenio = id_duenio;
    }

    public int getId_inmuebles() {
        return id_inmuebles;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_inmuebles(int id_inmuebles) {
        this.id_inmuebles = id_inmuebles;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }
    
    
}
