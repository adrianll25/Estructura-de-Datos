/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Arboles;
import Clases.Nodo;
import Clases.Proceso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Form_P1T6 extends javax.swing.JFrame {
Arboles objArbol;
Proceso objProc=new Proceso();
 
    /**
     * Creates new form Form_P1T6
     */
    public Form_P1T6() {
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

        jButton1 = new javax.swing.JButton();
        jButton_crear = new javax.swing.JButton();
        jButton_aleatorios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_aleatorios = new javax.swing.JTable();
        jButton_Preorden = new javax.swing.JButton();
        jButton_Inorden = new javax.swing.JButton();
        jButton_Postorden = new javax.swing.JButton();
        jButton_Insertar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_arbol = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_NumProceso = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_crear.setText("Crear");
        jButton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crearActionPerformed(evt);
            }
        });

        jButton_aleatorios.setText("Aleatorios");
        jButton_aleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aleatoriosActionPerformed(evt);
            }
        });

        jTable_aleatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Numero Proceso", "Tipo Proceso", "Quantum"
            }
        ));
        jScrollPane1.setViewportView(jTable_aleatorios);

        jButton_Preorden.setText("Preorden");
        jButton_Preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreordenActionPerformed(evt);
            }
        });

        jButton_Inorden.setText("Inorden");
        jButton_Inorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InordenActionPerformed(evt);
            }
        });

        jButton_Postorden.setText("Postorden");
        jButton_Postorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PostordenActionPerformed(evt);
            }
        });

        jButton_Insertar.setText("Insertar");
        jButton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertarActionPerformed(evt);
            }
        });

        jTable_arbol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Proceso", "Tipo Proceso", "Quantum"
            }
        ));
        jScrollPane2.setViewportView(jTable_arbol);

        jLabel1.setText("Num. Proceso:");

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton_crear)
                .addGap(73, 73, 73)
                .addComponent(jButton_aleatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Insertar)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton_Preorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Inorden)
                .addGap(63, 63, 63)
                .addComponent(jButton_Postorden)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_NumProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Buscar)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_crear)
                    .addComponent(jButton_aleatorios)
                    .addComponent(jButton_Insertar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Inorden)
                            .addComponent(jButton_Postorden))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Preorden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_NumProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_eliminar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreordenActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)this.jTable_arbol.getModel();        
         modelo.setRowCount(0);    
                
        objArbol.Preorden( objArbol.getRaiz(), modelo );        

    }//GEN-LAST:event_jButton_PreordenActionPerformed

    private void jButton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertarActionPerformed
        int numProc=Integer.parseInt(this.jTable_aleatorios.getValueAt(0,0).toString());
        String tipoProc=this.jTable_aleatorios.getValueAt(0,1).toString();
        double quantum=Double.parseDouble(this.jTable_aleatorios.getValueAt(0,2).toString());
        
        objProc=new Proceso(numProc,tipoProc,quantum);
        objArbol.Insertar(objProc);
    }//GEN-LAST:event_jButton_InsertarActionPerformed

    private void jButton_aleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aleatoriosActionPerformed
        objProc.Aleatorio(this.jTable_aleatorios);
    }//GEN-LAST:event_jButton_aleatoriosActionPerformed

    private void jButton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crearActionPerformed
        objArbol=new Arboles();
    }//GEN-LAST:event_jButton_crearActionPerformed

    private void jButton_InordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InordenActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)this.jTable_arbol.getModel();        
        modelo.setRowCount(0);    
        objArbol.Inorden( objArbol.getRaiz(), modelo );  
    }//GEN-LAST:event_jButton_InordenActionPerformed

    private void jButton_PostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PostordenActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)this.jTable_arbol.getModel();        
        modelo.setRowCount(0);    
        objArbol.Posorden(objArbol.getRaiz(), modelo );  
    }//GEN-LAST:event_jButton_PostordenActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        int NumProceso = Integer.parseInt(this.jTextField_NumProceso.getText());
        Nodo []nodoEnc = new Nodo[1];
        if(objArbol.BuscarNodo(NumProceso, nodoEnc)){
            JOptionPane.showMessageDialog(null,"El nodo ha sido encontrado.");
        }
        else{
            JOptionPane.showMessageDialog(null, "El nodo no ha sido encontrado. ");
        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        int NumProceso = Integer.parseInt(this.jTextField_NumProceso.getText());
        Nodo []nodoEnc = new Nodo[1];
        if(objArbol.BuscarNodo(NumProceso, nodoEnc))
            objArbol.Eliminar(nodoEnc);
        else
            JOptionPane.showMessageDialog(null,"El nodo no esta en el arbol");
    }//GEN-LAST:event_jButton_eliminarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_P1T6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Inorden;
    private javax.swing.JButton jButton_Insertar;
    private javax.swing.JButton jButton_Postorden;
    private javax.swing.JButton jButton_Preorden;
    private javax.swing.JButton jButton_aleatorios;
    private javax.swing.JButton jButton_crear;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_aleatorios;
    private javax.swing.JTable jTable_arbol;
    private javax.swing.JTextField jTextField_NumProceso;
    // End of variables declaration//GEN-END:variables
}