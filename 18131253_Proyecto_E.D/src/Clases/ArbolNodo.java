/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author adria
 */
public class ArbolNodo {
     
    private ArbolProceso Datos;
    private ArbolNodo Izquierdo;
    private ArbolNodo Derecho;
    private int dato;
    
    //Constructor
    public ArbolNodo(ArbolProceso datosProc){
        this.Datos = datosProc;
        this.Izquierdo = null;
        this.Derecho = null;
    }
    
    public ArbolNodo(int dato, ArbolNodo izq, ArbolNodo der) {
        this.dato = dato;
        this.Izquierdo = izq;
        this.Derecho = der;
    }
    //Metodos Get y Set

     public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public ArbolProceso getDatos() {
        return Datos;
    }

    public void setDatos(ArbolProceso datos) {
        this.Datos = datos;
    }

    public ArbolNodo getIzquierdo() {
        return Izquierdo;
    }

    public void setIzquierdo(ArbolNodo izquierdo) {
        this.Izquierdo = izquierdo;
    }

    public ArbolNodo getDerecho() {
        return Derecho;
    }

    public void setDerecho(ArbolNodo derecho) {
        this.Derecho = derecho;
    }
}
