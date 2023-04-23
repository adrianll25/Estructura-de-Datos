/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Arbol;
import Clases.Proceso;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Form_P1T6 extends javax.swing.JFrame {
Arbol objArbol;
Proceso objProc=new Proceso();
    /**
     * Creates new form Form_P1T6
     */
    public Form_P1T6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBut_Crear = new javax.swing.JButton();
        jBut_Aleatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Aleatorio = new javax.swing.JTable();
        jBut_Insertar = new javax.swing.JButton();
        jBut_Preorden = new javax.swing.JButton();
        jBut_Inorden = new javax.swing.JButton();
        jBut_PosOrden = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Mostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBut_Crear.setText("CREAR");
        jBut_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CrearActionPerformed(evt);
            }
        });

        jBut_Aleatorio.setText("ALEATORIO");
        jBut_Aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AleatorioActionPerformed(evt);
            }
        });

        jTable_Aleatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NUM PROCESO", "TIPO PROCESO", "QUANTUM"
            }
        ));
        jScrollPane1.setViewportView(jTable_Aleatorio);

        jBut_Insertar.setText("INSERTAR");
        jBut_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_InsertarActionPerformed(evt);
            }
        });

        jBut_Preorden.setText("PREORDEN");
        jBut_Preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_PreordenActionPerformed(evt);
            }
        });

        jBut_Inorden.setText("INORDEN");

        jBut_PosOrden.setText("POSORDEN");

        jTable_Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM PROCESO", "TIPO PROCESO", "QUANTUM"
            }
        ));
        jScrollPane2.setViewportView(jTable_Mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jBut_Preorden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBut_Inorden)
                                .addGap(64, 64, 64)
                                .addComponent(jBut_PosOrden)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jBut_Crear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBut_Aleatorio)
                        .addGap(74, 74, 74)
                        .addComponent(jBut_Insertar)
                        .addGap(23, 23, 23)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_Crear)
                    .addComponent(jBut_Aleatorio)
                    .addComponent(jBut_Insertar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_Preorden)
                    .addComponent(jBut_Inorden)
                    .addComponent(jBut_PosOrden))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CrearActionPerformed
       objArbol=new Arbol();
    }//GEN-LAST:event_jBut_CrearActionPerformed

    private void jBut_AleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AleatorioActionPerformed
        objProc.Aleatorio(jTable_Aleatorio);
    }//GEN-LAST:event_jBut_AleatorioActionPerformed

    private void jBut_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_InsertarActionPerformed
        int numProc=Integer.parseInt(this.jTable_Aleatorio.getValueAt(0,0).toString());
        String tipoProc=this.jTable_Aleatorio.getValueAt(0,1).toString();
        double quantum=Double.parseDouble(this.jTable_Aleatorio.getValueAt(0,2).toString());
        objProc=new Proceso(numProc,tipoProc,quantum);
        objArbol.insertar(objProc);
    }//GEN-LAST:event_jBut_InsertarActionPerformed

    private void jBut_PreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_PreordenActionPerformed
        
        DefaultTableModel modelo = (DefaultTableModel)this.jTable_Mostrar.getModel();        
       // modelo.setColumnCount(3);
        modelo.setRowCount(0);    
                
        objArbol.preorden( objArbol.getRaiz(), modelo );        

        
       
    }//GEN-LAST:event_jBut_PreordenActionPerformed

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
            java.util.logging.Logger.getLogger(Form_P1T6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_P1T6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_P1T6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_P1T6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_P1T6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Aleatorio;
    private javax.swing.JButton jBut_Crear;
    private javax.swing.JButton jBut_Inorden;
    private javax.swing.JButton jBut_Insertar;
    private javax.swing.JButton jBut_PosOrden;
    private javax.swing.JButton jBut_Preorden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Aleatorio;
    private javax.swing.JTable jTable_Mostrar;
    // End of variables declaration//GEN-END:variables
}
