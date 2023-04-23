/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Proyecto_Cola {
      //Atributos
    private int front;
    private int rear;
    private Automovil[] arrAuto;
    
     //Constructores Por defecto
    public Proyecto_Cola(){
        
    }
    
    //Parametros
    public Proyecto_Cola(int dim){
        arrAuto = new Automovil[dim];
        for(int i=0; i<arrAuto.length; i++)
            arrAuto[i]= new Automovil();
        
        front =-1;
        rear=-1;
    }
    
    //Metodos get

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public Automovil[] getArrAuto() {
        return arrAuto;
    }
    
    //Metodos de clase
    public boolean colaVacia(){
        if(front ==-1 && rear ==-1)
            return true;
        else return false;
    }
    
    public boolean colaLlena(){
        if(front == 0 && rear==arrAuto.length-1)
            return true;
        else if(front==rear+1){
            return true;
    }else 
            return false;
    }
    
    public void Insertar (Automovil objAuto){
        if(!colaLlena()){
            
            if(colaVacia()){//La Cola Esta Vacia
                front=0;
                rear=0;
                arrAuto[rear]=objAuto;
            }else if(rear==arrAuto.length-1 && front>0){//La Cola circular
                rear=0;
                arrAuto[rear]=objAuto;
                
            }else//La Cola simple
                arrAuto[++rear]=objAuto;
            
        }else 
            JOptionPane.showMessageDialog(null, "La cola no tiene espacio disponible");
    }
    
    public Automovil Eliminar(){
        Automovil objRet = new Automovil();
        if(!colaVacia()){
            if(front==rear){//Solo hay elemnto en la cola
                
                objRet = arrAuto[front];
                arrAuto[front]=null;
                front =-1;
                rear=-1;
                
            }else
                if(front == arrAuto.length-1){//se hace en forma circular
                    objRet=arrAuto[front];
                    arrAuto[front]=null;
                    front=0;
                }
            else{
              objRet=arrAuto[front];
               arrAuto[front++]=null;
          }
         
        }
             return objRet;
    }
    
     public int contElem(){
        if(!colaVacia()){
            if(front==rear)
             return 1;
            
            else if(front<rear)
             return (rear-front)+1;
            else
                return ((arrAuto.length-front)+rear)+1;
                        
            
        }else{
            
        return 0;
       }
    }
    
      public void Mostrar(JTable Tabla){
          DefaultTableModel modelo=(DefaultTableModel)Tabla.getModel();
              modelo.setRowCount(5);
              modelo.setColumnCount(contElem());
       if(!colaVacia()){
            Automovil auxProc= new Automovil();
            int col = contElem();
            
            while(col>0){
                auxProc = Eliminar();
                auxProc.mostrarCola(Tabla, col-1);
                col--;
                Insertar(auxProc);
            }
             
        
           
       }else
           JOptionPane.showMessageDialog(null, "La cola esta vacia :(!");
      }
      
      public void ElimSegPosicion()
     {
         if(contElem()>=2)
         {
             Proyecto_Cola aux1 = new Proyecto_Cola(contElem()-2);
             Automovil auxAuto1 = new Automovil();
             Automovil auxAuto2 = new Automovil();
             
             while(!aux1.colaLlena())
                 aux1.Insertar(Eliminar());
             
             auxAuto1 = Eliminar();
             
             while(!aux1.colaVacia())
                 Insertar(aux1.Eliminar());
         }else 
             JOptionPane.showMessageDialog(null, "La pila necesita un minimo de 3 elementos"
                     + "\n para continuar con la operación");
     }
      
      public void ParxImpar(){
           
      if(contElem()>=4){
            if(contElem()%2==0){
                  
            Proyecto_Cola C1Impar = new Proyecto_Cola (contElem()/4);
            Proyecto_Cola C1Par = new Proyecto_Cola (contElem()/4);
            Proyecto_Cola C2Impar = new Proyecto_Cola (contElem()/4);
            Proyecto_Cola C2Par = new Proyecto_Cola (contElem()/4);
            
            int cont=contElem();
            
            while(!C1Impar.colaLlena()){
                C1Impar.Insertar(Eliminar());
                C1Par.Insertar(Eliminar());
            }
            
            while(!C2Impar.colaLlena()){
                C2Impar.Insertar(Eliminar());
                C2Par.Insertar(Eliminar());
            }
            
            while(!C1Impar.colaVacia()){
                Insertar(C1Par.Eliminar());
                Insertar(C1Impar.Eliminar());
            }
            
            while(!C2Impar.colaVacia()){
                Insertar(C2Par.Eliminar());
                Insertar(C2Impar.Eliminar());
            }
            
            }else
                JOptionPane.showMessageDialog(null, "El total de elementos deben ser par "
                        + "\n y tener al menos 4 elementos");

        }else
            JOptionPane.showMessageDialog(null, "El total de elementos deben ser par "
                    + "\n y tener al menos 4 elementos");
      }
      
}
