/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author adria
 */
public class Automovil {
    private String Placa;
    private String Marca;
    private int Modelo;
    private String Color;
    private double Precio;
    
    public Automovil(){
        Placa = "";
        Marca ="";
        Modelo=0;
        Color = "";
        Precio=0.0;
        
    }
    
    public Automovil(String Placa, String Marca, int Modelo, String Color, double Precio){
        this.Placa=Placa;
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.Color=Color;
        this.Precio= Precio;
    }
    
    public void aleatorio(JTable tabla)
    {
        Random azar = new Random();
        String []arrLetra={"ERN-","LOL-","ADR-","MAG-",
                           "MAC-","JAL-","DIO-","KHL-",
                           "KJG-","PUT-","FUK-","MINT-",
                           "WEY-","NOO-","CIS","EÑA-"};
        String []arrMarca={"Ford", "Ferrari", "Chevrolett",
                           "Atos", "Honda", "Hyundai", 
                           "BMW", "Tesla", "Audi", "Bugatti",
                           "Susuki", "Jeep", "GMC"};
        
        String []arrColor={"Azul", "Verde", "Rojo", "Dorado", "Negro", "Blanco"};
        
        DecimalFormat df = new DecimalFormat("####.##");
        tabla.setValueAt(arrLetra[azar.nextInt(16)]+azar.nextInt(999), 0, 0);
        tabla.setValueAt(arrMarca[azar.nextInt(arrMarca.length)], 0, 1);
        tabla.setValueAt(azar.nextInt (20)+2000, 0, 2);
        tabla.setValueAt(arrColor[azar.nextInt(arrColor.length)], 0, 3);
        double precio = azar.nextInt(1000000)+100+azar.nextDouble();
        tabla.setValueAt(df.format(precio), 0, 4);
                                 
        }
     public void mostrar(JTable tablaMostrar, int ren){
        tablaMostrar.setValueAt(Placa, ren, 0);
        tablaMostrar.setValueAt(Marca, ren, 1);
        tablaMostrar.setValueAt(Modelo, ren, 2);
        tablaMostrar.setValueAt(Color, ren, 3);
        tablaMostrar.setValueAt(Precio, ren, 4);
        
    }
     
      public void mostrarCola(JTable tablaMostrar, int col){
        tablaMostrar.setValueAt(Placa, 0, col);
        tablaMostrar.setValueAt(Marca, 1, col);
        tablaMostrar.setValueAt(Modelo, 2, col);
        tablaMostrar.setValueAt(Color, 3, col);
        tablaMostrar.setValueAt(Precio, 4, col);
      }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}
