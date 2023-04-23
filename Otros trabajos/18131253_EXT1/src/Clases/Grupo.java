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
 * @author adria
 */
public class Grupo {
    private ArrayList <Empresa>arrEmpresa;
    
    public Grupo(){
    arrEmpresa = new ArrayList();
      
}
    
    public void Guardar(Empresa objEmpresaG){
        arrEmpresa.add(objEmpresaG);
    }
    
    public void Mostrar(JTable Tabla){
       DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel(); 
       modelo.setRowCount(arrEmpresa.size());
       
       for(int i = 0; i <arrEmpresa.size(); i++){
          modelo.setValueAt(arrEmpresa.get(i).getIdEmpresa(), i, 0);
          modelo.setValueAt(arrEmpresa.get(i).getNombEmpresa(), i, 1);
          modelo.setValueAt(arrEmpresa.get(i).getNumEmpleados(), i, 2);
          modelo.setValueAt(arrEmpresa.get(i).getVentasAnuales(), i, 3);
           
       }
    }
    
    public void Eliminar(int Selection){
        arrEmpresa.remove(Selection);
    }
    
    public void Promedio(JLabel Promedio){
        double VentaPromedio=0;
        String Prom="";
        
        for(int i=0; i<arrEmpresa.size(); i++){
            if(arrEmpresa.get(i).getVentasAnuales()<=VentaPromedio){
         
    }
   }
}
}

