/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa422
 */
public class SistemaOperativo {
    
    
    //Atributos
    private ArrayList <Proceso> arrProc;
    
    //Constructor
    public SistemaOperativo()
    {
        arrProc = new ArrayList();
    }
    
    //Metodos
    public void Guardar( Proceso objProcIns)
    {
      arrProc.add(objProcIns);
    }
    
    public void Mostrar(JTable tabla)
    {
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(arrProc.size());
        
        for (int i = 0; i < arrProc.size(); i++) 
        {
        modelo.setValueAt(arrProc.get(i).getNomProc(), i, 0);
        modelo.setValueAt(arrProc.get(i).getTipoProc(), i, 1);
        modelo.setValueAt(arrProc.get(i).getTiempoLl(), i, 2);
        modelo.setValueAt(arrProc.get(i).getTiempoEj(), i, 3);
        modelo.setValueAt(arrProc.get(i).getPrioridad(), i, 4);
        modelo.setValueAt(arrProc.get(i).getQuantum(), i, 5);
        }
    }

    public void Buscar(JComboBox combo, JTable tabla)
     {
         DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(1);
        
        tabla.setValueAt(arrProc.get(combo.getSelectedIndex()).getNomProc(), 0, 0);
        tabla.setValueAt(arrProc.get(combo.getSelectedIndex()).getTipoProc(), 0, 1);
        tabla.setValueAt(arrProc.get(combo.getSelectedIndex()).getTiempoLl(), 0, 2);
        tabla.setValueAt(arrProc.get(combo.getSelectedIndex()).getTiempoEj(), 0, 3);
        tabla.setValueAt(arrProc.get(combo.getSelectedIndex()).getPrioridad(), 0, 4);
        tabla.setValueAt(arrProc.get(combo.getSelectedIndex()).getQuantum(), 0, 5);
     }
     public void Modificar(JComboBox combo, JTable tabla)
    {
       arrProc.get(combo.getSelectedIndex()).setTipoProc(tabla.getValueAt(0, 1).toString());
       arrProc.get(combo.getSelectedIndex()).setTiempoLl(Double.parseDouble(tabla.getValueAt(0, 2).toString()));
       arrProc.get(combo.getSelectedIndex()).setTiempoEj(Double.parseDouble(tabla.getValueAt(0, 3).toString()));
       arrProc.get(combo.getSelectedIndex()).setPrioridad(Integer.parseInt(tabla.getValueAt(0, 4).toString()));
       arrProc.get(combo.getSelectedIndex()).setQuantum(Integer.parseInt(tabla.getValueAt(0, 5).toString()));
    }
     
     public void Eliminar (JComboBox combo)
     {
         arrProc.remove(combo.getSelectedIndex());
     }
     
     public void buscarQuantum (JList lista, JComboBox combo){
        DefaultListModel modelo = new DefaultListModel();
        
        for(int i=0; i<arrProc.size(); i++)
           if(arrProc.get(i).getQuantum()==Double.parseDouble(combo.getSelectedItem().toString()))
           modelo.addElement(arrProc.get(i).getNomProc());
           
           lista.setModel(modelo);
     }
}

       

     