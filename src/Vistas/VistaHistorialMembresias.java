/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import AccesoADatos.MembresiaData;
import AccesoADatos.SocioData;
import Entidades.Membresia;
import Entidades.Socio;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alakyan
 */
    public class VistaHistorialMembresias extends javax.swing.JInternalFrame {
    private final SocioData socioData;
    private final MembresiaData membresiaData;
    private List<Socio> socios;

    public VistaHistorialMembresias() {
        initComponents();
        socioData = new SocioData();
        membresiaData = new MembresiaData();
        cargarVista();
    }

    private void cargarVista() {
        cargarComboSocio();
        mostrarHistorialMembresias();
    }

    private void cargarComboSocio() {
        socios = socioData.listarSocios();
        jcb_Socios.removeAllItems();
        jcb_Socios.addItem("Todos");
        for (Socio socio : socios) {
            jcb_Socios.addItem(socio.getNombre());
        }
    }

    private void mostrarHistorialMembresias() {
        int indiceSeleccionado = jcb_Socios.getSelectedIndex();
        if (indiceSeleccionado == 0) {
            mostrarTodasLasMembresias();
        } else {
            Socio socioSeleccionado = socios.get(indiceSeleccionado - 1);
            mostrarMembresiasPorSocio(socioSeleccionado.getIdSocio());
        }
    }

    private void mostrarTodasLasMembresias() {
        List<Membresia> membresias = membresiaData.listarMembresias();
        mostrarMembresiasEnTabla(membresias);
    }

 private void mostrarMembresiasPorSocio(int idSocio) {
    boolean activa = socioData.membresiaActiva(idSocio);
    if (activa) {
        List<Membresia> membresiasDelSocio = membresiaData.listarMembresiasPorSocio(idSocio);
        mostrarMembresiasEnTabla(membresiasDelSocio);
    } else {
   
      
        limpiarTabla();
    }
}


private void limpiarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0);
}
    private void mostrarMembresiasEnTabla(List<Membresia> membresias) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Cantidad de Pases");
        modelo.addColumn("Fecha de Inicio");
        modelo.addColumn("Fecha de Fin");
        modelo.addColumn("Costo");
        modelo.addColumn("Estado");
        for (Membresia membresia : membresias) {
            modelo.addRow(new Object[]{
                    membresia.getIdMembresia(),
                    membresia.getCantidadPases(),
                    membresia.getFechaInicio(),
                    membresia.getFechaFin(),
                    membresia.getCosto(),
                    membresia.isEstado() ? "Activa" : "Inactiva"
            });
        }
        jTable1.setModel(modelo);
    }




    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcb_Socios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Historial de Membresias");

        jLabel2.setText("Seleccione Socio:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jLabel2)))
                        .addGap(0, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcb_Socios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jcb_Socios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcb_Socios;
    // End of variables declaration//GEN-END:variables
}
