/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Asistencia;
import Entidades.Clase;
import java.sql.*;
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
