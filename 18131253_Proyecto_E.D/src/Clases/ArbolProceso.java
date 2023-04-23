/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class ArbolProceso {
    //Atributos
    private int numProc;
    private String tipoProc;
    private double quantum;
    
    //Constructor
    public ArbolProceso(){
        this.numProc = 0;
        this.tipoProc = "";
        this.quantum = 0.0;
    }
    public ArbolProceso (int numProc, String tipoProc, double quantum){
        this.numProc = numProc;
        this.tipoProc = tipoProc;
        this.quantum = quantum;
    }
    
    //Aleatorio
    public void Aleatorio (JTable tabla){
        Random rnd = new Random();
        String [] arrTipo ={"CPU","Logico","Memoria","Video","Cache"};
        tabla.setValueAt(rnd.nextInt(101),0,0);
        tabla.setValueAt(arrTipo[rnd.nextInt(arrTipo.length)],0,1);
        DecimalFormat df = new DecimalFormat ("#.##");
        double num = rnd.nextInt(51)+rnd.nextDouble();
        tabla.setValueAt(df.format(num),0,2);
    }
    
    //Mostrar Proceso
    public void mostrarProceso(ArbolProceso objProc, DefaultTableModel modelo){
        
         Object []arrObj = new Object[3];
            arrObj[0] = objProc.getNumProc();
            arrObj[1] = objProc.getTipoProc();
            arrObj[2] = objProc.getQuantum();
            
            modelo.addRow(arrObj);             
        
    }
    //Get and Sets
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
