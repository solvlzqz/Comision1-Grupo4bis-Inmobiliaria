/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sole
 */
public class PersonaData {
    
    private Connection con = null;

    public PersonaData(Conexion conexion) {
        con = conexion.getConexion();}
        
    public void guardarPersona(Persona persona) {
      
        try {
            String sql = "INSERT INTO persona (nombre_apellido, dni, celu, id_duenio) VALUES ( ? , ? , ?, ? );";
            
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, persona.getNombreApellido());
            statement.setString(2, persona.getDni());
            statement.setString(3, persona.getCelu());
            statement.setInt(4, persona.getIdPersona());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                persona.setIdPersona(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una persona");
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar una persona: " + ex.getMessage());
        }
    }
    
    public List<Persona> obtenerPersona(){
        List<Persona> personas = new ArrayList<Persona>();
            

        try {
            String sql = "SELECT * FROM persona;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Persona persona;
            while(resultSet.next()){
                persona = new Persona();
                persona.setIdPersona(resultSet.getInt("id_persona"));
                persona.setNombreApellido(resultSet.getString("nombre_apellido"));
                persona.setDni(resultSet.getString("dni"));
                persona.setCelu(resultSet.getString("celu"));
                persona.setId_duenio(resultSet.getInt("id_duenio"));

                personas.add(persona);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las personas: " + ex.getMessage());
        }
        
        
        return personas;
    }
    
    public void borrarPersona(int id_persona){
    try {
            
            String sql = "DELETE FROM alumno WHERE id_persona=?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_persona);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una persona: " + ex.getMessage());
        } 
    
    }
    public void actualizarPersona(Persona persona){
    
        try {
            
            String sql = "UPDATE persona SET nombre_apellido = ?, dni = ?, celu = ?, id_duenio = ? WHERE id_persona = ?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, persona.getNombreApellido());
            statement.setString(2, persona.getDni());
            statement.setString(3, persona.getCelu());
            statement.setInt(4, persona.getId_duenio());
            statement.setInt(5, persona.getIdPersona());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una persona: " + ex.getMessage());
        }
    
    }
    
        public Persona buscarPersona(int id_persona){
    Persona persona = null;
    try {
            
            String sql = "SELECT * FROM persona WHERE id_persona =?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_persona);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                persona = new Persona();
                persona.setIdPersona(resultSet.getInt("id_persona"));
                persona.setNombreApellido(resultSet.getString("nombre_apellido"));
                persona.setDni(resultSet.getString("dni"));
                persona.setCelu(resultSet.getString("celu"));
                persona.setId_duenio(resultSet.getInt("id_duenio"));
            }      
            statement.close();     
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar una persona: " + ex.getMessage());
        }
        
        return persona;
    }

    }
    
    
    

