/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTable;

/**
 *
 * @author adria
 */
public class Empresa {
    private String idEmpresa;
    private String NombEmpresa;
    private int NumEmpleados;
    private float VentasAnuales;
    
    public Empresa(){
     idEmpresa = "";
     NombEmpresa = "";
     NumEmpleados =0;
     VentasAnuales = 0;
     
    }

    
   
    public void Mostrar(JTable tabla, int ren){
        tabla.setValueAt(idEmpresa, ren , 0);
        tabla.setValueAt(NombEmpresa, ren ,1);
        tabla.setValueAt(NumEmpleados, ren , 2);
        tabla.setValueAt(VentasAnuales, ren , 3);
    }
    
    public void Empresa(String idEmpresa, String NombEmpresa, int NumEmpleados, float VentasAnuales){
        this.idEmpresa = idEmpresa;
        this.NombEmpresa = NombEmpresa;
        this.NumEmpleados = NumEmpleados;
        this.VentasAnuales = VentasAnuales;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombEmpresa() {
        return NombEmpresa;
    }

    public void setNombEmpresa(String NombEmpresa) {
        this.NombEmpresa = NombEmpresa;
    }

    public int getNumEmpleados() {
        return NumEmpleados;
    }

    public void setNumEmpleados(int NumEmpleados) {
        this.NumEmpleados = NumEmpleados;
    }

    public float getVentasAnuales() {
        return VentasAnuales;
    }

    public void setVentasAnuales(float VentasAnuales) {
        this.VentasAnuales = VentasAnuales;
    }
    
    
}
