
package inmobiliaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author Esteban
 */
public class Alquileres {
    private int id_cliente;
    private int id_inmuebles;
    private LocalDate inicio;
    private LocalDate fin;
    private double costo;

    public Alquileres(int id_cliente, int id_inmuebles, LocalDate inicio, LocalDate fin, double costo) {
        this.id_cliente = id_cliente;
        this.id_inmuebles = id_inmuebles;
        this.inicio = inicio;
        this.fin = fin;
        this.costo = costo;
    }

    public int getid_cliente() {
        return id_cliente;
    }

    public int getId_inmuebles() {
        return id_inmuebles;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public double getCosto() {
        return costo;
    }

    public void setid_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_inmuebles(int id_inmuebles) {
        this.id_inmuebles = id_inmuebles;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
