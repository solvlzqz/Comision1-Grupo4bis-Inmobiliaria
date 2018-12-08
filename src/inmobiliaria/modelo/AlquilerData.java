/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.modelo;

import java.sql.Connection;
import java.sql.Date;
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
public class AlquilerData {
    // variable de tipo Connection
    private Connection con = null;

    public AlquilerData(Conexion conexion) {
        con = conexion.getConexion();
    }
    
    public void guardarAlquiler(Alquiler alquiler) {
      
        try {
            String sql = "INSERT INTO alquiler (id_persona, id_inmuebles, fecha_inicio, fechaFin, costo) VALUES ( ? , ? , ?, ?, ?);";
            
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, alquiler.getidPersona());
            statement.setInt(2, alquiler.getId_inmuebles());
            statement.setDate(3, Date.valueOf(alquiler.getfecha_inicio()));
            statement.setDate(4, Date.valueOf(alquiler.getfechaFin()));
            statement.setDouble(5, alquiler.getCosto());
                      
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                alquiler.setId_alquiler(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alquiler");
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alquiler: " + ex.getMessage());
        }
    }
    
    public List<Alquiler> obtenerAlquiler(){
        List<Alquiler> alquileres = new ArrayList<Alquiler>();
            

        try {
            String sql = "SELECT * FROM alquiler;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Alquiler alquiler;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setCosto(resultSet.getInt("costo"));
                alquiler.setId_inmuebles(resultSet.getInt("id_inmuebles"));
                alquiler.setfechaFin(resultSet.getDate("fechaFin").toLocalDate());
                alquiler.setfecha_inicio(resultSet.getDate("fecha_inicio").toLocalDate());
                alquiler.setidPersona(resultSet.getInt("id_persona"));

                alquileres.add(alquiler);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alquileres: " + ex.getMessage());
        }
        
        
        return alquileres;
    }

    public void borrarAlquiler(int id_alquiler){
    try {
            
            String sql = "DELETE FROM alquiler WHERE id_alquiler= ?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_alquiler);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alquiler: " + ex.getMessage());
        }
        
    
    }
    public void actualizarAlquiler(Alquiler alquiler){
    
        try {
            
            String sql = "UPDATE alquiler SET fecha_inicio = ?, fechaFin = ? , costo =?, id_inmuebles = ?, id_persona = ? WHERE id_alquiler = ?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, Date.valueOf(alquiler.getfecha_inicio()));
            statement.setDate(2, Date.valueOf(alquiler.getfechaFin()));
            statement.setDouble(3, alquiler.getCosto());
            statement.setInt(4, alquiler.getId_inmuebles());
            statement.setInt(5, alquiler.getidPersona());
            statement.setInt(6, alquiler.getId_alquiler());
            statement.executeUpdate();
            
         
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alquiler: " + ex.getMessage());
        }
    
    }

    public Alquiler buscarAlquiler(int id_alquiler){
    Alquiler alquiler=null;
    try {
            
            String sql = "SELECT * FROM alquiler WHERE id_alquiler;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_alquiler);    
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                
                alquiler = new Alquiler();
                alquiler.setId_alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setCosto(resultSet.getInt("costo"));
                alquiler.setId_inmuebles(resultSet.getInt("id_inmuebles"));
                alquiler.setfechaFin(resultSet.getDate("fechaFin").toLocalDate());
                alquiler.setfecha_inicio(resultSet.getDate("fecha_inicio").toLocalDate());
                alquiler.setidPersona(resultSet.getInt("id_persona"));
                   
            }      
            statement.close();
         
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alquiler: " + ex.getMessage());
        }
        
        return alquiler;
    }
    
}
