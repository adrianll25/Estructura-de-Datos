package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aa422
 */
public class Proceso {
    
    //Atributos
    private String nomProc;
    private String tipoProc;
    private double tiempoLl;
    private double tiempoEj;
    private int prioridad;
    private int quantum;
    
    public Proceso()
    {
        this.nomProc = "";
        this.tipoProc = "";
        this.tiempoLl = 0.0;
        this.tiempoEj = 0.0;
        this.prioridad = 0;
        this.quantum = 0;
    }
    
    public Proceso(String nomProc, String tipoProc, double tiempoLl, double tiempoEj, int prioridad, int quantum)
    {
        this.nomProc = nomProc;
        this.tipoProc = tipoProc;
        this.tiempoLl = tiempoLl;
        this.tiempoEj = tiempoEj;
        this.prioridad = prioridad;
        this.quantum = quantum;
    }
    
    //Metodos
    
    public void aleatorio(JTextField nombre, JTextField tipo, JTextField tiempoLleg,
                          JTextField tiempoEjec, JTextField prioridad, JTextField quantum)
    {
        Random azar = new Random();
        String []arrTipo = {"logico","memoria","cpu","dd","direccion","registro"};
        
        nombre.setText("P"+azar.nextInt(21));
        tipo.setText(arrTipo[azar.nextInt(6)]);
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        double llegada = azar.nextInt(21)+azar.nextDouble();
        tiempoLleg.setText(df.format(llegada));
        
        double ejecucion = azar.nextInt(51)+azar.nextDouble();
        tiempoEjec.setText(df.format(ejecucion));
        
        prioridad.setText(String.valueOf(azar.nextInt(21)));
        
        quantum.setText(String.valueOf(azar.nextInt(13)));
        
        
    }
    //Metodos get/set

    public String getNomProc() {
        return nomProc;
    }

    public void setNomProc(String nomProc) {
        this.nomProc = nomProc;
    }

    public String getTipoProc() {
        return tipoProc;
    }

    public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
    }

    public double getTiempoLl() {
        return tiempoLl;
    }

    public void setTiempoLl(double tiempoLl) {
        this.tiempoLl = tiempoLl;
    }

    public double getTiempoEj() {
        return tiempoEj;
    }

    public void setTiempoEj(double tiempoEj) {
        this.tiempoEj = tiempoEj;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }
    
    
}
