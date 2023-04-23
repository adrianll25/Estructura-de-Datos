/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Proyecto_Pila {
    
    private Automovil []arrAuto;
    int tope;
    
    public Proyecto_Pila(int dim){
        arrAuto = new Automovil[dim];
        for(int i=0; i>arrAuto.length; i++)
            arrAuto[i] = new Automovil();
        tope=0;         
    }
    
    
    public boolean pilaVacia(){
        if(tope==0)
            return true;
         else
            return false;
            
    }
    
    public boolean pilaLlena(){
        if(tope==arrAuto.length)
            return true;
        else
            return false;
    }
    
    public void push(Automovil objInser){
        if(!pilaLlena()){
            arrAuto[tope++]=objInser;
        }else{
            JOptionPane.showMessageDialog(null, "La Pila esta llena");
        }
    }
    
    public Automovil pop(){
        Automovil objQuit = new Automovil();
        
        if(!pilaVacia()){
            objQuit=arrAuto[--tope];
            arrAuto[tope]=null;
        }
        else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");          
    }
        return objQuit;
    }
    
    public void MostrarPila(JTable tablaMostrar){
        DefaultTableModel modelo = (DefaultTableModel)tablaMostrar.getModel();
        modelo.setRowCount(tope);
        
        if(!pilaVacia()){
            Proyecto_Pila auxPila = new Proyecto_Pila(tope);
            Automovil auxAuto = new Automovil();
            int ren =0;
            
            while(!pilaVacia()){
                 auxAuto = pop();
                 auxAuto.mostrar(tablaMostrar, ren++);
                 auxPila.push(auxAuto);
            }
            
            while(!auxPila.pilaVacia())
                push(auxPila.pop());
            
        }else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }
    
    public void ParImpar(){
    if(tope%4==0 && tope%2==0)
            {
            Proyecto_Pila auxAuto1 = new Proyecto_Pila(tope/4);
            Proyecto_Pila auxAuto2 = new Proyecto_Pila(tope/4);
            Proyecto_Pila auxAuto3 = new Proyecto_Pila(tope/4);
            Proyecto_Pila auxAuto4 = new Proyecto_Pila(tope/4);
            
            while(!auxAuto4.pilaLlena()&&!auxAuto3.pilaLlena())
            {
            auxAuto4.push(pop());
            auxAuto3.push(pop());
            }
            while(!auxAuto1.pilaLlena()&&!auxAuto2.pilaLlena())
            {
            auxAuto2.push(pop());
            auxAuto1.push(pop());
            }
           while(!auxAuto4.pilaVacia()&&!auxAuto2.pilaVacia())
            {
            push(auxAuto4.pop());
            push(auxAuto2.pop());
            }
           while(!auxAuto1.pilaVacia()&&!auxAuto3.pilaVacia())
            {
            push(auxAuto3.pop());
            push(auxAuto1.pop());
            }
    }else
        JOptionPane.showMessageDialog(null, "Los Elementos de la pila deben ser par"
                + "Para poder continuar con la operación");
    }
    
    public void ELiminarInsertar(){
         if(tope>=2)
         {
             Proyecto_Pila aux1 = new Proyecto_Pila(tope-2);
             
             Automovil auxAutomovil = new Automovil();
             
             while(!aux1.pilaLlena())
                 aux1.push(pop());
             
             auxAutomovil = pop();
             
             while(!aux1.pilaVacia())
                 push(aux1.pop());
         }else 
             JOptionPane.showMessageDialog(null, "Se necesitan 3 elementos"
                     + "\n para continuar con la operación");
}
   
}
