/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Ordenamientos {
    public int Longitud;
    int[] arreglo;
    int[] arrTemp;

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public Ordenamientos(){
        this.Longitud = 0;
        this.arreglo = null;
    }
    
    public Ordenamientos(int l){
        this.Longitud =l;
        this.arreglo = new int[this.Longitud];
        
    }
    
    public void InicializadorVector(){
        if(this.arreglo == null){
            this.arreglo = new int[this.Longitud];
        }
        
    }
    
    public void Insertar(int Pos, int Val){
        if(this.arreglo != null){
        this.arreglo[Pos] = Val;
    }
    }
    public String imprimir(){
        String datos = "";
        for(int i=0; i<Longitud; i++){
            datos = datos + " " +String.valueOf(arreglo[i]);
        }
        return datos;
    }
    
    public String Imprimir(int[] arreglo){
        String datos = "";
        
        for(int i=0; i<arreglo.length; i++){
            datos = datos + " " + String.valueOf(arreglo[i]);
        }
        return datos;
    }
public boolean esNumero(String Cadena){
    try{
        Double.parseDouble(Cadena);
        return true;
    }catch(NumberFormatException nfe){
        return false;
    }
}
 public void MergeSort(int[] arrOrdenado){
     this.arreglo = arrOrdenado;
     this.Longitud = arrOrdenado.length;
     this.arrTemp = new int[Longitud];
     Merge_Sort(0, Longitud - 1);
     
 }
 
 private void Merge_Sort(int primero, int ultimo){
     if(primero<ultimo){
         int medio = primero + (ultimo-primero)/2;
         Merge_Sort(primero, medio);
         Merge_Sort(medio+1, ultimo);
         mergesort(primero, medio, ultimo);
         

     }
 }
 
 private void mergesort(int primero,  int medio, int ultimo){
     for(int i=primero; i<=ultimo; i++){
         arrTemp[i]=arreglo[i];
     }
     
     int i = primero;
     int j = medio + 1;
     int k = primero;
     
     while(i<= medio && j<=ultimo)
     {
         if(arrTemp[i]<= arrTemp[j]){
             arreglo[k] = arrTemp[i];
             i++;
         }
         else{
             arreglo[k] = arrTemp[j];
             j++;
         }
         k++;
     }
     
     while(i<=medio){
         arreglo[k] = arrTemp[i];
         i++;
         k++;
     }
     
 }
    public int[] Inserccion(int[] arreglo, int primero, int ultimo){
        int i, j, p, aux;
       
        i=primero;
        j=ultimo;
        p=arreglo[(primero+ultimo)/2];
        
        do{
            while(arreglo[i]<p){
                i++;
            }
            while(arreglo[j]>p){
                j--;
            }
            
            if(i<=j){
                aux =arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        }
        while(i<=j);
        if(primero<j){
            this.Inserccion(arreglo, primero, j);
            
        }
        if(i<ultimo){
            this.Inserccion(arreglo, i, ultimo);
        }
        return arreglo;
    }
       
        public int busquedaBinaria(int []Arreglo, int Elemento){
        int Centro;
        int Primero;
        int Ultimo;
        int ValorCentro;
        
        Primero=0;
        Ultimo=Arreglo.length-1;
        
        while(Primero<=Ultimo){
            Centro=(Primero+Ultimo)/2;
            ValorCentro = Arreglo[Centro];
            
            if(Elemento==ValorCentro){
                return Centro;
                
                
            }else
                if(Elemento<ValorCentro){
                    Ultimo = Centro-1;
                }else
                    Primero = Centro+1;
            
        }
        return -1;
    }
    
    public String Secuencial(int Dato){
        String Datos = "";
        if(this.Longitud>0){
            for(int i = 0; i<this.Longitud; i++ ){
                if(this.arreglo[i]== Dato){
                    Datos = Datos + "Posición: " + i + "\n";
                }
            }
        }
        if(Datos.length()==0){
            return "No se encontro el dato: "+ Dato + " en el vector.";
        }
        else{
            return Datos;
        }
    }
    }
  
    
    
     





        