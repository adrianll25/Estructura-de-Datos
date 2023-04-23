/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa421
 */
public class Movimiento {
    //Atributos
    private ArrayList <Franquicia> arrFr;
    
    //Constructor
    public Movimiento (){
        arrFr = new ArrayList();
    }
    
    //Metodos
    public void Guardar (Franquicia objF){
        arrFr.add(objF);
    }
    
    public void mostrar (JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(arrFr.size());
        
        for(int i=0; i<arrFr.size(); i++)
        {
            tabla.setValueAt(arrFr.get(i).getNumFranc(), i,0);
            tabla.setValueAt(arrFr.get(i).getNombFranc(), i,1);
            tabla.setValueAt(arrFr.get(i).getNumEmpleado(), i,2);
            tabla.setValueAt(arrFr.get(i).getVentaAnuales(),i,3);
        }
     }
    
    public void seleccionar (JTable tabla2, JTable tabla3, int seleccion){
        tabla3.setValueAt(tabla2.getValueAt(seleccion, 0), 0, 0);
        tabla3.setValueAt(tabla2.getValueAt(seleccion, 1), 0, 1);
        tabla3.setValueAt(tabla2.getValueAt(seleccion, 2), 0, 2);
        tabla3.setValueAt(tabla2.getValueAt(seleccion, 3), 0, 3);
    }
    
    public void modificar (JTable tabla, int seleccion){
         arrFr.get(seleccion).setNombFranc(tabla.getValueAt(0, 1).toString());
         arrFr.get(seleccion).setNumEmpleado(Integer.parseInt(tabla.getValueAt(0, 2).toString()));
         arrFr.get(seleccion).setVentaAnuales(Double.parseDouble(tabla.getValueAt(0, 3).toString()));
    }
    
    public void eliminar (int seleccion)
    {
        arrFr.remove(seleccion);
    }
   
     public void ventaMayorYMenor (JLabel etiquetaMay, JLabel etiquetaMen){
        double numMayor;
        double numMenor;
        String nmayor="";
        String nmenor="";
        numMayor = arrFr.get(0).getVentaAnuales();
        numMenor = arrFr.get(0).getVentaAnuales();
        for (int i = 0; i < arrFr.size(); i++) {
            if (arrFr.get(i).getVentaAnuales()>numMayor)
                numMayor = arrFr.get(i).getVentaAnuales();
                nmayor = String.valueOf(numMayor);
            
            if (arrFr.get(i).getVentaAnuales()<numMenor)
                numMenor = arrFr.get(i).getVentaAnuales();
                nmenor = String.valueOf(numMenor);
        }
        etiquetaMay.setText(nmayor);
        etiquetaMen.setText(nmenor);
    }
    }
             
    

