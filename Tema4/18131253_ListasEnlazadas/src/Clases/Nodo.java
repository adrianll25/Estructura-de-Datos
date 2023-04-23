/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author aa421
 */
public class Nodo {
   private Proceso datos;
    private Nodo sig;

    public Nodo(Proceso datos) {
        this.datos = datos;
        this.sig = null;
    }
    
    public Nodo(Proceso datos, Nodo sig){
        this.datos = datos;
        this.sig = sig;
    }

    public Proceso getDatos() {
        return datos;
    }

    public void setDatos(Proceso datos) {
        this.datos = datos;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
