/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa422
 */
public class Escuela {
    //Atributos
    public Alumno []arrAl;
    private int indice;
    
    public Escuela(int tamaño)
    {
        arrAl = new Alumno[tamaño];
        
        for (int i = 0; i < arrAl.length; i++) 
            arrAl[i] = new Alumno();
        
        indice = 0;
        
    }
    
    //Metodos
    
    public void guardarDtos(JTextField numControl, JTextField nombre, JTextField carrera, JTextField promGeneral)
    {
        if (indice < this.getLength()) {
            arrAl[indice].setNumControl(numControl.getText());
            arrAl[indice].setNombre(nombre.getText());
            arrAl[indice].setCarrera(carrera.getText());
            arrAl[indice].setPromGeneral(Double.parseDouble(promGeneral.getText()));
            this.setIndice(indice+1);
        
        }else
            JOptionPane.showMessageDialog(null,"El arreglo esta lleno","Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostarDatos(JTable tabla)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setColumnCount(4);
        modelo.setRowCount(indice);
        
        for (int r = 0; r < indice; r++) 
        {
           modelo.setValueAt(arrAl[r].getNumControl(), r, 0);
           modelo.setValueAt(arrAl[r].getNombre(), r, 1);
           modelo.setValueAt(arrAl[r].getCarrera(), r, 2);
           modelo.setValueAt(arrAl[r].getPromGeneral(), r, 3);
        }
    }
    public void buscarDatos (JComboBox combo , JTable tabla)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setColumnCount(4);
        modelo.setRowCount(1);
        
        modelo.setValueAt(arrAl[combo.getSelectedIndex()].getNumControl(),0,0);
        modelo.setValueAt(arrAl[combo.getSelectedIndex()].getNombre(),0,1);
        modelo.setValueAt(arrAl[combo.getSelectedIndex()].getCarrera(),0,2);
        modelo.setValueAt(arrAl[combo.getSelectedIndex()].getPromGeneral(),0,3);
    }
    
    public void modificarDatos(JComboBox combo, JTable tabla)
    {
        arrAl[combo.getSelectedIndex()].setNombre(tabla.getValueAt(0,1).toString());
        arrAl[combo.getSelectedIndex()].setCarrera(tabla.getValueAt(0,2).toString());
        arrAl[combo.getSelectedIndex()].setPromGeneral(Double.parseDouble(tabla.getValueAt(0,3).toString()));
    }
    
    public void buscarCarrera(JComboBox combo, JList lista)
    {
        DefaultListModel modelo = new DefaultListModel();
        
        for (int i = 0; i < indice; i++) 
            if (arrAl[i].getCarrera().equals(combo.getSelectedItem())) 
                modelo.addElement(arrAl[i].getNumControl());
        
        lista.setModel(modelo);
                
            
        
    }
    
    
    //Metodos get/set(Propiedades)

    public Alumno[] getArrAl() {
        return arrAl;
    }

    public void setArrAl(Alumno[] arrAl) {
        this.arrAl = arrAl;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public int getLength()
    {
        return arrAl.length;
    }
}
