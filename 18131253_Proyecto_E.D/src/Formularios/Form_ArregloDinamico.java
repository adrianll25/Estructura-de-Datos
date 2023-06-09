/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Automovil;
import Clases.Metodos;

/**
 *
 * @author adria
 */
public class Form_ArregloDinamico extends javax.swing.JFrame {
    Automovil objAuto = new Automovil();
    Metodos objMeto = new Metodos();
    Form_Menu principal;
    int Seleccion;
    /**
     * Creates new form Form_Proyecto
     */
    public Form_ArregloDinamico(Form_Menu p) {
        initComponents();
        this.setLocationRelativeTo(null);
        principal = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArreglo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableModificar = new javax.swing.JTable();
        JBUT_Aleatorios = new javax.swing.JButton();
        JBUT_Guardar = new javax.swing.JButton();
        JBUT_Eliminar = new javax.swing.JButton();
        JBUT_Modificar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAleatorios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableArreglo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Color", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableArreglo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableArregloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableArreglo);

        jTableModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Color", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTableModificar);

        JBUT_Aleatorios.setText("Aleatorios");
        JBUT_Aleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_AleatoriosActionPerformed(evt);
            }
        });

        JBUT_Guardar.setText("Guardar");
        JBUT_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_GuardarActionPerformed(evt);
            }
        });

        JBUT_Eliminar.setText("Eliminar");
        JBUT_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_EliminarActionPerformed(evt);
            }
        });

        JBUT_Modificar.setText("Modificar");
        JBUT_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_ModificarActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jList1);

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "2017", "2018", "2019" }));
        jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        jLabel6.setText("Modelo del Auto");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableAleatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "PLACA", "MARCA", "MODELO", "COLOR", "PRECIO"
            }
        ));
        jScrollPane3.setViewportView(jTableAleatorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBUT_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBUT_Aleatorios)
                                    .addComponent(jComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(JBUT_Modificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBUT_Eliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1)
                                            .addComponent(jScrollPane3))))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUT_Eliminar)
                    .addComponent(JBUT_Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(JBUT_Aleatorios)
                .addGap(18, 18, 18)
                .addComponent(JBUT_Guardar)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBUT_AleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_AleatoriosActionPerformed
        // TODO add your handling code here:
        objAuto.aleatorio(jTableAleatorios);
    }//GEN-LAST:event_JBUT_AleatoriosActionPerformed

    private void JBUT_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_GuardarActionPerformed
        // TODO add your handling code here:
        String Placa = jTableAleatorios.getValueAt(0, 0).toString();
        String Marca = jTableAleatorios.getValueAt(0, 1).toString();
        int Modelo = Integer.parseInt(jTableAleatorios.getValueAt(0, 2).toString());
        String Color = jTableAleatorios.getValueAt(0, 3).toString();
        double Precio = Double.parseDouble(jTableAleatorios.getValueAt(0, 4).toString());
        
        Automovil objAutoo = new Automovil(Placa, Marca, Modelo, Color, Precio);
        objMeto.Guardar(objAutoo);
        objMeto.Mostrar(jTableArreglo);

        //this.jComboBox1.addItem(this.JTF_Placa.getText());
    }//GEN-LAST:event_JBUT_GuardarActionPerformed

    private void JBUT_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_EliminarActionPerformed
        // TODO add your handling code here:
        objMeto.Eliminar(Seleccion);
        objMeto.Mostrar(jTableArreglo);
        objMeto.Mostrar(jTableModificar);
    }//GEN-LAST:event_JBUT_EliminarActionPerformed

    private void JBUT_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_ModificarActionPerformed
        // TODO add your handling code here:
        objMeto.Modificar(jTableModificar, Seleccion);
        objMeto.Mostrar(jTableArreglo);
    }//GEN-LAST:event_JBUT_ModificarActionPerformed

    private void jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItemStateChanged
        // TODO add your handling code here:
        objMeto.BuscarModelo(jList1, jComboBox);
    }//GEN-LAST:event_jComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        this.dispose();
        
       principal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableArregloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableArregloMouseClicked
        // TODO add your handling code here:
        Seleccion = this.jTableArreglo.rowAtPoint(evt.getPoint());
        objMeto.BuscarPlaca(jTableArreglo, jTableModificar, Seleccion);
    }//GEN-LAST:event_jTableArregloMouseClicked

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
            java.util.logging.Logger.getLogger(Form_ArregloDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_ArregloDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_ArregloDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_ArregloDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBUT_Aleatorios;
    private javax.swing.JButton JBUT_Eliminar;
    private javax.swing.JButton JBUT_Guardar;
    private javax.swing.JButton JBUT_Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAleatorios;
    private javax.swing.JTable jTableArreglo;
    private javax.swing.JTable jTableModificar;
    // End of variables declaration//GEN-END:variables
}
