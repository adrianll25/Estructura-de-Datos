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
public class Nodo {
    
    //Atributos
    private Proceso datos;
    private Nodo izquierdo;
    private Nodo derecho;
    
    //Constructor
    public Nodo(Proceso datosProc){
        this.datos = datosProc;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    //Get and Set
    public Proceso getDatos() {
        return datos;
    }

    public void setDatos(Proceso datos) {
        this.datos = datos;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
}
