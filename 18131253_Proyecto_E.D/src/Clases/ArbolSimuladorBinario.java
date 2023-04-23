/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author adria
 */
public class ArbolSimuladorBinario {
    
    Arbol miArbolito = new Arbol();

    public ArbolSimuladorBinario() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbolito.agregar(dato));
    }
    
    //metodo para mostrar los recorridos del arbol
    public String preOrden() {
        LinkedList it = this.miArbolito.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }

    public String inOrden() {
        LinkedList it = this.miArbolito.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }

    public String postOrden() {
        LinkedList it = this.miArbolito.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }
    
    //metodo para poder mostrar los tipos d recorrido
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }
    
    
    //Metodo para buscar dato en el nodo
    public String buscar(Integer dato) {
        boolean siEsta = this.miArbolito.existe(dato);
        String r = "El dato:" + dato.toString() + "\n";
        r += siEsta ? "Si esta el nodo en el arbol" : "No esta el nodo en el arbol";
        return (r);
    }

    public JPanel getDibujo() {
        return this.miArbolito.getdibujo();
    }
    
}
