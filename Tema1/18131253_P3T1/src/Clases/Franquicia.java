/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author aa421
 */
public class Franquicia {
  //Atributos
    private String numFranc;
    private String nombFranc;
    private int numEmpleado;
    private double ventaAnuales;
    
    
    //Constructores
    public Franquicia(){
        this.numFranc="";
        this.nombFranc="";
        this.numEmpleado=0;
        this.ventaAnuales=0;
    }
    
    public Franquicia(String numFranc, String nombFranc, int numEmpleado, double ventaAnuales){
        this.numFranc=numFranc;
        this.nombFranc=nombFranc;
        this.numEmpleado=numEmpleado;
        this.ventaAnuales=ventaAnuales;
    }
    //Metodos
    public void aleatorio(JTable tabla){
        Random azar = new Random();
        
        String []arrLts ={"A", "B", "C"};
        String  []arrNomb ={"McDonalds", "Oxxo", "KFC", "Seven Eleven", "TSM", "Galerias","4 Caminos",
            "Almanara", "Carls Jr", "Lonches Payo", " La Blanquita"};
        
        tabla.setValueAt(arrLts[azar.nextInt(arrLts.length)]+azar.nextInt(10)+1, 0, 0);
        tabla.setValueAt(arrNomb[azar.nextInt(arrNomb.length)], 0, 1);
        tabla.setValueAt(azar.nextInt(51)+5, 0, 2);
        double ventas = azar.nextInt(1000)+100+azar.nextDouble();
        
        DecimalFormat df = new DecimalFormat("#.##");
        tabla.setValueAt(df.format(ventas), 0, 3);
        
    }
    
  
    //Get y Set

    public String getNumFranc() {
        return numFranc;
    }

    public void setNumFranc(String numFranc) {
        this.numFranc = numFranc;
    }

    public String getNombFranc() {
        return nombFranc;
    }

    public void setNombFranc(String nombFranc) {
        this.nombFranc = nombFranc;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getVentaAnuales() {
        return ventaAnuales;
    }

    public void setVentaAnuales(double ventaAnuales) {
        this.ventaAnuales = ventaAnuales;
    }
    
}
