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

/**
 *
 * @author Sole
 */
public class InmuebleData {
    
     private Connection con = null;

    public InmuebleData(Conexion conexion) {
        con = conexion.getConexion();
    }
    
    public void guardarInmueble(Inmueble inmueble) {
      
        try {
            String sql = "INSERT INTO inmueble (disponibilidad, domicilio, ambientes, costo, id_duenio) VALUES ( ? , ? , ?, ?, ?);";
            
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setBoolean(1, inmueble.getDisponibilidad());
            statement.setString(2, inmueble.getDomicilio());
            statement.setString(3, inmueble.getAmbientes());
            statement.setDouble(4, inmueble.getCosto());
            statement.setInt(5, inmueble.getId_duenio());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                inmueble.setId_inmueble(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un inmueble");
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un inmueble: " + ex.getMessage());
        }
    }
     
    public List<Inmueble> obtenerInmueble(){
        List<Inmueble> inmuebles = new ArrayList<Inmueble>();
            

        try {
            String sql = "SELECT * FROM inmueble;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Inmueble inmueble;
            while(resultSet.next()){
                inmueble = new Inmueble();
                inmueble.setId_inmueble(resultSet.getInt("id_inmueble"));
                inmueble.setDisponible(resultSet.getBoolean("disponibilidad"));
                inmueble.setDomicilio(resultSet.getString("domicilio"));
                inmueble.setAmbientes(resultSet.getString("ambientes"));
                inmueble.setCosto(resultSet.getDouble("costo"));
                inmueble.setId_duenio(resultSet.getInt("id_duenio"));
                
                inmuebles.add(inmueble);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los inmuebles: " + ex.getMessage());
        }
        
        
        return inmuebles;
    }
    
    public void borrarInmueble(int id_inmueble){
    try {
            
            String sql = "DELETE FROM inmueble WHERE id_inmueble =?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_inmueble);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un inmueble : " + ex.getMessage());
        }
        
    
    }
     
    
    public void actualizarInmueble(Inmueble inmueble){
    
        try {
            
            String sql = "UPDATE inmueble SET disponibilidad = ?, domicilio = ? , ambientes =? , costo = ?, id_duenio = ? WHERE id_inmueble = ?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setBoolean(1, inmueble.getDisponibilidad());
            statement.setString(2, inmueble.getDomicilio());
            statement.setString(3, inmueble.getAmbientes());
            statement.setDouble(4, inmueble.getCosto());
            statement.setInt(5, inmueble.getId_duenio());
            statement.setInt(6, inmueble.getId_inmueble());
            statement.executeUpdate();
 
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un inmueble: " + ex.getMessage());
        }
        
    }
    
    public Inmueble buscarInmueble(int id_inmueble){
    Inmueble inmueble=null;
    try {
            
            String sql = "SELECT * FROM inmueble WHERE id_inmueble =?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_inmueble);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                
                inmueble = new Inmueble();
                inmueble.setId_inmueble(resultSet.getInt("id_inmueble"));
                inmueble.setDisponible(resultSet.getBoolean("disponibilidad"));
                inmueble.setDomicilio(resultSet.getString("domicilio"));
                inmueble.setAmbientes(resultSet.getString("ambientes"));
                inmueble.setCosto(resultSet.getDouble("costo"));
                inmueble.setId_duenio(resultSet.getInt("id_duenio"));
                
            }      
            statement.close();

    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un inmueble: " + ex.getMessage());
        }
        
        return inmueble;
    }

    
}
