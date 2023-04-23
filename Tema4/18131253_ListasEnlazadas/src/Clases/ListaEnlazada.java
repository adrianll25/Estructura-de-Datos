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
 * @author aa421
 */
public class ListaEnlazada {
    //Atributos
    private Nodo front;
    private Nodo rear;
    
    //Constructores
    public ListaEnlazada(){
        this.front=null;
        this.rear=null;
    }
    
    //get y set
    
    
    //Metodos
    //Lista Vacia
    public boolean listaVacia(){
        if(this.front==null && this.rear==null)
            return true;
        else
            return false;
    }
    
    //Metodo insertar al inicio
    public void insInicio(Proceso ObjProc){
        Nodo Nuevo;
        
        if(listaVacia()){
            Nuevo = new Nodo(ObjProc);
            front = Nuevo;
            rear = Nuevo;
            
        }else{
            Nuevo = new Nodo(ObjProc, front);
            front = Nuevo;
        }
        
    }
    
    public void insalFin(Proceso ObjProc){
        Nodo Nuevo;
        
        if(listaVacia()){
            Nuevo = new Nodo(ObjProc);
            front=Nuevo;
            rear=Nuevo;
            
            
        }else{
            Nuevo = new Nodo(ObjProc);
            rear.setSig(Nuevo);
            rear = Nuevo;
        }
    }
    
    public Proceso elimIni(){
        Proceso objRet= new Proceso();
        
        if(front == rear){
        objRet = front.getDatos();
        front=null;
        rear=null;
        
        }else{
            objRet = front.getDatos();
            front = front.getSig();
       }
        
        return objRet;
    }
    
    public Proceso elimFin(){
       
        Proceso objRet = new Proceso();
       
        if ( front == rear ){
            
            objRet = front.getDatos();
           
            front = null;
            rear = null;
        }else{
            objRet = rear.getDatos();
            Nodo aux = front;
           
            while( aux.getSig()!=rear )
               
                aux = aux.getSig();            
            rear = aux; 
            rear.setSig(null);        
        } 
        return objRet;
    }
    
    public int contNodos(){
        int Cont =0;
        
        if(!this.listaVacia()){
            Nodo aux=front;
            
            while(aux!=null){
                aux = aux.getSig();
                Cont++;
            }
        }
        return Cont;
    }
    
    public void MostrarTabla(JTable tabla){
       DefaultTableModel Modelo = (DefaultTableModel)tabla.getModel(); 
       
       if(!this.listaVacia()){
           Modelo.setColumnCount(this.contNodos());
           Modelo.setRowCount(3);
           
           Proceso auxProceso = new Proceso();
           
           int col=0;
           
           for(int i=1; i<=this.contNodos(); i++){
               auxProceso = this.elimIni();
               auxProceso.mostrar(tabla, col++);
               this.insalFin(auxProceso);
           }
       }
       else{
           Modelo.setRowCount(0);
       }
    }
    
    public void InvertirLista(){
        if(this.contNodos()>=2){
            
            ListaEnlazada auxLE = new ListaEnlazada();
            
            while(!this.listaVacia())
                auxLE.insalFin(this.elimIni());
            
            while(!auxLE.listaVacia())
                this.insInicio(this.elimIni());
            
            
        }else
           JOptionPane.showMessageDialog(null, "Se necesitan al menos 2 elementos en la lista");
    }
    
    
    public void EliminarMedio(){
        if(this.contNodos()%2!=0){
        if(this.contNodos()>=3){
        
            int Medio=this.contNodos()/2;
            
            while(Medio!=0){
                this.insalFin(this.elimIni());
                Medio--;
                
            }
            this.elimIni();
            
            Medio = this.contNodos()/2;
            
            while(Medio!=0){
                this.insInicio(this.elimFin());
                Medio--;
        }
        }else
            JOptionPane.showMessageDialog(null, "La lista debe de tener al menos 2 elementos");
        }else
            JOptionPane.showMessageDialog(null, "El total de los elementos en la lista debe de ser impar");
                
    }
    
    public void elimPosMultTres(){
        if(this.contNodos()>=3){
            int cont = this.contNodos();
            
            for(int i =1; i<cont; i++)
                if(i%3==0)
                    this.elimIni();
            
            
        }else 
            JOptionPane.showMessageDialog(null, "Se necesitan al menos 3 elementos en la lista");
    }
}
