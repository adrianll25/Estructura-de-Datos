/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Clases.Alumno;
import Clases.Escuela;

/**
 *
 * @author aa422
 */
public class Form_P1T1 extends javax.swing.JFrame {
private Alumno objAl;
private Escuela objEsc;

    public Form_P1T1() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTF_NoAlumnos = new javax.swing.JTextField();
        jBut_Crear = new javax.swing.JButton();
        jBut_Aleatorio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTF_NoControl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTF_Carrera = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_Promedio = new javax.swing.JTextField();
        jBut_Guardar = new javax.swing.JButton();
        jBut_Mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCB_NoControl = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jBut_Buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBut_Modifiicar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCB_Carrera = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jLabel2.setText("jLabel2");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No.Alumnos");

        jBut_Crear.setText("Crear");
        jBut_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CrearActionPerformed(evt);
            }
        });

        jBut_Aleatorio.setText("Aleatorio");
        jBut_Aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AleatorioActionPerformed(evt);
            }
        });

        jLabel3.setText("No.Control");

        jLabel4.setText("Nombre");

        jLabel5.setText("Carrera");

        jLabel6.setText("Promedio ");

        jBut_Guardar.setText("Guardar");
        jBut_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_GuardarActionPerformed(evt);
            }
        });

        jBut_Mostrar.setText("Mostrar");
        jBut_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_MostrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.CONTROL", "NOMBRE", "CARRERA", "PROMEDIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jCB_NoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_NoControlActionPerformed(evt);
            }
        });

        jLabel7.setText("NO.CONTROL:");

        jBut_Buscar.setText("Buscar");
        jBut_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_BuscarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.CONTROL", "NOMBRE", "CARRERA", "PROMEDIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jBut_Modifiicar.setText("Modificar");
        jBut_Modifiicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ModifiicarActionPerformed(evt);
            }
        });

        jLabel9.setText("Carrera: ");

        jCB_Carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Sistemas", "Quimica", "Industrial", "Mecatronica" }));
        jCB_Carrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_CarreraItemStateChanged(evt);
            }
        });

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTF_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTF_Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTF_NoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTF_NoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(jBut_Crear)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBut_Aleatorio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBut_Guardar)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel9))
                                    .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCB_Carrera, 0, 107, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jBut_Mostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCB_NoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_Modifiicar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_NoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_Crear)
                    .addComponent(jBut_Aleatorio)
                    .addComponent(jBut_Guardar)
                    .addComponent(jLabel9)
                    .addComponent(jCB_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTF_NoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTF_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTF_Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBut_Mostrar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCB_NoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_Buscar)
                    .addComponent(jBut_Modifiicar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CrearActionPerformed
        // TODO add your handling code here:
        objAl = new Alumno();
        objEsc = new Escuela(Integer.parseInt(this.jTF_NoAlumnos.getText()));
        this.jCB_NoControl.removeAllItems();
    }//GEN-LAST:event_jBut_CrearActionPerformed

    private void jBut_AleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AleatorioActionPerformed
        // TODO add your handling code here:
        objAl.aleatorio(jTF_NoControl, jTF_Nombre, jTF_Carrera, jTF_Promedio);
    }//GEN-LAST:event_jBut_AleatorioActionPerformed

    private void jBut_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_GuardarActionPerformed
        // TODO add your handling code here:
        objEsc.guardarDtos(jTF_NoControl, jTF_Nombre, jTF_Carrera, jTF_Promedio);
        this.jCB_NoControl.addItem(this.jTF_NoControl.getText());
        
    }//GEN-LAST:event_jBut_GuardarActionPerformed

    private void jBut_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_MostrarActionPerformed
        // TODO add your handling code here:
        objEsc.mostarDatos(jTable1);
    }//GEN-LAST:event_jBut_MostrarActionPerformed

    private void jBut_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_BuscarActionPerformed
        // TODO add your handling code here:
        objEsc.buscarDatos(jCB_NoControl, jTable2);
    }//GEN-LAST:event_jBut_BuscarActionPerformed

    private void jCB_NoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_NoControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_NoControlActionPerformed

    private void jBut_ModifiicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ModifiicarActionPerformed
        // TODO add your handling code here:
        objEsc.modificarDatos(jCB_NoControl, jTable2);
        objEsc.mostarDatos(jTable2);
    }//GEN-LAST:event_jBut_ModifiicarActionPerformed

    private void jCB_CarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_CarreraItemStateChanged
        // TODO add your handling code here:
        objEsc.buscarCarrera(jCB_Carrera, jList1);
    }//GEN-LAST:event_jCB_CarreraItemStateChanged

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
            java.util.logging.Logger.getLogger(Form_P1T1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_P1T1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_P1T1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_P1T1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_P1T1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Aleatorio;
    private javax.swing.JButton jBut_Buscar;
    private javax.swing.JButton jBut_Crear;
    private javax.swing.JButton jBut_Guardar;
    private javax.swing.JButton jBut_Modifiicar;
    private javax.swing.JButton jBut_Mostrar;
    private javax.swing.JComboBox<String> jCB_Carrera;
    private javax.swing.JComboBox<String> jCB_NoControl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTF_Carrera;
    private javax.swing.JTextField jTF_NoAlumnos;
    private javax.swing.JTextField jTF_NoControl;
    private javax.swing.JTextField jTF_Nombre;
    private javax.swing.JTextField jTF_Promedio;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
