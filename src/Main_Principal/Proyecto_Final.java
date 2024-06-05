
package Main_Principal;

import AccesoADatos.SocioData;
import Entidades.Socio;
import java.util.List;


public class Proyecto_Final {

    public static void main(String[] args) {
       Socio so= new Socio(457811, "exequiel", "Silva", 20, "exe_5@gmail.com", 26655634, true);
       SocioData sd=new SocioData();
       
       //guardar socio
       //sd.guardarSocio(so);
       
       //buscar socio
       //Socio encontrado=sd.buscarSocio(2);
       //System.out.println("socio encontrado");
       //System.out.println(encontrado);
        
       //Lista socios
       //List<Socio> lista=sd.listarSocios();
       //for(Socio soco:lista){
           //System.out.println(soco);
      //}
      
      //Socio socio=new Socio(1,673344 , "mauricio", "Mercado", 46, "mauri12@gmail.com", 743528, true);
      //sd.modificarSocio(socio);
      
      sd.eliminarSocio(4);
      
    }
    
    
    
}
