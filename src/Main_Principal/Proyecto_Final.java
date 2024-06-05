
package Main_Principal;

import AccesoADatos.EntrenadorData;
import AccesoADatos.SocioData;
import Entidades.Entrenador;
import Entidades.Socio;
import java.util.ArrayList;
import java.util.List;


public class Proyecto_Final {

    public static void main(String[] args) {
        //------Socio------
       //Socio so= new Socio(457811, "exequiel", "Silva", 20, "exe_5@gmail.com", 26655634, true);
       //SocioData sd=new SocioData();
       
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
      
      //modifica socio
      //Socio socio=new Socio(1,673344 , "mauricio", "Mercado", 46, "mauri12@gmail.com", 743528, true);
      //sd.modificarSocio(socio);
      
      //elimina socio
      //sd.eliminarSocio(4);
      
        //------Entrenador------
      //Entrenador et=new Entrenador(457790, "Rodolfo", "Gil", "Pecho", true);
      //EntrenadorData ed=new EntrenadorData();
      
      //guarda entrenador
      //ed.guardarEntrenador(et);
      
      //eliminar entrenador
      //ed.eliminarEntrenador(2);
      
      //modifica entrenador
      //Entrenador entre=new Entrenador(3, 448922, "Luciano", "Aguilera", "Espalda", true);
      //ed.modificarEntrenador(entre);
      
      //buscar entrenador
      //Entrenador encontrado=ed.buscarEntrenador(3);
        //System.out.println("entrenador encontardo");
        //System.out.println(encontrado);
        
        //buscar entreandorActivo
        //System.out.println(ed.buscarEntrenadorActivo(2));
        
        //por apellido       
//        String apellidoBuscado = "Mujica";
//        ArrayList<Entrenador> entrenadores = ed.buscarEntrenadoresXApellido(apellidoBuscado);
//        if (entrenadores.isEmpty()) {
//            System.out.println("No se encontraron entrenadores con el apellido: " + apellidoBuscado);
//        } else {
//            for (Entrenador entrenador : entrenadores) {
//                System.out.println("ID: " + entrenador.getIdEntrenador());
//                System.out.println("DNI: " + entrenador.getDni());
//                System.out.println("Nombre: " + entrenador.getNombre());
//                System.out.println("Apellido: " + entrenador.getApellido());
//                System.out.println("Especialidad: " + entrenador.getEspecialidad());
//                System.out.println("Estado: " + (entrenador.isEstado()));
//                System.out.println("-------------------------------");
//            }
//        }
        
        //por especialidad
//       String especialidadBuscada = "Espalda";
//        ArrayList<Entrenador> entrenadores = ed.buscarEntrenadoresXEspecialidad(especialidadBuscada);
//        if (entrenadores.isEmpty()) {
//            System.out.println("No se encontraron entrenadores con la especialidad: " + especialidadBuscada);
//        } else {
//            for (Entrenador entrenador : entrenadores) {
//                System.out.println("ID: " + entrenador.getIdEntrenador());
//                System.out.println("DNI: " + entrenador.getDni());
//                System.out.println("Nombre: " + entrenador.getNombre());
//                System.out.println("Apellido: " + entrenador.getApellido());
//                System.out.println("Especialidad: " + entrenador.getEspecialidad());
//                System.out.println("Estado: " + (entrenador.isEstado()));
//                System.out.println("-------------------------------");
//            }
//        }

          //por nombre
//        String nombreBuscado = "Carlos";
//        ArrayList<Entrenador> entrenadores = ed.buscarEntrenadoresXNombre(nombreBuscado);
//        if (entrenadores.isEmpty()) {
//            System.out.println("No se encontraron entrenadores con el nombre: " + nombreBuscado);
//        } else {
//            for (Entrenador entrenador : entrenadores) {
//                System.out.println("ID: " + entrenador.getIdEntrenador());
//                System.out.println("DNI: " + entrenador.getDni());
//                System.out.println("Nombre: " + entrenador.getNombre());
//                System.out.println("Apellido: " + entrenador.getApellido());
//                System.out.println("Especialidad: " + entrenador.getEspecialidad());
//                System.out.println("Estado: " + (entrenador.isEstado()));
//                System.out.println("-------------------------------");
//            }
//        }

        //por nombre y apellido
//        String apellidoBuscado = "Mujica";
//        String nombreBuscado="Carlos";
//        ArrayList<Entrenador> entrenadores = ed.buscarEntrenadoresXNombreyApellido(nombreBuscado, apellidoBuscado);
//        if (entrenadores.isEmpty()) {
//            System.out.println("No se encontraron entrenadores con el apellido: " + apellidoBuscado);
//        } else {
//            for (Entrenador entrenador : entrenadores) {
//                System.out.println("ID: " + entrenador.getIdEntrenador());
//                System.out.println("DNI: " + entrenador.getDni());
//                System.out.println("Nombre: " + entrenador.getNombre());
//                System.out.println("Apellido: " + entrenador.getApellido());
//                System.out.println("Especialidad: " + entrenador.getEspecialidad());
//                System.out.println("Estado: " + (entrenador.isEstado()));
//                System.out.println("-------------------------------");
//            }
//        }
      
    }
    
    
    
}
