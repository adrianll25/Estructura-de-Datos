/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author aa422
 */
public class Alumno {
    
   //Atributos
    private String numControl;
    private String nombre;
    private String carrera;
    private double promGeneral;
    
    //Contructor
    public Alumno()
    {
        this.numControl="";
        this.nombre="";
        this.carrera="";
        this.promGeneral=0.0;
    }
    public Alumno(String numControl, String nombre, String carrera, double promGeneral)
    {
        this.numControl=numControl;
        this.nombre=nombre;
        this.carrera=carrera;
        this.promGeneral=promGeneral;
    }

    //Metodos
    
    public void aleatorio (JTextField numControl, JTextField nombre, JTextField carrera, JTextField promGeneral)
    {
        Random azar = new Random();
        
        int []numCtrl = {18130000,19130000,20130000};
        int num = numCtrl[azar.nextInt(3)]+ azar.nextInt(10000);
        String []nombres = {"Carlos","Adrian","Juan","Luisa","Magnolia","Rosa"};
        String []apellidos ={"Luevanos","Hernandez","Bicho","Teran","Aguilar","Lopez"};
        String []carreras = {"Sistemas","Quimica","Industrial","Mecatronica"};
        
        numControl.setText(Integer.toString(num));
        nombre.setText( nombres[azar.nextInt(6)]+" "+apellidos[azar.nextInt(6)]);
        carrera.setText( carreras[azar.nextInt(4)]);
        
        DecimalFormat df = new DecimalFormat("#.#");
        double prom = azar.nextInt(10)+azar.nextDouble();
        promGeneral.setText(df.format(prom));
        
    }
    
    
    
    //Metodos get/set (propiedades)
    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromGeneral() {
        return promGeneral;
    }

    public void setPromGeneral(double promGeneral) {
        this.promGeneral = promGeneral;
    }
    
}
