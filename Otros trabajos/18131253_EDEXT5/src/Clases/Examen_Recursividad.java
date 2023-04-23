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
public class Examen_Recursividad {
    public double Expresion(double num, int n, int i)
    {
        if(n == 0){
            return num;
        }
        else
            return Expresion(Math.pow(num, i), n-1, i+1);
        
    }
    
}
