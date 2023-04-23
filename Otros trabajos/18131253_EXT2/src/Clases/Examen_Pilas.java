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
public class Examen_Pilas {
    public void InvertirMitades(){
        if(tope >=4){
           
            pila auxPila = new Pila(tope-4);
            Proceso auxProc1 = new Proceso();
            Proceso auxProc2 = new Proceso();
            Proceso Penultimo1 = new Proceso();
           
            
            Penultimo1 = pop();
            auxProc1 = pop();
            
            
            while(!auxPila.pilaLlena())
                auxPila.push(Pop());
                
            auxProc2 = pop();
            
            push(auxProc1);
            
            
            while(!auxPila2.pilaVacia)
            push(auxProc2);
            push(penultimo1);
            
            
        }
            
     }
    
    
}
