/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ComidaData;
import Entidades.Comida;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cristina
 */
public class FormularioGestionComidas extends javax.swing.JInternalFrame {

    ArrayList<Comida> listaC;
    ComidaData cd;
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    int calorias;

    public FormularioGestionComidas() {
        listaC = new ArrayList();
        cd = new ComidaData();
        initComponents();
        armarCabecera();
        // cargarComidas();
        if(!jRadioTodas.isSelected()&&!jRadioMenos.isSelected()){
            jBModificar.setEnabled(false);
            jBEliminar.setEnabled(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTCalorias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioTodas = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioMenos = new javax.swing.JRadioButton();

        setClosable(true);

        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.setEnabled(false);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        jLabel1.setText("Administracion de comidas");

        jLabel2.setText("Comidas disponibles:");

        jTCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCaloriasKeyReleased(evt);
            }
        });

        jLabel3.setText("Mostrar todas");

        jRadioTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTodasActionPerformed(evt);
            }
        });

        jLabel4.setText("Menos de ");

        jLabel5.setText("Kcal");

        jRadioMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jBModificar)
                                            .addGap(143, 143, 143)
                                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jRadioTodas)
                        .addGap(118, 118, 118)
                        .addComponent(jRadioMenos)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioTodas)
                    .addComponent(jRadioMenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = jTable.getSelectedRow();
        if(fila!=-1){
        int idComida = (Integer) jTable.getValueAt(fila, 0);

        cd.eliminarComida(idComida);
        }
        borrarFilas();

    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        
        int fila = jTable.getSelectedRow();
        if (fila != -1) {
            if (jTable.getValueAt(fila, 0) instanceof String) {
                id = Integer.parseInt((String) jTable.getValueAt(fila, 0));
            } else {
                id = (Integer) jTable.getValueAt(fila, 0);
            }
            String nombre = (String) jTable.getValueAt(fila, 1);
            String detalle = (String) jTable.getValueAt(fila, 2);
            if (jTable.getValueAt(fila, 3) instanceof String) {
                calorias = Integer.parseInt((String) jTable.getValueAt(fila, 3));
            } else {
                calorias = (Integer) jTable.getValueAt(fila, 3);
            }
            Comida c1 = new Comida(id, calorias, nombre, detalle, true);
            cd.modificarComida(c1);
            System.out.println(cd);
            borrarFilas();
            cargarComidas();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jRadioTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTodasActionPerformed
        borrarFilas();
        jRadioMenos.setSelected(false);
        if(jRadioTodas.isSelected()){
        cargarComidas();
        jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioTodasActionPerformed

    private void jRadioMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMenosActionPerformed
        borrarFilas();
        jRadioTodas.setSelected(false);
        if(jRadioMenos.isSelected()){
         jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true); 
        
        }
        
        
    }//GEN-LAST:event_jRadioMenosActionPerformed

    private void jTCaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCaloriasKeyReleased
        borrarFilas();
        
        try{    
            if(jRadioMenos.isSelected()){
        int calorias=Integer.parseInt(jTCalorias.getText());
        for (Comida c :cd.buscarPorCalorias(calorias) ) {
            
            modelo.addRow(new Object[]{c.getIdComida(), c.getNombre(), c.getDetalle(), c.getCantCalorias(), c.isEstado()});
        
        }
}}catch (NumberFormatException ex){
    JOptionPane.showMessageDialog(null, "Debe ingresar las calorias en formato numerico");
    jTCalorias.setText("");
}
        
    }//GEN-LAST:event_jTCaloriasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioMenos;
    private javax.swing.JRadioButton jRadioTodas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCalorias;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        ArrayList<Object> lista = new ArrayList<>();
        lista.add("IDComida");
        lista.add("Nombre");
        lista.add("Detalle");
        lista.add("Calorias");
        for (Object item : lista) {
            modelo.addColumn(item);
        }
        
        jTable.setModel(modelo);
       

    }
   

    private void borrarFilas() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarComidas() {
        borrarFilas();
        listaC = (ArrayList) cd.listarComidas();
        for (Comida c : listaC) {
            System.out.println(c);
            modelo.addRow(new Object[]{c.getIdComida(), c.getNombre(), c.getDetalle(), c.getCantCalorias(), c.isEstado()});

        }
       
    }

}
