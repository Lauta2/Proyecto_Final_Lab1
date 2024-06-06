package AccesoADatos;
import Entidades.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
  public Socio buscarSocio(int idSocio) {
        Socio socio = null;
        String sql = "SELECT dni, nombre, apellido, edad, correo, telefono, estado FROM Socio WHERE idSocio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(idSocio);
                socio.setDni(rs.getInt("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getInt("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el socio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el socio: " + ex.getMessage());
        }
        return socio;
    }

    public List<Socio> listarSocios() {
        List<Socio> socios = new ArrayList<>();
        String sql = "SELECT * FROM Socio";
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Socio socio = new Socio();
                socio.setIdSocio(resultSet.getInt("idSocio"));
                socio.setDni(resultSet.getInt("dni"));
                socio.setNombre(resultSet.getString("nombre"));
                socio.setApellido(resultSet.getString("apellido"));
                socio.setEdad(resultSet.getInt("edad"));
                socio.setCorreo(resultSet.getString("correo"));
                socio.setTelefono(resultSet.getInt("telefono"));
                socio.setEstado(resultSet.getBoolean("estado"));
                socios.add(socio);
            }
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los socios: " + ex.getMessage());
        }
        return socios;
    }

    public void modificarSocio(Socio socio) {
        String sql = "UPDATE Socio SET dni = ?, nombre = ?, apellido = ?, edad = ?, correo = ?, telefono = ?, estado = ? WHERE idSocio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setInt(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());
            ps.setInt(8, socio.getIdSocio());
            int rowCount = ps.executeUpdate();
            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "Socio modificado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el socio para modificar.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el socio: " + ex.getMessage());
        }
    }
//cambiar booleano
    public void eliminarSocio(int idSocio) {
        String sql = "UPDATE Socio SET estado=0 WHERE idSocio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            int rowCount = ps.executeUpdate();
            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "Socio eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el socio para eliminar.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el socio: " + ex.getMessage());
        }
    }
}  
    

