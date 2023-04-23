/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Recursividad {
    
    //Método iterativo que obtenga el factorial de un número 
    public double Factorial ( int Num ){
        double Res=1;
        
        for(int i=1; i<=Num; i++)
            Res *= i;
        
        return Res;
    }
    

    //Método recursivo para obtener el factorial de un números
    public double factorialRec ( int Num, int i, double Res  ){
        if (i==Num)//Paso base
            return Res*i;
        
        else //Paso recursivo
            return factorialRec( Num , i+1, Res*i );
            
    }    
    
    public double FactorialRec2 ( int Num  ){
        if(Num==0)//Paso base
            return 1;
        
        else//Paso recursivo
            return FactorialRec2( Num-1)*Num;
    }
            
    public double Inversion(double CantIni, int Tasa, int n){
                
        for(int i=1; i<=n; i++){
             CantIni +=(CantIni*Tasa)/100;
        }
        
        return CantIni;
    }
    
    public double InversionRec (double CantIni, int Tasa, int n){
        if(n==0)//Paso base
            return CantIni;  
     
        else//Paso recursivo    
            return InversionRec( CantIni+=(CantIni*Tasa)/100, Tasa, n-1);
        
    }
    
    public int MultiplicRusa(int multiplicador, int multiplicando){
        int suma = 0;
        do{
            if(multiplicador%2!=0)
                suma+=multiplicando;
            multiplicador /=2;
            multiplicando *=2;
        }while(multiplicador>=1);
        return suma;
    }
    
    public int MultipliRusaRec(int multiplicador, int multiplicando, int suma){
        if(multiplicador == 0)//Paso Base
            return suma;
        else
            if(multiplicador%2!=0)
                suma+=multiplicando;
            return MultipliRusaRec (multiplicador/2, multiplicando*2, suma); 
    }
    
    public int MaxCDRec(int Dividendo, int Divisor){
        if(Divisor ==0)//Paso Base
            return Dividendo;
        else
            return MaxCDRec(Divisor, Dividendo % Divisor);
    }
    
    public int MaxCD(int Mayor, int Menor){
        int a = 0;
        int res = Mayor; 
        int cos = Menor;
        while(res%cos!=0){
            a = res / cos;
            cos= res- (a*cos);
            Menor = res - (a*cos);
            res= Menor;
        }
        return cos;
    }
    
    public String serieFib (int Elemento){
        int num1 = 0, num3 = 0;
        int num2 = 1;
        
        String cad = "0,1";
        
        for (int i = 1; i <=Elemento; i++) {
            num3 = num1;
            num1 = num2;
            num2 = num3 + num1;
            cad += "," + num2;
        }
        return cad;
    }
    
    public String serieFibRec(int Num1, int Num2, String cad, int n){
        if(n==0){//Paso base 
            return cad;
        }else
            return serieFibRec(Num2,Num1+Num2,cad += ","+(Num1+Num2),n-1);
    }
    
    public double expPot (double num, int pot){
        double res = num;
        for (int i = 1; i <= pot; i++) {
            res = Math.pow(res, i);
        }
        return res;
    }
    
    public double ExpPotRec (double Num, int n, int i){
        if(n==0){//Paso base 
            return Num;
        }else
            return ExpPotRec (Math.pow(Num, i), n-1,i+1);
    }
    
    public int SumaVector(int []arrInt){
        int suma = 0;
        for (int i = 0; i < arrInt.length; i++) {
            suma+=arrInt[i];   
        }
        return suma;
    }
    
    public int SumaVectorRec(int []arrInt, int Suma, int i){
        //Paso base
        if(i==arrInt.length)
            return Suma;
        else
            return SumaVectorRec(arrInt,Suma+=arrInt[i],i+1);
    }
    
    public boolean ParAmigos(int n1, int n2){
        int s1 = 0;
        for(int i=1; i<n1;i++)
            if(n1%i==0)
                s1+=i;
        
        int s2=0;
        for(int i=1;i<n2;i++)
            if(n2%i==0)
                s2+=i;
        
        if((n1==s2)&& (n2==s1))
            return true;
        else
            return false;
    }
    
    public int SumaParAmigoN1Rec(int Num1, int Sum1, int i){
        if(i==Num1-1){//Paso base
            return Sum1;
        }
        else
            if(Num1%i==0)
                Sum1+=i;
            return SumaParAmigoN1Rec(Num1,Sum1,i+1);
    }
    
    public int SumaParAmigoN2Rec(int Num2, int Sum2, int i){
        if(i==Num2-1)//Paso Base
            return Sum2;
        else
            if(Num2%i==0)
                Sum2+=i;
            return SumaParAmigoN2Rec(Num2, Sum2, i+1);
    }
    public void SumaMatrices(int [][]m1, int [][]m2, int [][]suma){
        for (int r = 0; r <m1.length; r++) {
            for (int c = 0; c <m1[0].length; c++)
                suma[r][c]=m1[r][c]+m2[r][c];
        }
    }
}
    
    


    
    
    
    
    
    
    
    
    
    

