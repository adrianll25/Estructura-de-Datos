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
    private Nodo sig;
    
    //Constructor
    public Nodo(Proceso datos)
    {
        this.datos = datos;
        this.sig = null;
    }
    
    public Nodo(Proceso datos, Nodo sig)
    {
        this.datos = datos;
        this.sig = sig; //Nodo al que se enlaza
    }
    
    //geta and Set
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
