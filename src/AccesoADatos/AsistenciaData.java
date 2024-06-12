/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Socio;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alakyan
 */
public class AsistenciaData {
    private Connection con = null;

    public AsistenciaData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAsistencia(Asistencia asistencia) {
        String sql = "INSERT INTO asistencia (idSocio, idClase, fechaAsistencia) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, asistencia.getSocio().getIdSocio());
            ps.setInt(2, asistencia.getClase().getIdClase());
            ps.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Asistencia Confirmada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase: " + ex.getMessage());
        }
    }
    
    public int cantidadPresentes(int idClase ,LocalDate fechaAsistencia){
        Date fecha=Date.valueOf(fechaAsistencia);
        int presentes=-1;
        String sql="SELECT COUNT(asistencia.idSocio) FROM asistencia JOIN socio ON(asistencia.idSocio=socio.idSocio) WHERE idClase=? AND fechaAsistencia=? AND socio.estado=1";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idClase);
            ps.setDate(2, fecha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               presentes=rs.getInt(1);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al Buscar Presentes!");
        }
        return presentes;  
    }
    
    
    
    
    public void eliminarAsistencia(int idAsistencia) {
        String sql = "DELETE FROM `asistencia` WHERE idAsistencia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAsistencia);
            int success = ps.executeUpdate();
            if (success == 1) {
                JOptionPane.showMessageDialog(null, "Asistencia eliminada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la Asistencia para eliminar.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Asistencia: " + ex.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
