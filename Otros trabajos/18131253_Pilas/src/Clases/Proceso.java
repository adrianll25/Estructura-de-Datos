package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aa421
 */
public class Proceso {
    //Atributos
    private int numProc;
    private String tipoProc;
    private double quantum;
    
    
    //Construcor
    public Proceso()
    {
        this.numProc=0;
        this.tipoProc="";
        this.quantum=0.0;
    }
    
    public Proceso(int numProc, String tipoProc, double quantum){
        this.numProc=numProc;
        this.tipoProc=tipoProc;
        this.quantum=quantum;
    }
    
    
    //Metodo Aleatorio
    public void Aleatorio (JTable tabla)
    {
       Random azar = new Random();
       String []arrTipo = {"CPU", "Logico", "Memoria", "Video","Cache"};
       
       
       
       tabla.setValueAt(azar.nextInt(101), 0, 0);
       tabla.setValueAt(arrTipo[azar.nextInt(arrTipo.length)], 0, 1);
       DecimalFormat df = new DecimalFormat("#.##");
       double num =azar.nextInt(51)+azar.nextDouble();
       tabla.setValueAt(df.format(num), 0, 2);
       
    }
    
     //Metodo para mostrar al proceso al JTable
    public void mostrar(JTable tablaMostrar, int ren){
        tablaMostrar.setValueAt(numProc, ren, 0);
        tablaMostrar.setValueAt(tipoProc, ren, 1);
        tablaMostrar.setValueAt(quantum, ren, 2);
        
    }
    
    //GetySet

    public int getNumProc() {
        return numProc;
    }

    public void setNumProc(int numProc) {
        this.numProc = numProc;
    }

    public String getTipoProc() {
        return tipoProc;
    }

    public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
    }

    public double getQuantum() {
        return quantum;
    }

    public void setQuantum(double quantum) {
        this.quantum = quantum;
    }
    
}
