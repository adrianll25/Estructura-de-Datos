package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aa421
 */
public class Pila {
    //Atributo
    private Proceso []arrProc;
    int tope;
    
    //Constructor
    public Pila(int dim){
        arrProc = new Proceso[dim];
        for(int i=0; i<arrProc.length; i++)
            arrProc[i]= new Proceso();
         tope=0;
         
    }
    
    //Metodos
    //Metodo pilaVacia
    public boolean pilaVacia(){
        if(tope ==0)
            return true;
        else
            return false;
}
    //Metodo pila LLena
    public boolean pilaLlena(){
        if(tope==arrProc.length)
            return true;
        else
            return false;
    }
    
    //Metodo Push para insertar elementos a la pila
    public void push(Proceso objIns){
        if(!pilaLlena()){
            arrProc[tope++]=objIns;
            
        }else{
            JOptionPane.showMessageDialog(null, "La pila esta llena");
        }
     }
    
    //Metodo pop para sacar elementos de la pila
    public Proceso pop(){
        Proceso objRet = new Proceso();
        
        
        if(!pilaVacia()){
            objRet=arrProc[--tope];
            arrProc[tope]=null;
        }
        else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            
        }
        return objRet;
        
    }
    
    
    //Metodo para mostrar la pila
    public void MostrarPila(JTable tablaMostrar){
        DefaultTableModel modelo=(DefaultTableModel)tablaMostrar.getModel();
        modelo.setRowCount(tope);
        
        if(!pilaVacia()){
            Pila auxPila = new Pila(tope);
            Proceso auxProc = new Proceso();
            int  ren=0; 
            
            while(!pilaVacia()){
                auxProc = pop();
                auxProc.mostrar(tablaMostrar, ren++);
                auxPila.push(auxProc);
                
            }
            while(!auxPila.pilaVacia())
                push(auxPila.pop());
            
        }else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            
        }
    }
    public void invertirPila(){
        if(tope>=2)
        {
            Pila auxPila1 = new Pila(tope);
            Pila auxPila2 = new Pila(tope);
            
            while(!auxPila1.pilaLlena())
                auxPila1.push(pop());
            
            //Paso elementos de la auxPila1 a auxPila2
            while(!auxPila2.pilaLlena())
               auxPila2.push(auxPila1.pop());
            
            //Paso elementos de la auxPila2 a pila
            while(!auxPila2.pilaVacia())
                push(auxPila2.pop());
        }
        else
            JOptionPane.showMessageDialog(null, "Se necesita minimo"
            +"2 elementos en la pila");
    }
    
    public void elimMedio(){
        if(tope%2 !=0){
            if(tope>=3){
                
                Pila auxPila = new Pila(tope/2);
                /*Ciclo para pasar la mitad de los elementos de la
                pila a auxPILA
                */
                while(!auxPila.pilaLlena())
                    auxPila.push(pop());
                
                //eliminar pila del medio
                pop();
                //Ciclo para regrear los elementos de la auxPila a la pila original
                while(!auxPila.pilaVacia())
                push(auxPila.pop());
                
            }else
                JOptionPane.showMessageDialog(null, "Se necesitan"
                +" al menos 3 elementos en la pila");
        }else
            JOptionPane.showMessageDialog(null, "El numero "
                    +"total de elementos en la pila"
            +" de de ser impar");
                
            }
    
    public void eliminElementoFondo(){
        if(tope>=2){
            Pila auxPila = new Pila(tope-1);
            while(!auxPila.pilaLlena())
                auxPila.push(pop());
            pop();
            while (!auxPila.pilaVacia())
                push(auxPila.pop());
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Se necesitan"+
                    "al menos 2 elementos en la pila");
        }
    }
    
    public void EliminarPilaMedio(){
         if(tope>=2)
        {
            Proceso auxPT = new Proceso();
            Pila auxPila = new Pila(tope-2);
            Proceso auxPF = new Proceso();
            
            //Guardamos el elemnto tope en auxPT
            auxPT = pop();
            
            //Ciclo para paar los elementos de enmedio a la auxPila
            while(!auxPila.pilaLlena())
            auxPila.push(pop());
            
            //Guardamos el elemnto fondo en el auxPF
            auxPF=pop();
            //regreso de los elementos en la pila
            //Insertamos el elemento que estaba en el tope  al inicio de la pila
            push(auxPT);
            
            //Regresamos a los elementos de en medio de la pila
            while(!auxPila.pilaVacia())
                push(auxPila.pop());
            
            //Insertamos e elemento que estaba en el fondo de la pila al tope
            push(auxPF);
            
        }
        }
    
    public void CambiarPenultimo(){
        if(tope>=4)
        {
            Proceso auxPP = new Proceso();
            Pila auxPila = new Pila(tope-4);
            Proceso auxP2 = new Proceso();
            Proceso ultimo = new Proceso();
            
            //Guardamos el elemnto tope en auxPT
            ultimo = pop();
            
            auxPP=pop();
            //Ciclo para paar los elementos de enmedio a la auxPila
            while(!auxPila.pilaLlena())
            auxPila.push(pop());
            
            //Guardamos el elemnto fondo en el auxPF
            auxP2=pop();
            //regreso de los elementos en la pila
            //Insertamos el elemento que estaba en el tope  al inicio de la pila
            push(auxPP);
            
            //Regresamos a los elementos de en medio de la pila
            while(!auxPila.pilaVacia())
                push(auxPila.pop());
            
//            Insertamos e elemento que estaba en el fondo de la pila al tope
            push(auxP2);
            
            
            
            push(ultimo);
            
            
            
        }
    }
    
    public void trenza(){
        if(tope%2==0){
            
        Pila auxPPar = new Pila(tope/2);
        Pila auxPimpar = new Pila(tope/2);
        
       
        //Metodo para pasar la mitad de los elememtos de la pila
        //a auxPPar y auxPimpar
        while(!auxPPar.pilaLlena()&&!auxPimpar.pilaLlena())
        {
            auxPPar.push(pop());
            auxPimpar.push(pop()); 
        }
         
        //Ciclo para ingresar los elementos de la auxPPar a la pila original
        while(!auxPPar.pilaVacia()&&!auxPimpar.pilaVacia())
        {
            push(auxPPar.pop());
            push(auxPimpar.pop());
        }
    }else{
    JOptionPane.showMessageDialog(null, "Se necesitan almenos "
            + "4 datos para utilizar la función");
}
}
    
    public void InvertirMitad(){
         if(tope>=2)
        {
            Pila auxPila1 = new Pila(tope);
            Pila auxPila2 = new Pila(tope);
            
            while(!auxPila1.pilaLlena())
                auxPila1.push(pop());
            
            //Paso elementos de la auxPila1 a auxPila2
            while(!auxPila2.pilaLlena())
               auxPila2.push(auxPila1.pop());
            
            //Paso elementos de la auxPila2 a pila
            while(!auxPila2.pilaVacia())
                push(auxPila2.pop());
        }
    }
    
    public void UsuarioEleccion(int pos1, int pos2){
        if(pos1!=pos2){
            if(pos1>0 && pos1<=tope){
                if(pos2>0 && pos2<=tope){
                    
         Pila auxPila = new Pila(tope-2);
         Proceso auxP1 = new Proceso();
         Proceso auxP2 = new Proceso();
         
         int cont = tope;
         for(int i=tope; i>0; i--){
             if(i==pos1)
                 auxP1=pop();
             else
                 if(i==pos2)
                     auxP2=pop();
             else
                     auxPila.push(pop());
               
             }
         
            for(int i=1; i<=cont; i++){
             if(i==pos1)
                 push(auxP2);
             else
                 if(i==pos2)
                    push(auxP1);
             else
                    push(auxPila.pop());
         }
                    
                }else 
                    JOptionPane.showMessageDialog(null, "La posicion No existe");
                
            }else
                JOptionPane.showMessageDialog(null, "La posicion no existe");
            
        }else
            JOptionPane.showMessageDialog(null, "Las posiciones deben ser"
            +"diferentes");
       
    }

}
    
            



    

