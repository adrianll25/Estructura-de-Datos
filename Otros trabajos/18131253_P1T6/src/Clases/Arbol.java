/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Arbol {
    
    Nodo raiz;
    
    public Arbol(){
        raiz=null;
    }
    
     
    //Método para insertar un nodo en el árbol binario
    
    public void insertar(Proceso datosProc){
        Nodo nuevo = new Nodo(datosProc);
        
        if(raiz==null)
            raiz=nuevo;
        else{
            Nodo aux=raiz;
            Nodo ant=null;
            
            while(aux!=null){
                ant=aux;
                
                if(nuevo.getDatos().getNumProc()>=aux.getDatos().getNumProc()) aux = aux.getDerecho();
                
                else
                    aux= aux.getIzquierdo();                
            }
            if(nuevo.getDatos().getNumProc()>=ant.getDatos().getNumProc()) ant.setDerecho(nuevo);
            
            else
                ant.setIzquierdo(nuevo);                    
        }     
    }
    
    
    public void preorden(Nodo raiz, DefaultTableModel modelo){
        if(raiz==null){            
        }else{
            raiz.getDatos().mostrarProceso(raiz.getDatos(),modelo);            
            preorden(raiz.getIzquierdo(),modelo);
            preorden(raiz.getDerecho(),modelo); 
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    } 
}
