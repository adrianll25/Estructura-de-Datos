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
 
     private Automovil datos;
     private Nodo sig;
    
    //Constructor
        public Nodo(Automovil datos)
    {
        this.datos = datos;
        this.sig = null;
    }
    
    public Nodo(Automovil datos, Nodo sig)
    {
        this.datos = datos;
        this.sig = sig; 
    }
    
   //Get y Set

    public Automovil getDatos() {
        return datos;
    }

    public void setDatos(Automovil datos) {
        this.datos = datos;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
