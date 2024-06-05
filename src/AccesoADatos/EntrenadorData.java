/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Entrenador;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alakyan
 */
public class EntrenadorData {
    private Connection con=null;

    public EntrenadorData() {
        con=Conexion.getConexion();
    }
    public void guardarEntrenador(Entrenador entrenador){
    String sql="INSERT INTO entrenador (dni, nombre, apellido, especialidad, estado) VALUES (?,?,?,?,?)";
  
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS );
            ps.setInt(1, entrenador.getDni());
            ps.setString(2, entrenador.getNombre());
            ps.setString(3, entrenador.getApellido());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Socio añadido con exito");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla socio "+ ex);
        }
    }
    
    public void modificarEntrenador(Entrenador entrenador){
        String sql = "UPDATE entrenador SET dni=?,nombre=?,apellido=?,especialidad=?,estado=? WHERE idEntrenador=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, entrenador.getDni());
            ps.setString(2, entrenador.getNombre());
            ps.setString(3, entrenador.getApellido());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());
            ps.setInt(6, entrenador.getIdEntrenador());
            int exito=ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "modificado con exito");
            }else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
            }      
        }
    
    public Entrenador buscarEntrenador(int idEntrenador){
        Entrenador entrenador=null;
        String sql = "SELECT idEntrenador, nombre, apellido, estado FROM Entrenador WHERE idEntrenador = ?";
        PreparedStatement ps = null;
    try {
    ps = con.prepareStatement(sql);
    ps.setInt(1,idEntrenador );
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
     entrenador=new Entrenador(); 
     entrenador.setIdEntrenador(idEntrenador);
     entrenador.setNombre(rs.getString("nombre"));
     entrenador.setApellido(rs.getString("apellido"));
     entrenador.setEstado(rs.getBoolean("estado"));
        }else{
        JOptionPane.showMessageDialog(null, "No está registrado ese entrenador");
        }
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
    }
        return entrenador;

}
    
   public Entrenador buscarEntrenadorActivo(int idEntrenador){
        Entrenador entrenador=null;
        String sql = "SELECT idEntrenador, nombre, apellido, estado FROM Entrenador WHERE idEntrenador = ? AND estado = 1";
        PreparedStatement ps = null;
    try {
    ps = con.prepareStatement(sql);
    ps.setInt(1,idEntrenador );
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
     entrenador=new Entrenador(); 
     entrenador.setIdEntrenador(idEntrenador);
     entrenador.setNombre(rs.getString("nombre"));
     entrenador.setApellido(rs.getString("apellido"));
     entrenador.setEstado(rs.getBoolean("estado"));
        }else{
        JOptionPane.showMessageDialog(null, "No existe la materia");
        }
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
    }
        return entrenador;

} 
   
public Entrenador buscarEntrenadorXEspecialidad(String especialidad){
    Entrenador entrenador=null;
    <Entrenador> 
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
