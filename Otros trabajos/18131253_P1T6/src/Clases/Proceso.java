package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Proceso {
    
    //Atributos
    private int numProc;
    private String tipoProc;
    private double quantum;
    
    
    //Constructor
    public Proceso(){
        this.numProc=0;
        this.tipoProc="";
        this.quantum=0.0;

    }
    
    public Proceso(int numProc, String tipoProc, double quantum){
        this.numProc=numProc;
        this.tipoProc=tipoProc;
        this.quantum=quantum;
    }
    
    //Método aleatorio
    public void Aleatorio ( JTable tabla ){
        Random rnd = new Random();
        String []arrTipo = {"CPU","Lógico","Memoria","Vídeo","Cache"};
               
        tabla.setValueAt(rnd.nextInt(101), 0,0);
        tabla.setValueAt(arrTipo[rnd.nextInt(arrTipo.length)], 0,1);
        DecimalFormat df = new DecimalFormat("#.##");
        double num = rnd.nextInt(51)+rnd.nextDouble();
        tabla.setValueAt(df.format(num),0, 2);
    }
    
    //Método para mostrar
    public void mostrarProceso(Proceso objProc, DefaultTableModel modelo){
        
         Object []arrObj = new Object[4];
            arrObj[0] = objProc.getNumProc();
            arrObj[1] = objProc.getTipoProc();
            arrObj[2] = objProc.getQuantum();
            
            modelo.addRow(arrObj);             
        
    }
    
    
    //get y set

    public int getNumProc() {
        return numProc;
    }

    public String getTipoProc() {
        return tipoProc;
    }

    public double getQuantum() {
        return quantum;
    }

    public void setNumProc(int numProc) {
        this.numProc = numProc;
    }

    public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
    }

    public void setQuantum(double quantum) {
        this.quantum = quantum;
    }
    
    
}
