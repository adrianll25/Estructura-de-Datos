/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Arboles {
    //Atributos
    Nodo raiz;
    
    //Constructor
    public Arboles(){
        raiz = null;
    }
    
    //Metodos
    public void Insertar(Proceso datosProc){
        Nodo nuevo = new Nodo (datosProc);
        if(raiz==null)
            raiz = nuevo;
        else{
            Nodo aux = raiz;
            Nodo ant = null;
            while(aux!=null){
                ant=aux;
                if(nuevo.getDatos().getNumProc()>=aux.getDatos().getNumProc())
                    aux = aux.getDerecho();
                else
                    aux = aux.getIzquierdo();
            }
            if(nuevo.getDatos().getNumProc()>=ant.getDatos().getNumProc())
                ant.setDerecho(nuevo);
            else
                ant.setIzquierdo(nuevo);
        }
    }
    
    
    public void Preorden(Nodo raiz, DefaultTableModel modelo){
        if(raiz==null){            
        }else{
            raiz.getDatos().MostrarProceso(raiz.getDatos(),modelo);            
            Preorden(raiz.getIzquierdo(),modelo);
            Preorden(raiz.getDerecho(),modelo); 
        }
    }
    
    public void Inorden(Nodo raiz, DefaultTableModel modelo){
        if(raiz==null){            
        }else{           
            Preorden(raiz.getIzquierdo(),modelo);
            raiz.getDatos().MostrarProceso(raiz.getDatos(),modelo); 
            Preorden(raiz.getDerecho(),modelo); 
        }
    }
    
    public void Posorden(Nodo raiz, DefaultTableModel modelo){
        if(raiz==null){            
        }else{           
            Preorden(raiz.getIzquierdo(),modelo);
            Preorden(raiz.getDerecho(),modelo); 
            raiz.getDatos().MostrarProceso(raiz.getDatos(),modelo); 
        }
    }
    
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    } 
    
    public boolean BuscarNodo(int numProc, Nodo[]nodoEnc){
        boolean Bandera = false;
        Nodo aux = raiz;
        while(aux!=null){
            if(numProc == aux.getDatos().getNumProc()){
                nodoEnc[0]=aux;
                Bandera = true;
                break;
            }
            if(numProc >= aux.getDatos().getNumProc()){
                aux = aux.getDerecho();
            }
            else
                aux = aux.getIzquierdo();
        }
        return Bandera;
    }
    
    public void Eliminar(Nodo nodoEnc[]){
        Nodo aux = raiz;
        Nodo ant = null;
        while(aux != nodoEnc[0]){
            ant = aux;
            if(nodoEnc[0].getDatos().getNumProc()>=aux.getDatos().getNumProc()){
                aux = aux.getDerecho();
            }
            else{
                aux = aux.getIzquierdo();
            }
        }
       
        if(aux.getDerecho()==null && aux.getIzquierdo()==null){
            if(aux==null)
                this.setRaiz(null);
            else if(aux.getDatos().getNumProc() >= ant.getDatos().getNumProc())
                    ant.setDerecho(null);
            else
                    ant.setIzquierdo(null);
        }
        
        else if(aux.getDerecho()!=null && aux.getIzquierdo() !=null){
            Nodo temp = nodoEnc[0].getDerecho();
            Nodo ant2 = nodoEnc[0];
            while(temp.getIzquierdo()!=null){
                ant2 = temp;
                temp = temp.getIzquierdo();
            }
            aux.setDatos(temp.getDatos());
            if(ant2 == nodoEnc[0]){
                ant2.setDerecho(temp.getDerecho());
            }
            else{
                ant2.setIzquierdo(temp.getDerecho());
            }
        }
       
        else if(aux.getDerecho()!=null && aux.getIzquierdo() == null){
            if(ant==null)
                raiz = aux.getDerecho();
            else
                if(ant==nodoEnc[0])
                    ant.setIzquierdo(nodoEnc[0].getDerecho());
                else
                    ant.setDerecho(nodoEnc[0].getDerecho());
        }
        else if(aux.getIzquierdo()!=null && aux.getDerecho()==null){
            if(ant==null)
                raiz = aux.getIzquierdo();
            else
                if(ant==nodoEnc[0])
                    ant.setIzquierdo(nodoEnc[0].getIzquierdo());
            else
                    ant.setDerecho(nodoEnc[0].getIzquierdo());
        }
        
    }
}
