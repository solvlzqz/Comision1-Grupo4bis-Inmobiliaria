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
public class clientes {
    private int id_cliente;
    private int id_duenio;
    private String dni;
    private String celu;
    private String nombre;

    public clientes(int id_cliente, int id_duenio, String dni, String celu, String nombre) {
        this.id_cliente = id_cliente;
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.celu = celu;
        this.nombre = nombre;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public String getDni() {
        return dni;
    }

    public String getCelu() {
        return celu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCelu(String celu) {
        this.celu = celu;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
