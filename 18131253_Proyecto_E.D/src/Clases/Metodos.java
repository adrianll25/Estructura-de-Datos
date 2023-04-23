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
 * @author adria
 */
public class Metodos {
    private ArrayList <Automovil>arrAuto;
    
    public Metodos(){
        arrAuto = new ArrayList();
    }
    
    public void Guardar(Automovil objMovil){
        arrAuto.add(objMovil);
    }
    
    public void Mostrar(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(arrAuto.size());
        
        for(int i=0; i<arrAuto.size(); i++)
        {
            modelo.setValueAt(arrAuto.get(i).getPlaca(), i, 0);
            modelo.setValueAt(arrAuto.get(i).getMarca(), i, 1);
            modelo.setValueAt(arrAuto.get(i).getModelo(), i, 2);
            modelo.setValueAt(arrAuto.get(i).getColor(), i, 3);
            modelo.setValueAt(arrAuto.get(i).getPrecio(),i, 4);
        }
    }
    
    public void BuscarPlaca(JTable tabla2, JTable tabla3, int Seleccion)
     {
         
        tabla3.setValueAt(tabla2.getValueAt(Seleccion, 0), 0, 0);
        tabla3.setValueAt(tabla2.getValueAt(Seleccion, 1), 0, 1);
        tabla3.setValueAt(tabla2.getValueAt(Seleccion, 2), 0, 2);
        tabla3.setValueAt(tabla2.getValueAt(Seleccion, 3), 0, 3);
        tabla3.setValueAt(tabla2.getValueAt(Seleccion, 4), 0, 4);
        
     }
    
    public void Modificar (JTable tabla, int seleccion ){
        arrAuto.get(seleccion).setPlaca(tabla.getValueAt(0, 0).toString());
        arrAuto.get(seleccion).setMarca(tabla.getValueAt(0, 1).toString());
        arrAuto.get(seleccion).setModelo(Integer.parseInt(tabla.getValueAt(0,2).toString()));
        arrAuto.get(seleccion).setColor(tabla.getValueAt(0, 3).toString());
        arrAuto.get(seleccion).setPrecio(Double.parseDouble(tabla.getValueAt(0, 4).toString()));
        
    }
    
    public void Eliminar(int Seleccion){
        arrAuto.remove(Seleccion);
    }
    
    public void BuscarModelo(JList lista, JComboBox combo){
           DefaultListModel modelo = new DefaultListModel();
        
        for (int i=0; i<arrAuto.size(); i++)
        
            if (arrAuto.get(i).getModelo()==Integer.parseInt(combo.getSelectedItem().toString()))
                modelo.addElement(arrAuto.get(i).getPlaca());
        
              lista.setModel(modelo);
    }
}
