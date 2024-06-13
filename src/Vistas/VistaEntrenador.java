/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.EntrenadorData;
import Entidades.Entrenador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alakyan
 */
public class VistaEntrenador extends javax.swing.JInternalFrame {
    EntrenadorData entrenadorData=null;
    /**
     * Creates new form VistaEntrenador
     */
    public VistaEntrenador() {
        initComponents();
        entrenadorData=new EntrenadorData();
    }
    
    private void limpiarCampos(){
        jt_DNI.setText("");
        jt_Nombre.setText("");
        jt_Apellido.setText("");
        jt_Especialidad.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jt_DNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jt_Apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt_Especialidad = new javax.swing.JTextField();
        jb_Añadir = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Añadir nuevo Entrenador");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nuevo Entrenador");

        jLabel3.setText("DNI : ");

        jLabel2.setText("Nombre: ");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Especialidad:");

        jb_Añadir.setText("Añadir");
        jb_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AñadirActionPerformed(evt);
            }
        });

        jb_limpiar.setText("Limpiar");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
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
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jb_Añadir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jt_Apellido)
                            .addComponent(jt_DNI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jb_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Añadir)
                    .addComponent(jb_limpiar)
                    .addComponent(jButton1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AñadirActionPerformed
        int dni;
        if(!(jt_Apellido.getText().equals("") || jt_DNI.getText().equals("") || jt_Especialidad.getText().equals("") || jt_Nombre.getText().equals(""))){
        if(!jt_Nombre.getText().matches("[a-zA-Z\s]+")){
            JOptionPane.showMessageDialog(this, "Ingrese un nombre valido!");
        return;
        }
        if(!jt_Apellido.getText().matches("[a-zA-Z\s]+")){
            JOptionPane.showMessageDialog(this, "Ingrese un apellido valido!");
        return;
        }
        if(!jt_Especialidad.getText().matches("[a-zA-Z\s]+")){
            JOptionPane.showMessageDialog(this, "Ingrese una especilidad valida!");
        return;
        }
            try{
            dni=Integer.parseInt(jt_DNI.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "El DNI es un Numero entero!");
                return;
        }
        ArrayList<Entrenador> entrenadores=(ArrayList<Entrenador>) entrenadorData.listarEntrenadores();
        boolean continuar=true;
        for (Entrenador entrenador : entrenadores) {
            if(entrenador.getDni()==dni){
                continuar=false;
            }
        }
        if(continuar){
            Entrenador entrenador=new Entrenador();
            entrenador.setApellido(jt_Apellido.getText());
            entrenador.setDni(dni);
            entrenador.setEspecialidad(jt_Especialidad.getText());
            entrenador.setNombre(jt_Nombre.getText());
            entrenador.setEstado(true);
            entrenadorData.guardarEntrenador(entrenador);
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "DNI YA REGISTRADO!");
            return;
        }
        }else{
            JOptionPane.showMessageDialog(this, "NO DEJE CAMPOS EN BLANCO!");
            return;
        }
        
    }//GEN-LAST:event_jb_AñadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jb_Añadir;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JTextField jt_Apellido;
    private javax.swing.JTextField jt_DNI;
    private javax.swing.JTextField jt_Especialidad;
    private javax.swing.JTextField jt_Nombre;
    // End of variables declaration//GEN-END:variables
}
