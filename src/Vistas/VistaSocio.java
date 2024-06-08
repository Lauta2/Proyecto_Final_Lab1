/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.SocioData;
import Entidades.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alakyan
 */
public class VistaSocio extends javax.swing.JInternalFrame {

    private SocioData socioData = new SocioData();
    private Socio socio = null;

    /**
     * Creates new form VistaSocio
     */
    public VistaSocio() {
        initComponents();
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
        jt_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jb_Buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jt_DNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt_Apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_Edad = new javax.swing.JTextField();
        jt_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jt_Telefono = new javax.swing.JTextField();
        jcb_Estado = new javax.swing.JCheckBox();
        jb_Guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jb_Salir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setTitle("SOCIO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Socio");

        jLabel2.setText("ID");

        jLabel3.setText("Nombre");

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI");

        jLabel5.setText("Apellido");

        jLabel6.setText("Edad");

        jLabel7.setText("Email");

        jLabel8.setText("Telefono");

        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jb_Salir.setText("Salir");
        jb_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalirActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(jb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jt_Apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jt_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel2))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jcb_Estado)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(141, 141, 141))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jt_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jt_DNI))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb_Salir)
                                        .addComponent(jb_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_Buscar))
                        .addGap(18, 18, 18)
                        .addComponent(jt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcb_Estado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jb_Guardar)
                    .addComponent(jButton1)
                    .addComponent(jb_Salir))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_SalirActionPerformed

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        int id;
        ArrayList<Socio> socios = new ArrayList<>();
        if (!jt_ID.getText().equals("")) {
            try {
                id = Integer.parseInt(jt_ID.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El ID es un Numero entero!");
                return;
            }
        if (socio == null) {
            if (!jt_ID.getText().equals("")) {
                jt_DNI.setText(socioData.buscarSocioID(id).getDni() + "");
                jt_Nombre.setText(socioData.buscarSocioID(id).getNombre());
                jt_Apellido.setText(socioData.buscarSocioID(id).getApellido());
                jt_Edad.setText(socioData.buscarSocioID(id).getEdad() + "");
                jcb_Estado.setSelected(socioData.buscarSocioID(id).isEstado());
                jt_Email.setText(socioData.buscarSocioID(id).getCorreo());
                jt_Telefono.setText(socioData.buscarSocioID(id).getTelefono() + "");
                jt_ID.disable();
                socio = socioData.buscarSocioID(id);
            }
        }
        }else {
            socios=(ArrayList<Socio>) socioData.buscarSocioNombre(jt_Nombre.getText());
            if (socioData.buscarSocioNombre(jt_Nombre.getText()).size() > 1) {
                JOptionPane.showMessageDialog(this, "Existen mas de un " + jt_Nombre.getText() + "\nIngrese ID de Socio!\nBusquelo en Lista de Socios");
                return;
                
            } else if(!jt_Nombre.getText().equalsIgnoreCase("")){
                for (Socio socio1 : socios) {
                    socio=socio1;
                }
                jt_DNI.setText(socio.getDni() + "");
                jt_Nombre.setText(socio.getNombre());
                jt_Apellido.setText(socio.getApellido());
                jt_Edad.setText(socio.getEdad() + "");
                jcb_Estado.setSelected(socio.isEstado());
                jt_Email.setText(socio.getCorreo());
                jt_Telefono.setText(socio.getTelefono() + "");
                jt_ID.setText(socio.getIdSocio()+"");
                jt_ID.disable();
            }
            
        }

    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        socio=null;
        jt_ID.enable();
        jt_ID.setText("");
        jt_DNI.setText("");
        jt_Nombre.setText("");
        jt_Apellido.setText("");
        jt_Edad.setText("");
        jt_Email.setText("");
        jt_Telefono.setText("");
        jcb_Estado.isSelected();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
        if(!(jt_Telefono.getText().equalsIgnoreCase("") || jt_Nombre.getText().equalsIgnoreCase("") || jt_Email.getText().equalsIgnoreCase("") || jt_Edad.getText().equalsIgnoreCase("") || jt_DNI.getText().equalsIgnoreCase("") || jt_Apellido.getText().equalsIgnoreCase(""))){
        if(socio==null){
            try{
            socio=new Socio();
            if(Integer.parseInt(jt_DNI.getText())== socioData.buscarSocioDNI(Integer.parseInt(jt_DNI.getText())).getDni()){
                JOptionPane.showMessageDialog(this, "DNI YA REGISTRADO!");
                return;
            }
            socio.setDni(Integer.parseInt(jt_DNI.getText()));
            socio.setEdad(Integer.parseInt(jt_Edad.getText()));
            socio.setTelefono(Integer.parseInt(jt_Telefono.getText()));
            }catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(this, "Ingrese numeros Enteros en:\nDNI - EDAD - TELEFONO ");
                    return;
                    }
            socio.setApellido(jt_Apellido.getText());
            socio.setNombre(jt_Nombre.getText());
            socio.setCorreo(jt_Email.getText());
            socio.setEstado(jcb_Estado.isSelected());
            socioData.guardarSocio(socio);
            jt_ID.setText(socioData.buscarSocioDNI(socio.getDni())+"");
            jt_ID.disable();
        }else{
            try{
            socio.setDni(Integer.parseInt(jt_DNI.getText()));
            socio.setEdad(Integer.parseInt(jt_Edad.getText()));
            socio.setTelefono(Integer.parseInt(jt_Telefono.getText()));
            }catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(this, "Ingrese numeros Enteros en:\nDNI - EDAD - TELEFONO ");
                    return;
                    }
            socio.setApellido(jt_Apellido.getText());
            socio.setNombre(jt_Nombre.getText());
            socio.setCorreo(jt_Email.getText());
            socio.setEstado(jcb_Estado.isSelected());
            socioData.modificarSocio(socio);
        }
        }else{
            JOptionPane.showMessageDialog(this, "NO DEJE CAMPOS EN BLANCO");
            return;
        }
    }//GEN-LAST:event_jb_GuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(socio==null){
            JOptionPane.showMessageDialog(this, "BUSQUE CON ANTERIORIDAD EL SOCIO A ELIMINAR");
        }else{
            jt_ID.enable();
            socioData.eliminarSocio(socio.getIdSocio());
            jt_ID.disable();
            jcb_Estado.setSelected(false);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Salir;
    private javax.swing.JCheckBox jcb_Estado;
    private javax.swing.JTextField jt_Apellido;
    private javax.swing.JTextField jt_DNI;
    private javax.swing.JTextField jt_Edad;
    private javax.swing.JTextField jt_Email;
    private javax.swing.JTextField jt_ID;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Telefono;
    // End of variables declaration//GEN-END:variables
}
