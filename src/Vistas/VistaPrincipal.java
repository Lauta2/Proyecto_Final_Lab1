/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Alakyan
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenu_Socio = new javax.swing.JMenuItem();
        jmenu_ListaSocios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmi_NuevaClase = new javax.swing.JMenuItem();
        jmi_ListaDeClases = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmi_NuevoEntrenador = new javax.swing.JMenuItem();
        jmi_ListaEntrenadores = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("SOCIO");

        jmenu_Socio.setText("Socio");
        jmenu_Socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_SocioActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_Socio);

        jmenu_ListaSocios.setText("Lista de Socios");
        jmenu_ListaSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_ListaSociosActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_ListaSocios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ASISTENCIA");

        jMenuItem6.setText("Asistir a Clase");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CLASE");

        jmi_NuevaClase.setText("Nueva Clase");
        jmi_NuevaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_NuevaClaseActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_NuevaClase);

        jmi_ListaDeClases.setText("Lista de Clases");
        jmi_ListaDeClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ListaDeClasesActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_ListaDeClases);

        jMenuItem3.setText("Inscripcion Socio a Clase");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("MEMBRESIA");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Registro de Membresia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Historial de Membresia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("ENTRENADOR");

        jmi_NuevoEntrenador.setText("Nuevo Entrenador");
        jmi_NuevoEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_NuevoEntrenadorActionPerformed(evt);
            }
        });
        jMenu4.add(jmi_NuevoEntrenador);

        jmi_ListaEntrenadores.setText("Entrenadores");
        jmi_ListaEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ListaEntrenadoresActionPerformed(evt);
            }
        });
        jMenu4.add(jmi_ListaEntrenadores);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("SALIR");

        jMenuItem2.setText("Salir al Escritorio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenu_SocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_SocioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaSocio vs= new VistaSocio();
        vs.setVisible(true);
        escritorio.add(vs);    }//GEN-LAST:event_jmenu_SocioActionPerformed

    private void jmenu_ListaSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_ListaSociosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaListaSocios vls= new VistaListaSocios();
        vls.setVisible(true);
        escritorio.add(vls);
    }//GEN-LAST:event_jmenu_ListaSociosActionPerformed

    private void jmi_NuevoEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_NuevoEntrenadorActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        VistaEntrenador ve= new VistaEntrenador();
        ve.setVisible(true);
        escritorio.add(ve);
    }//GEN-LAST:event_jmi_NuevoEntrenadorActionPerformed

    private void jmi_ListaEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ListaEntrenadoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaListaEntrenadores vle= new VistaListaEntrenadores();
        vle.setVisible(true);
        escritorio.add(vle);
    }//GEN-LAST:event_jmi_ListaEntrenadoresActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmi_NuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_NuevaClaseActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaNuevaClase vnc= new VistaNuevaClase();
        vnc.setVisible(true);
        escritorio.add(vnc);
    }//GEN-LAST:event_jmi_NuevaClaseActionPerformed

    private void jmi_ListaDeClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ListaDeClasesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaListaClases vlc= new VistaListaClases();
        vlc.setVisible(true);
        escritorio.add(vlc);
    }//GEN-LAST:event_jmi_ListaDeClasesActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripcionSocioAClase vic= new VistaInscripcionSocioAClase();
        vic.setVisible(true);
        escritorio.add(vic);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaMembresia vm= new VistaMembresia();
        vm.setVisible(true);
        escritorio.add(vm);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaHistorialMembresias vhm= new VistaHistorialMembresias();
        vhm.setVisible(true);
        escritorio.add(vhm);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        //
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        VistaAsistencia va= new VistaAsistencia();
        va.setVisible(true);
        escritorio.add(va);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jmenu_ListaSocios;
    private javax.swing.JMenuItem jmenu_Socio;
    private javax.swing.JMenuItem jmi_ListaDeClases;
    private javax.swing.JMenuItem jmi_ListaEntrenadores;
    private javax.swing.JMenuItem jmi_NuevaClase;
    private javax.swing.JMenuItem jmi_NuevoEntrenador;
    // End of variables declaration//GEN-END:variables
}
