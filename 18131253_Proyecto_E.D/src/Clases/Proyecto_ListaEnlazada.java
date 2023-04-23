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
public class Proyecto_ListaEnlazada {
    
      
    private Nodo front;
    private Nodo rear;
    
    public Proyecto_ListaEnlazada()
    {
        this.front = null;
        this.rear = null;
    }
    
    public boolean ListaVacia()
    {
        if(this.front==null && this.rear==null) 
            return true;
        else
            return false;
 
    }
    
    public void InsInicio( Automovil objAuto)
    {
     Nodo nuevo;
     if(ListaVacia())
     {

         nuevo = new Nodo(objAuto);
         front = nuevo;
         rear = nuevo;
     } else 
     {
     nuevo = new Nodo(objAuto, front);
     front = nuevo;  
     }
    }
  
    public void InsFin (Automovil objAuto)
    {
    Nodo nuevo;

    if(ListaVacia())
    { 
     nuevo = new Nodo (objAuto);
     front = nuevo;
     rear = nuevo;
    }else 
    {
    nuevo = new Nodo(objAuto);
    rear.setSig(nuevo);
    rear=nuevo; 
    }
    }
    
    public Automovil ElimIni()
    {
        Automovil objRet = new Automovil();
        if(front == rear)
        {
         objRet = front.getDatos();
         front = null;
         rear = null;
        }
        else
        {
         objRet = front.getDatos();
         front = front.getSig();
        }

        return objRet;
    }
    
    public Automovil ElimFin()
    {
       Automovil objRet = new Automovil(); 
       if(front == rear)
       {
           objRet = front.getDatos();
           front = null;
           rear = null;
       }else
       {
           objRet = front.getDatos();
           Nodo aux=front;
           while(aux.getSig()!=rear)
           aux = aux.getSig();
        rear = aux;
        rear.setSig(null);      
       }
       return objRet;
    }
    
    public int ContNodos()
    {
        int cont=0;
        if(!this.ListaVacia())
        {
            Nodo aux=front;
            while(aux!=null){
                aux=aux.getSig();
              
                cont++;
        }          
        }
        return cont;
    }    

    public void MostrarLE(JTable table)
    {
        DefaultTableModel modelo =  (DefaultTableModel)table.getModel();
       
       if(!this.ListaVacia())
       {
           modelo.setColumnCount(this.ContNodos());
           modelo.setRowCount(5);
           Automovil auxAuto = new Automovil();
           int col=0;
           
          
           for(int i=1; i<=this.ContNodos(); i++)
           {
               
               auxAuto = this.ElimIni();
               auxAuto.mostrarCola(table, col++);
               
               this.InsFin(auxAuto);  
           }
       }else 
            modelo.setRowCount(0);
           } 
    
    //Metodo Insertar posicion x a primera posicion
        public void PosxPrimerPos (int pos){
    //Solo funciona con informacion de lista enlazada no con el de colas
        if(pos>=1 && pos<=this.ContNodos()){
            Automovil auxPos = new Automovil();
            Automovil auxPos2 = new Automovil();//Quise poner un segundo auxiiliar para evitar que no se recorreiran las posiciones.
                                                
            int cont = this.ContNodos();
            
            for (int i = 1; i <= cont; i++){
                if(i==pos)
                    auxPos = this.ElimIni();
                   
                else
                    this.InsFin(this.ElimIni());
            }
           this.InsInicio(auxPos);
           
        }
        else
            JOptionPane.showMessageDialog(null, "La posicion no existe"
                    + "\n Verifique o inserte la posicion");
    
}
}
