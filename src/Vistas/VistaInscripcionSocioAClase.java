/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ClasesData;
import AccesoADatos.InscripcionData;
import AccesoADatos.SocioData;
import Entidades.Clase;
import Entidades.Inscripcion;
import Entidades.Socio;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.sql.Time;
import javax.swing.JOptionPane;

/**
 *
 * @author Alakyan
 */
public class VistaInscripcionSocioAClase extends javax.swing.JInternalFrame {
    ClasesData claseData;
    SocioData socioData;
    InscripcionData inscripcionData;
    ArrayList<Clase> clases;
    /**
     * Creates new form VistaBusquedaClase
     */
    public VistaInscripcionSocioAClase() {
        initComponents();
        claseData=new ClasesData();
        socioData=new SocioData();
        inscripcionData=new InscripcionData();
        inhabilitarBotones();
        botonesDeBusqueda();
    }
    
   private void limpiarCampos(){
       jt_NombreClase.setText("");
       jt_NombreEntrenador.setText("");
       jt_SocioDNI.setText("");
       jcb_ComboHorarios.removeAllItems();
       jcb_ComboClase.removeAllItems();
   }

    
    private void inhabilitarBotones(){
    jcb_ComboClase.disable();
    jt_SocioDNI.disable();
    jb_Inscribirse.disable();
}
    
    private void habilitarBotones(){
        jcb_ComboClase.enable();
    jt_SocioDNI.enable();
    jb_Inscribirse.enable();
    }
    
    private void botonesDeBusqueda(){
        limpiarCampos();
        inhabilitarBotones();
        //si el RadioButton Nombre Esta Activo
        if(jrb_Nombre.isSelected()){
            jrb_Entrenador.setSelected(false);
            jrb_Horario.setSelected(false);
            
            jt_NombreClase.enable();
            jt_NombreEntrenador.disable();
            jcb_ComboHorarios.disable();
         
            
            //si el RadioButton Entrenador Esta Activo
        }else if(jrb_Entrenador.isSelected()){
            jrb_Nombre.setSelected(false);
            jrb_Horario.setSelected(false);
            
            jt_NombreEntrenador.enable();
            jt_NombreClase.disable();
            jcb_ComboHorarios.disable();
         
            
            //si el RadioButton Horario Esta Activo
        }else if(jrb_Horario.isSelected()){
           jrb_Nombre.setSelected(false);
           jrb_Entrenador.setSelected(false);
           
           jcb_ComboHorarios.enable();
           jt_NombreClase.disable();
           jt_NombreEntrenador.disable();
           
           for (int i = 0; i < 24; i++) {
            LocalTime hora = LocalTime.of(i, 0, 0);
            jcb_ComboHorarios.addItem(hora.toString());
           }
           
            
            //si Ningun RadioButton Esta Activo
        }else{
            jt_NombreClase.disable();
            jt_NombreEntrenador.disable();
            jcb_ComboHorarios.disable();
        }
        
        
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb_BuscarClase = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jb_Inscribirse = new javax.swing.JButton();
        jrb_Nombre = new javax.swing.JRadioButton();
        jrb_Entrenador = new javax.swing.JRadioButton();
        jrb_Horario = new javax.swing.JRadioButton();
        jt_SocioDNI = new javax.swing.JTextField();
        jcb_ComboClase = new javax.swing.JComboBox<>();
        jt_NombreClase = new javax.swing.JTextField();
        jt_NombreEntrenador = new javax.swing.JTextField();
        jcb_ComboHorarios = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Clase por:");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nombre Clase:");

        jLabel3.setText("Nombre Entrenador:");

        jLabel4.setText("Horario:");

        jb_BuscarClase.setText("Buscar");
        jb_BuscarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarClaseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Resultado de Busqueda:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Inscribir Socio:");

        jLabel7.setText("DNI Socio:");

        jb_Inscribirse.setText("Inscribir");
        jb_Inscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_InscribirseActionPerformed(evt);
            }
        });

        jrb_Nombre.setSelected(true);
        jrb_Nombre.setText("Nombre");
        jrb_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_NombreActionPerformed(evt);
            }
        });

        jrb_Entrenador.setText("Entrenador");
        jrb_Entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_EntrenadorActionPerformed(evt);
            }
        });

        jrb_Horario.setText("Horario");
        jrb_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_HorarioActionPerformed(evt);
            }
        });

        jt_NombreClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_NombreClaseKeyReleased(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jt_NombreClase)
                                        .addComponent(jt_NombreEntrenador)
                                        .addComponent(jcb_ComboHorarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb_BuscarClase)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jrb_Nombre)
                                            .addGap(115, 115, 115)
                                            .addComponent(jrb_Entrenador)
                                            .addGap(104, 104, 104)
                                            .addComponent(jrb_Horario)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jb_Inscribirse)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(31, 31, 31)
                                    .addComponent(jt_SocioDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jcb_ComboClase, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_Nombre)
                    .addComponent(jrb_Entrenador)
                    .addComponent(jrb_Horario))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_NombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_NombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_ComboHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jb_BuscarClase)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcb_ComboClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_SocioDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Inscribirse)
                    .addComponent(jButton1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_NombreActionPerformed
        botonesDeBusqueda();
    }//GEN-LAST:event_jrb_NombreActionPerformed

    private void jb_BuscarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarClaseActionPerformed
        String dato=null;
        jcb_ComboClase.removeAllItems();
        ArrayList<Clase> clasesCombo=new ArrayList<>();
        
                
                
                
                //CARGAR COMBOBOXCLASES CON NOMBRE DE CLASE
        if(jrb_Nombre.isSelected() && !jt_NombreClase.getText().equals("")){
           dato=jt_NombreClase.getText();
           clases=(ArrayList<Clase>) claseData.listarClases();
            for (Clase clase : clases) {
               if(clase.getNombre().toLowerCase().contains(dato.toLowerCase())){
                   clasesCombo.add(clase);
               }
            }
           jcb_ComboClase.enable();
            for (Clase clase : clasesCombo) {
                jcb_ComboClase.addItem(clase.toString());
            }
            habilitarBotones();
           
            //CARGAR COMBOBOXCLASES CON NOMBRE DE ENTRENADOR
        }else if(jrb_Entrenador.isSelected() && !jt_NombreEntrenador.getText().equals("")){
            dato=jt_NombreEntrenador.getText();
            clases=(ArrayList<Clase>) claseData.listarClases();
            for (Clase clase : clases) {
               if(clase.getEntrenador().getNombre().toLowerCase().contains(dato.toLowerCase())){
                   clasesCombo.add(clase);
               }
            }
            jcb_ComboClase.enable();
            for (Clase clase : clasesCombo) {
                jcb_ComboClase.addItem(clase.toString());
            }
            habilitarBotones(); 
            
            
            //CARGAR COMBOBOXCLASES CON NOMBRE DE ENTRENADOR
        }else if(jrb_Horario.isSelected()){
            dato=(String) jcb_ComboHorarios.getSelectedItem();
            Time hora2=Time.valueOf(dato+":00");
            clases=(ArrayList<Clase>) claseData.listarClases();
            for (Clase clase : clases) {
               if(clase.getHorario().equals(hora2)){
                   clasesCombo.add(clase);
               }
            }
            jcb_ComboClase.enable();
            for (Clase clase : clasesCombo) {
                jcb_ComboClase.addItem(clase.toString());
            }
            habilitarBotones();
  
        }
        
        
        
        
        
    }//GEN-LAST:event_jb_BuscarClaseActionPerformed

    private void jrb_EntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_EntrenadorActionPerformed
        botonesDeBusqueda();
    }//GEN-LAST:event_jrb_EntrenadorActionPerformed

    private void jrb_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_HorarioActionPerformed
        botonesDeBusqueda();
    }//GEN-LAST:event_jrb_HorarioActionPerformed

    private void jt_NombreClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NombreClaseKeyReleased

    }//GEN-LAST:event_jt_NombreClaseKeyReleased

    private void jb_InscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_InscribirseActionPerformed
        int dni;
        if(jcb_ComboClase.getSelectedItem()==null || jt_SocioDNI.getText().equals("")){
            JOptionPane.showMessageDialog(this,"No se selecciono ninguna clase o no se ingreso DNI");
            return;
        }else{
            try{
                dni=Integer.parseInt(jt_SocioDNI.getText());
            }catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(this,"EL DNI TIENE QUE SER UN NUMERO ENTERO SIN PUNTOS");
            return;  
            }
            
            Socio socio=socioData.buscarSocioDNI(dni);
            ArrayList<Clase> clases=(ArrayList<Clase>) claseData.listarClases();
            Clase claseInscribir=null;
            for (Clase clase : clases) {
                if(jcb_ComboClase.getSelectedItem().equals(clase.toString())){
                   claseInscribir=clase; 
                }
            }
            
            ArrayList<Socio> sociosInscriptos=(ArrayList<Socio>) inscripcionData.listarSociosInscriptos(claseInscribir.getIdClase());
            for (Socio sociosInscripto : sociosInscriptos) {
                if(sociosInscripto.getIdSocio()==socio.getIdSocio()){
                    JOptionPane.showMessageDialog(this,"SOCIO YA HA SIDO INSCRIPTO ANTES!");
                    return;
                }
            }
            
            Inscripcion inscripcion=new Inscripcion(socio.getIdSocio(), claseInscribir.getIdClase(), true);
            inscripcionData.guardarInscripcion(inscripcion);
            JOptionPane.showMessageDialog(this,"INSCRIPTO CON EXITO!");
            inhabilitarBotones();
            botonesDeBusqueda();
            
        }
        
        
        
    }//GEN-LAST:event_jb_InscribirseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton jb_BuscarClase;
    private javax.swing.JButton jb_Inscribirse;
    private javax.swing.JComboBox<String> jcb_ComboClase;
    private javax.swing.JComboBox<String> jcb_ComboHorarios;
    private javax.swing.JRadioButton jrb_Entrenador;
    private javax.swing.JRadioButton jrb_Horario;
    private javax.swing.JRadioButton jrb_Nombre;
    private javax.swing.JTextField jt_NombreClase;
    private javax.swing.JTextField jt_NombreEntrenador;
    private javax.swing.JTextField jt_SocioDNI;
    // End of variables declaration//GEN-END:variables
}
