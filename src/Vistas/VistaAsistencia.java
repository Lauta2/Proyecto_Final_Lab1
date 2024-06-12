/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AsistenciaData;
import AccesoADatos.ClasesData;
import AccesoADatos.SocioData;
import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Socio;
import java.util.ArrayList;

/**
 *
 * @author jose-garces
 */
public class VistaAsistencia extends javax.swing.JInternalFrame {
    AsistenciaData asistenciaData;
    ClasesData claseData;
    SocioData socioData;
    ArrayList<Clase> clases=null;
    /**
     * Creates new form VistaAsistencia
     */
    public VistaAsistencia() {
        initComponents();
        asistenciaData=new AsistenciaData();
        socioData=new SocioData();
        claseData=new ClasesData();
        
    }

    
    
    
    private void cargarCombo(){
    clases=(ArrayList<Clase>) claseData.listarClases();
        for (Clase clase : clases) {
            jcb_ComboClase.addItem(" "+clase.getNombre());
            
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

        jLabel1 = new javax.swing.JLabel();
        jcb_ComboClase = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcb_Socios = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jb_MarcarAsistencia = new javax.swing.JButton();
        jb_Salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Chilanka", 0, 24)); // NOI18N
        jLabel1.setText("Asistencia");

        jLabel2.setText("Clase a Ingresar:");

        jLabel3.setText("Socio:");

        jb_MarcarAsistencia.setText("Marcar Asistencia");

        jb_Salir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcb_Socios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcb_ComboClase, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jb_MarcarAsistencia)
                        .addGap(83, 83, 83)
                        .addComponent(jb_Salir)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_ComboClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_Socios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_MarcarAsistencia)
                    .addComponent(jb_Salir))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_MarcarAsistencia;
    private javax.swing.JButton jb_Salir;
    private javax.swing.JComboBox<String> jcb_ComboClase;
    private javax.swing.JComboBox<String> jcb_Socios;
    // End of variables declaration//GEN-END:variables
}
