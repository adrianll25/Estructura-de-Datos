/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author adria
 */
public class Form_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Form_Menu
     */
    public Form_Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBUT_Cola = new javax.swing.JButton();
        JBUT_Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JBUT_Pila = new javax.swing.JButton();
        JBUt_ArregloDinamico = new javax.swing.JButton();
        JBUT_Le = new javax.swing.JButton();
        jBut_Arbol = new javax.swing.JButton();
        jBut_OrdenamientoBusqueda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBUT_Cola.setText("Cola");
        JBUT_Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_ColaActionPerformed(evt);
            }
        });
        getContentPane().add(JBUT_Cola, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        JBUT_Salir.setText("Salir");
        JBUT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(JBUT_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("BRUSHMOSH! Demo", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 0));
        jLabel2.setText("##nContorol:18131253");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        JBUT_Pila.setText("Pila");
        JBUT_Pila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_PilaActionPerformed(evt);
            }
        });
        getContentPane().add(JBUT_Pila, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        JBUt_ArregloDinamico.setText("Arreglo Dinamico");
        JBUt_ArregloDinamico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUt_ArregloDinamicoActionPerformed(evt);
            }
        });
        getContentPane().add(JBUt_ArregloDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JBUT_Le.setText("Listas Enlazadas");
        JBUT_Le.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUT_LeActionPerformed(evt);
            }
        });
        getContentPane().add(JBUT_Le, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jBut_Arbol.setText("Arboles");
        jBut_Arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ArbolActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_Arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jBut_OrdenamientoBusqueda.setText("Ordenamiento/Busqueda");
        jBut_OrdenamientoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_OrdenamientoBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_OrdenamientoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 0));
        jLabel3.setText("Estructura de Datos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("BRUSHMOSH! Demo", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setText("Jesus Adrian Lopez Luevanos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseño/FondoMenu.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 465, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBUt_ArregloDinamicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUt_ArregloDinamicoActionPerformed
        // TODO add your handling code here:
        Form_ArregloDinamico FormDin = new Form_ArregloDinamico(this);
        FormDin.setVisible(true);
        this.setVisible(false);
                               
    }//GEN-LAST:event_JBUt_ArregloDinamicoActionPerformed

    private void JBUT_PilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_PilaActionPerformed
        // TODO add your handling code here:
        Form_Pila ForPila = new Form_Pila (this);
        ForPila.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_JBUT_PilaActionPerformed

    private void JBUT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBUT_SalirActionPerformed

    private void JBUT_ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_ColaActionPerformed
        // TODO add your handling code here:
        Form_Cola ForCola = new Form_Cola (this);
        ForCola.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_JBUT_ColaActionPerformed

    private void JBUT_LeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUT_LeActionPerformed
        // TODO add your handling code here:
        Form_Listas_Enlazadas ForLE = new Form_Listas_Enlazadas(this);
        ForLE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBUT_LeActionPerformed

    private void jBut_ArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ArbolActionPerformed
        // TODO add your handling code here:
        Form_Arboles FormARbol = new Form_Arboles(this);
        FormARbol.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBut_ArbolActionPerformed

    private void jBut_OrdenamientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_OrdenamientoBusquedaActionPerformed
        // TODO add your handling code here:
        Form_BusquedaOrdenacion FormBusquedaOrdenacion = new Form_BusquedaOrdenacion(this);
        FormBusquedaOrdenacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBut_OrdenamientoBusquedaActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBUT_Cola;
    private javax.swing.JButton JBUT_Le;
    private javax.swing.JButton JBUT_Pila;
    private javax.swing.JButton JBUT_Salir;
    private javax.swing.JButton JBUt_ArregloDinamico;
    private javax.swing.JButton jBut_Arbol;
    private javax.swing.JButton jBut_OrdenamientoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
