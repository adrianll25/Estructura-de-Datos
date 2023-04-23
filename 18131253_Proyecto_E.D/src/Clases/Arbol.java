/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Arbol {
    //Atributos
    ArbolNodo raiz;
    int num_nodos;
    int alt;
    
    //Constructor
    public Arbol(){
        raiz = null;
    }
    
    //Metodos
    public void insertar(ArbolProceso datosProc){
        ArbolNodo nuevo = new ArbolNodo (datosProc);
        if(raiz==null)
            raiz = nuevo;
        else{
            ArbolNodo aux = raiz;
            ArbolNodo ant = null;
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
    
    public void preorden(ArbolNodo raiz, DefaultTableModel modelo){
        if(raiz==null){            
        }else{
            raiz.getDatos().mostrarProceso(raiz.getDatos(),modelo);            
            preorden(raiz.getIzquierdo(),modelo);
            preorden(raiz.getDerecho(),modelo); 
        }
    }
    public void inorden(ArbolNodo raiz, DefaultTableModel modelo){
        if (raiz == null) {
        } else {
            preorden(raiz.getIzquierdo(), modelo);
            raiz.getDatos().mostrarProceso(raiz.getDatos(), modelo);
            preorden(raiz.getDerecho(), modelo);
        }
    }
    
    public void Posorden(ArbolNodo raiz, DefaultTableModel modelo){
        if(raiz==null){            
        }else{           
            preorden(raiz.getIzquierdo(),modelo);
            preorden(raiz.getDerecho(),modelo); 
            raiz.getDatos().mostrarProceso(raiz.getDatos(),modelo); 
        }
    }
    
    public ArbolNodo getRaiz() {
        return raiz;
    }

    public void setRaiz(ArbolNodo raiz) {
        this.raiz = raiz;
    } 
    
    public boolean BuscarNodo(int numProc, ArbolNodo[]nodoEnc){
        boolean Bandera = false;
        ArbolNodo aux = raiz;
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
    
    public void eliminar(ArbolNodo nodoEnc[]){
        ArbolNodo aux = raiz;
        ArbolNodo ant = null;
        while(aux != nodoEnc[0]){
            ant = aux;
            if(nodoEnc[0].getDatos().getNumProc()>=aux.getDatos().getNumProc()){
                aux = aux.getDerecho();
            }
            else{
                aux = aux.getIzquierdo();
            }
        }
        //Verificar que el nodo sea hoja:
        if(aux.getDerecho()==null && aux.getIzquierdo()==null){
            if(aux==null)//Quiere decir que el nodo a eliminar es la raiz
                this.setRaiz(null);
            else if(aux.getDatos().getNumProc() >= ant.getDatos().getNumProc())
                    ant.setDerecho(null);
            else
                    ant.setIzquierdo(null);
        }
        
        //Verificar que el nodo tenga dos hijos:
        else if(aux.getDerecho()!=null && aux.getIzquierdo() !=null){
            ArbolNodo temp = nodoEnc[0].getDerecho();
            ArbolNodo ant2 = nodoEnc[0];
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
        
        //Tiene un hijo del lado derecho:
        else if(aux.getDerecho()!=null && aux.getIzquierdo() == null){
            if(ant==null)//Es la raiz
                raiz = aux.getDerecho();
            else
                if(ant==nodoEnc[0])
                    ant.setIzquierdo(nodoEnc[0].getDerecho());
                else
                    ant.setDerecho(nodoEnc[0].getDerecho());
        }
        else if(aux.getIzquierdo()!=null && aux.getDerecho()==null){
            if(ant==null)//Es la raiz
                raiz = aux.getIzquierdo();
            else
                if(ant==nodoEnc[0])
                    ant.setIzquierdo(nodoEnc[0].getIzquierdo());
            else
                    ant.setDerecho(nodoEnc[0].getIzquierdo());
        }
        
    }
    
    //Metodos para El Arbol Grafico 
    public boolean agregar(int dato) {
        ArbolNodo nuevo = new ArbolNodo(dato, null, null);
        insertar(nuevo, raiz);
        return true;
    }
    
    //Metodo para insertar un dato en el arbol grafico
    public void insertar(ArbolNodo nuevo, ArbolNodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzquierdo() == null) {
                    pivote.setIzquierdo(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzquierdo());
                }
            } else {
                if (pivote.getDerecho() == null) {
                    pivote.setDerecho(nuevo);
                } else {
                    insertar(nuevo, pivote.getDerecho());
                }
            }
        }

    }
    
     //Recorrido preorden, recibe el nodo raiz y una linkedlist para guardar el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }
    
    public void preorden(ArbolNodo aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getIzquierdo(), recorrido);
            preorden(aux.getDerecho(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo raiz y una linkedlist para guardar el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }
    
    public void inorden(ArbolNodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzquierdo(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDerecho(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo raiz y una linkedlist para guardar el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }
    public void postorden(ArbolNodo aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzquierdo(), recorrido);
            postorden(aux.getDerecho(), recorrido);
            recorrido.add(aux.getDato());
        }
    }

    //Metodo para compronar si hay un nodo en el arbol
    public boolean existe(int dato) {
        ArbolNodo aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDerecho();
            } else {
                aux = aux.getIzquierdo();
            }
        }
        return false;
    }

    private void altura(ArbolNodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzquierdo(), nivel + 1);
            alt = nivel;
            altura(aux.getDerecho(), nivel + 1);
        }
    }

   //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }
    
     public JPanel getdibujo() {
        return new ArbolGrafico(this);
    }
    
}
