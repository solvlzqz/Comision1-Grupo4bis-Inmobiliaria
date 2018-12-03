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
public class persona {
    private int id_persona;
    private int id_duenio;
    private String dni;
    private String celu;
    private String nombre;

    public persona(int id_persona, int id_duenio, String dni, String celu, String nombre) {
        this.id_persona = id_persona;
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.celu = celu;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return id_persona;
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

    public void setIdPersona(int id_persona) {
        this.id_persona = id_persona;
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
