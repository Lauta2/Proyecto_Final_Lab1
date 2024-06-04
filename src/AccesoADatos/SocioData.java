package AccesoADatos;
import Entidades.Socio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SocioData {
    
    private Connection con=null;

    public SocioData() {
       con=Conexion.getConexion();
    }
    
  public void guardarSocio(Socio socio){
  String sql="INSERT INTO socio (dni, nombre, apellido, edad, correo, telefono,estado) VALUES (?,?,?,?,?,?,?)";
  
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS );
            ps.setInt(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setInt(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Socio añadido con exito");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla socio "+ ex);
        }
  
  
  }  
    
    
}
