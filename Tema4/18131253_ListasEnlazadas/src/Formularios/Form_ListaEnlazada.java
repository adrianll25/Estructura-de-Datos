/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ListaEnlazada;
import Clases.Proceso;

/**
 *
 * @author aa421
 */
public class Form_ListaEnlazada extends javax.swing.JFrame {
//Se declara el objeto del tipo enlazada
        ListaEnlazada objLE;
//Se declara el objeto Proceso;
        Proceso objProceso;
    /**
     * Creates new form Form_ListaEnlazada
     */
    public Form_ListaEnlazada() {
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

        JBUT_Crear = new javax.swing.JButton();
        JBUT_Aleatorio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Aleatorio = new javax.swing.JTable();
        JBUT_InsInicio = new javax.swing.JButton();
        JBUT_InsFinal = new javax.swing.JButton();
        JBUT_ElimFinal = new javax.swing.JButton();
        JBUT_EliFinal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Lista = new javax.swing.JTable();
        JBUT_EliminarMedio = new javax.swing.JButton();
        JBUT_Invertr = new javax.swing.JButton();
        Eliminar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBUT_Crear.setText("Crear");
        JBUT_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_CrearActionPerformed(evt);
            }
        });

        JBUT_Aleatorio.setText("Aleatorio");
        JBUT_Aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_AleatorioActionPerformed(evt);
            }
        });

        jTable_Aleatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Num.Proceso", "Tipo Proceso", "Quantum"
            }
        ));
        jScrollPane2.setViewportView(jTable_Aleatorio);

        JBUT_InsInicio.setText("insInicio");
        JBUT_InsInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_InsInicioActionPerformed(evt);
            }
        });

        JBUT_InsFinal.setText("insFinal");
        JBUT_InsFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_InsFinalActionPerformed(evt);
            }
        });

        JBUT_ElimFinal.setText("eliInicio");
        JBUT_ElimFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_ElimFinalActionPerformed(evt);
            }
        });

        JBUT_EliFinal.setText("eliFinal");
        JBUT_EliFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_EliFinalActionPerformed(evt);
            }
        });

        jTable_Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Lista.setTableHeader(null);
        jScrollPane3.setViewportView(jTable_Lista);

        JBUT_EliminarMedio.setText("EliminarMedio");
        JBUT_EliminarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_EliminarMedioActionPerformed(evt);
            }
        });

        JBUT_Invertr.setText("InvertirLista");
        JBUT_Invertr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_InvertrActionPerformed(evt);
            }
        });

        Eliminar3.setText("Eliminar 3");
        Eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBUT_EliminarMedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBUT_Invertr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JBUT_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JBUT_Aleatorio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JBUT_ElimFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JBUT_EliFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JBUT_InsInicio)
                                    .addGap(18, 18, 18)
                                    .addComponent(JBUT_InsFinal))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBUT_Crear)
                        .addComponent(JBUT_Aleatorio))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBUT_InsInicio)
                        .addComponent(JBUT_InsFinal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUT_EliFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBUT_ElimFinal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUT_EliminarMedio)
                    .addComponent(JBUT_Invertr)
                    .addComponent(Eliminar3))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBUT_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_CrearActionPerformed
        // TODO add your handling code here:
        objLE = new ListaEnlazada();
        
    }//GEN-LAST:event_JBUT_CrearActionPerformed

    private void JBUT_AleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_AleatorioActionPerformed
        // TODO add your handling code here:
        objProceso = new Proceso();
        objProceso.Aleatorio(jTable_Aleatorio);
    }//GEN-LAST:event_JBUT_AleatorioActionPerformed

    private void JBUT_InsInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_InsInicioActionPerformed
        // TODO add your handling code here:
        int numProc = Integer.parseInt(this.jTable_Aleatorio.getValueAt(0,0).toString());
        String tipoProc =this.jTable_Aleatorio.getValueAt(0, 1).toString();
        double quantum = Double.parseDouble(this.jTable_Aleatorio.getValueAt(0,2).toString());
        
        objProceso = new Proceso(numProc, tipoProc, quantum);
        objLE.insInicio(objProceso);
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_JBUT_InsInicioActionPerformed

    private void JBUT_ElimFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_ElimFinalActionPerformed
        // TODO add your handling code here:
        objLE.elimIni();
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_JBUT_ElimFinalActionPerformed

    private void JBUT_InsFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_InsFinalActionPerformed
        // TODO add your handling code here:
        int numProc = Integer.parseInt(this.jTable_Aleatorio.getValueAt(0,0).toString());
        String tipoProc =this.jTable_Aleatorio.getValueAt(0, 1).toString();
        double quantum = Double.parseDouble(this.jTable_Aleatorio.getValueAt(0,2).toString());
        
        objProceso = new Proceso(numProc, tipoProc, quantum);
        objLE.insalFin(objProceso);
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_JBUT_InsFinalActionPerformed

    private void JBUT_EliFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_EliFinalActionPerformed
        // TODO add your handling code here:
        objLE.elimFin();
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_JBUT_EliFinalActionPerformed

    private void JBUT_EliminarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_EliminarMedioActionPerformed
        // TODO add your handling code here:
        objLE.EliminarMedio();
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_JBUT_EliminarMedioActionPerformed

    private void JBUT_InvertrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_InvertrActionPerformed
        // TODO add your handling code here:
        objLE.InvertirLista();
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_JBUT_InvertrActionPerformed

    private void Eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar3ActionPerformed
        // TODO add your handling code here:
        objLE.elimPosMultTres();
        objLE.MostrarTabla(jTable_Lista);
    }//GEN-LAST:event_Eliminar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_ListaEnlazada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar3;
    private javax.swing.JButton JBUT_Aleatorio;
    private javax.swing.JButton JBUT_Crear;
    private javax.swing.JButton JBUT_EliFinal;
    private javax.swing.JButton JBUT_ElimFinal;
    private javax.swing.JButton JBUT_EliminarMedio;
    private javax.swing.JButton JBUT_InsFinal;
    private javax.swing.JButton JBUT_InsInicio;
    private javax.swing.JButton JBUT_Invertr;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Aleatorio;
    private javax.swing.JTable jTable_Lista;
    // End of variables declaration//GEN-END:variables
}