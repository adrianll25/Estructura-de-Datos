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
public class Cola {
    //Atributos
    private int front;
    private int rear;
    private Proceso[]arrProc;
    
    //Constructores
    //Por defecto
    public Cola(){
        
    }
    
    //Parametros
    public Cola(int dim){
        arrProc = new Proceso[dim];
        for(int i=0; i<arrProc.length; i++)
            arrProc[i]= new Proceso();
        
        front =-1;
        rear=-1;
    }
    
    //Metodos get y set

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public Proceso[] getArrProc() {
        return arrProc;
    }
    
    //Metodos de clase
    public boolean colaVacia(){
        if(front ==-1 && rear ==-1)
            return true;
        else return false;
    }
    
    public boolean colaLlena(){
        if(front == 0 && rear==arrProc.length-1)
            return true;
        else if(front==rear+1){
            return true;
    }else 
            return false;
    }
    
    public void Insertar (Proceso objProc){
        if(!colaLlena()){
            
            if(colaVacia()){//Cola Vacia
                front=0;
                rear=0;
                arrProc[rear]=objProc;
            }else if(rear==arrProc.length-1 && front>0){//Cola circular
                rear=0;
                arrProc[rear]=objProc;
                
            }else//Cola simple
                arrProc[++rear]=objProc;
            
        }
        
          //  JOptionPane.showMessageDialog(null, "La cola no tiene espacio!!");
            }

    
    public Proceso eliminar(){
        Proceso objRet = new Proceso();
        if(!colaVacia()){
            if(front==rear){//Hay un solo elemnto en la cola
                
                objRet = arrProc[front];
                arrProc[front]=null;
                front =-1;
                rear=-1;
                
            }else
                if(front == arrProc.length-1){//se hace circular
                    objRet=arrProc[front];
                    arrProc[front]=null;
                    front=0;
                }
            else{
              objRet=arrProc[front];
               arrProc[front++]=null;
          }
         
        }
            //JOptionPane.showMessageDialog(null, "La cola esta vacia");
             return objRet;
    }
    
    public int contElem(){
        if(!colaVacia()){
            if(front==rear)
             return 1;
            
            else if(front<rear)
             return (rear-front)+1;
            else
                return ((arrProc.length-front)+rear)+1;
                        
            
        }
        return 0;
      
    }

    public void Mostrar(JTable Tabla){
          DefaultTableModel modelo=(DefaultTableModel)Tabla.getModel();
              modelo.setRowCount(3);
              modelo.setColumnCount(contElem());
       if(!colaVacia()){
            Proceso auxProc= new Proceso();
            int col = contElem();
            
            while(col>0){
                auxProc = eliminar();
                auxProc.mostrar(Tabla, col-1);
                col--;
                Insertar(auxProc);
            }
             
        
           
       }else
          JOptionPane.showMessageDialog(null, "La cola esta vacia!!!");
    } 

    public void InvertirCola(){
        if(contElem()>=2){
            
        Pila auxPila = new Pila(contElem());
        
        //se pasan los elemntos de la cola a la auxPila
        while(!colaVacia())
            auxPila.push(eliminar());
        
        //Pasar los elementos de la pila a la cola
        while(!auxPila.pilaVacia())
            Insertar(auxPila.pop());
        
        
            
    }else
            JOptionPane.showMessageDialog(null, "Se necesitan al menos"+
                    "2 elementos en lan cola");
            
}
    
    public void elimMedio(){
        if(contElem()>2){
            if(contElem()%2!=0){
                Cola auxC1 = new Cola(contElem()/2);
                Cola auxC2 = new Cola(contElem()/2);
                
                while(!auxC1.colaLlena())
                    auxC1.Insertar(eliminar());
                
                //eliminar elemento medio
                eliminar();
                
                while(!auxC2.colaLlena())
                    auxC2.Insertar(eliminar());
                
                //Regreso elementos a la cola original
                
                while(!auxC1.colaVacia())
                    Insertar(auxC1.eliminar());
                
                while(!auxC2.colaVacia())
                    Insertar(auxC2.eliminar());
                
                
                
            }else
                JOptionPane.showMessageDialog(null, "El total de elemntos"+
                        "debe de ser un numero impar");
        }else
            JOptionPane.showMessageDialog(null, "Debe de haber al menos"+
                    "3 elementos en cola");
    }
    
    //METODO QUE ELIMINE UN ELEMENTO QUE EL USUSARIO SELECCIONE
    public void elimPos (int pos){
        if(pos>0 && pos<=contElem()){
            
            if(pos==1)
                eliminar();
            else{
                Cola auxC1 = new Cola(pos-1);
                Cola auxC2 = new Cola(contElem()-pos);
                
                while(!auxC1.colaLlena())
                    auxC1.Insertar(eliminar());
                
                //Eliminar el elemento de la posicion selecionada
                eliminar();
                
                if(contElem()!=0){
                while(!auxC2.colaVacia())
                auxC2.Insertar(eliminar());
                
                //regreso de los elementos
                while(!auxC1.colaVacia())
                    Insertar(auxC1.eliminar());
                
                if(auxC2.contElem()!=0){
                while(!auxC2.colaVacia())
                   Insertar(auxC2.eliminar());
                }
            
            
            
            
        }else
            JOptionPane.showMessageDialog(null, "La posicio no existe");
    }
}
}
    
    public void intPos1xPos2(int pos1, int pos2){
        if(pos1!=pos2){
            if(pos1>0 && pos1<=contElem()){
                if(pos2>0 && pos2<=contElem()){
                    
                    Proceso auxProc1 = new Proceso();
                    Proceso auxProc2 = new Proceso();
                    Cola auxCola = new Cola(contElem()-2);
                    
                    int cont = contElem();
                    for(int i =1; i<=cont; i++)
                        if(i==pos1)
                            auxProc1 = eliminar();
                        else if(i==pos2)
                            auxProc2 = eliminar();
                        else 
                            auxCola.Insertar(eliminar());
                    
                    //Regreso
                    for(int i=1; i<=cont; i++)
                        if(i==pos1)
                    Insertar(auxProc2);
                    
                    else if(i==pos2)
                        Insertar(auxProc1);
                    else
                        Insertar(auxCola.eliminar());
                    
                   
                   
                    
                }else
                    JOptionPane.showMessageDialog(null, "La posición 2 no existe!!");
                
            }else
                JOptionPane.showMessageDialog(null, "La posicion 1 no existe");
            
        }else
            JOptionPane.showMessageDialog(null, "Las posiciones debe de ser"
                    + "diferentes");
        
    }
    
    public void intPosParxPosImp(){
        if(contElem()>=4){
            if(contElem()%4==0){
                
                Cola c1Impar = new Cola(contElem()/4);
                Cola c1Par = new Cola(contElem()/4);
                Cola c2Impar = new Cola(contElem()/4);
                Cola c2Par = new Cola(contElem()/4);
                
                int cont=contElem();
                
                while(!c1Impar.colaLlena()){
                    c1Impar.Insertar(eliminar());
                    c1Par.Insertar(eliminar());
                }
                
                 while(!c2Impar.colaLlena()){
                    c2Impar.Insertar(eliminar());
                    c2Par.Insertar(eliminar());
                }
                 
                 
                 while(!c1Impar.colaVacia()){
                     Insertar(c1Impar.eliminar());
                     Insertar(c2Impar.eliminar());
                 }
                 
                 while(!c1Par.colaVacia()){
                     Insertar(c1Par.eliminar());
                     Insertar(c2Par.eliminar());
                 }
                     
            }else
                JOptionPane.showMessageDialog(null, "El total de elementos "
                        + "debe de ser un multiplo de 4");
           
        }else
            JOptionPane.showMessageDialog(null, "Se necesitan al menos"
                    + "4 elementos");
    }
    
    public void intPosParxPosImp2(){
        if(this.contElem()>4){
            if(this.contElem()%2==0){
                
                Cola c1Impar;
                Cola c1Par;
                Cola c2Impar;
                Cola c2Par;
                
                if(this.contElem()/2%2!=0){
                    c1Par = new Cola((this.contElem()/4));
                    c1Impar = new Cola((this.contElem()/4)+1);
                    
                    c2Par = new Cola((this.contElem()/4)+1);
                    c2Impar = new Cola((this.contElem()/4));
                    
                    while(!c1Impar.colaLlena()){
                        c1Impar.Insertar(eliminar());
                        if(c1Par.colaLlena())
                        c1Par.Insertar(eliminar());
                        
                    }
                    
                    while(!c2Par.colaLlena()){
                        c2Par.Insertar(eliminar());
                        if(!c2Impar.colaLlena())
                        c2Impar.Insertar(eliminar());
                    }
                    
                    //Regreso
                    while(c1Impar.colaVacia()){
                        Insertar(c1Impar.eliminar());
                        if(!c2Impar.colaVacia())
                        Insertar(c2Impar.eliminar());
                    }
                    
                    while(c2Par.colaVacia()){
                        Insertar(c2Par.eliminar());
                        if(!c1Par.colaVacia())
                        Insertar(c1Par.eliminar());
                    }
                    
                }else
                    this.intPosParxPosImp();
                
                
            }JOptionPane.showMessageDialog(null, "El total de elementos "
                        + "debe de ser un multiplo de 4");
            }JOptionPane.showMessageDialog(null, "Se necesitan al menos"
                    + "4 elementos");
  }
            
    
}








