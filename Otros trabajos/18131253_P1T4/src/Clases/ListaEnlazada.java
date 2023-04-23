/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class ListaEnlazada {
    //Atributos
    private Nodo front;
    private Nodo rear;
    
    //Constructor
    public ListaEnlazada()
    {
        this.front = null;
        this.rear = null;
    }
  
    //Metodo lista Vacia
    public boolean ListaVacia()
    {
        if(this.front==null && this.rear==null) 
            return true;
        else
            return false;
 
    }
    
    //Metodo insertar al inicio
    public void insAlIni( Proceso objProceso)
    {
     //Declaramos un tipo de dato Nodo y se llama Nuevo
     Nodo nuevo;
     //Si la lista esta vacia
     if(ListaVacia())
     {
         //Creamos el objeto nuevo con el primer constructor de la clase nodo, este nodo
         //no se enlaxa, en la parte nodo solo tiene un null
         nuevo = new Nodo(objProceso);
         front = nuevo;//El nodo front apunta al nodo nuevo, porque solo hay un nodo
         rear = nuevo;//El nodo rear apunta al nodo nuevo, porque solo hay un nodo
     } else 
     {//Si no esta vaia quiere deir que al menos tiene un nodo
     //Creamos el objeto nuevo con el segundo constructor de la clase Nodo
     //Se pasa el proceso que se quiere insertar y luego el nodo front para que se enlace
     nuevo = new Nodo(objProceso, front);
     //El nodo Front apunta al nodo nuevo para que sea el inicio de la lista
     front = nuevo;  
     }
    }
  
    //Metodo insertar al final de la lista
    //Pasamos un proceso como parametro
    public void insAlFin (Proceso objProceso)
    {
    //Delaramos un tipo de dato Nodo y se llama nuevo
    Nodo nuevo;
    //Si la lista esta vacia
    if(ListaVacia())
    {
    //Creamos el objeto nuevo con el primer constructor de la clase Nodo, este nodo
    //no se enlaza, en la parte nodo solo tiene un null    
     nuevo = new Nodo (objProceso);
     front = nuevo;//El nodo front apunta apunta al nodo nuevo, porque solo hay un nodo
     rear = nuevo;//El nodo rear apunta al nodo nuevo, porque solo hay un  nodo 
    }else 
    {
        //Si no esta vacia quiere decir que al menos tiene un nodo
        //Creamos el objeto nuevo on el primer constructor de la clase Nodo
    nuevo = new Nodo(objProceso);
    //Enlazamos el ultimo nodo que es real con el Nuevo
    rear.setSig(nuevo);
    rear=nuevo; //El nodo rear apunta al nodo nuevo para marcar que es el ultimo nodo de la lista
    }
    }
    
    //Metodo que elimina al inicio de la lista y devuelve un objeto del tipo proceso
    public Proceso elimAlIni()
    {
        //Se declara y se crea el objeto objRet que es el que regresa el nodo a eliminar
        Proceso objRet = new Proceso();
        //Si son igual los nodos front y rear quiere decir que solo hay un nodo
        if(front == rear)
        {
            //Guardamos los datos del nodo en el objRet que es del tipo Proceso
         objRet = front.getDatos();
         //Los objetos front y rear se hace nulos y quedan como uando se rea un objeto lista enlazada
         //Cuando se manda llamar al onstructor de la lista elazada
         front = null;
         rear = null;
        }
        else
        {
            //Quiere decir que por lo menos hay dos o mas nodos
            //Guardamos los datos del nodo en el objRet que es del tipo Proceso
         objRet = front.getDatos();
         //El nodo que apunta al primer nodo es front y ahora apunta a la parte siguiente
         //es decir que ya no apuntara el primer nodo si no al que esta enlazado despues
         front = front.getSig();
        }
        //Se regresa el objeto objRet que guarda los datos del proceso que se elimino
        return objRet;
    }
    
    //Metodo para eliminar un nodo del final
    public Proceso elimFin()
    {
        //Se declara y se crea el pbjeto objRet que es el que regresa el nodo a eliminar
       Proceso objRet = new Proceso(); 
       //Si son iguales los nodos front y rear quiere decir que solo hay un nodo
       if(front == rear)
       {
           //Guardamos los datos del nodo en el objRet que es del tipo Proceso
           objRet = front.getDatos();
           //Loos objetos front y rear se hacen nulos y quedan como cuando se crea un objeto lista enlazada
           //Cuando se manda llamar al constructort de lista enlazada
           front = null;
           rear = null;
       }else
       {
           //Quiere decir que por lo menos hay dos o mas nodos
           //Guardamos los datos del nodo en el objRet que es del tipo proceso
           objRet = front.getDatos();
           //Se declara un objeto del tipo nodo que se llama aux y apunta a donde apinta el front
           //es decir los dos estan apntando al primer nodo de la lista
           Nodo aux=front;
           //Con este ciclo se hara un recorrido de toda la lista el nodo front nunca se movera de su lugar
           //el que se mueve es el nodo aux y se posiiona en el nodo penultimo de la lista
           //por eso se movera hasta que sea diferentes de rear el nodo apunta al ultimo nodo de la lista
           while(aux.getSig()!=rear)
           //Con esta instruccion se mueve de un nodo al otro porque apunta al siguente; es decir
           //un nodo se compone de un dato proceso y de un topo de dato nodo
           //el dato proceso son los datos de la clase proceso, del tipo nodo es un tipo de dato
           //nodo y para que se pudan enlazar deben apuntar al siguiente nodo
           aux = aux.getSig();
        //El nodo rear apunta al nodo aux que se quedo apuntando al nodo penultimo de la lista
        rear = aux;
        //y la parte de sig del nodo rear se le pone un null para decir que es el ultimo nodo
        rear.setSig(null);      
       }// se retorna el objeto
       return objRet;
    }
    
    //Metodo que cuenta el numero de nodo
    public int contNodos()
    {
        //se declara una variable del tipo entero
        int cont=0;
        //se valida que la lista no este vacia
        if(!this.ListaVacia())
        {
            //Se crea un nodo auxiliar y apunto a donde apunta el nodo front, es decir al primer nodo
            Nodo aux=front;
            //Se recorrera la lista hasta que llegue al final de la lista
            //recuerden que las lista terminan con un nodo que en su parte de sig tiene un null
            while(aux!=null){
                //se me mueve el nodo al siguiente nodo
                aux=aux.getSig();
                //Se incrementa la variable con por cada ciclo
                cont++;
        }
            
        }
        // Se regresa la variable cont
        return cont;
    }    
    
    //Metodo que muestra la lista enlazada, recibe como parametro de JTable donde se mostraran
    //Los datos de los nodos
    public void mostrarLista(JTable table)
    {
        DefaultTableModel modelo =  (DefaultTableModel)table.getModel();
        //Se valida que no este vacia la lista
       if(!this.ListaVacia())
       {
           //se define el numero de columnas con el metodo contNodos
           modelo.setColumnCount(this.contNodos());
           //Se definen el numero de renglones 
           modelo.setRowCount(3);
           //Se crea un objeto del tipo proeso auxProc
           Proceso auxProc = new Proceso();
           //Se inicializa la variable col en cero, que es la que
           //lleva el control de la comlumna donde se mostraran los datos
           //de los procesos
           int col=0;
           
           //Se utilizara un from para poder visitar cada uno de los nodos
           for(int i=1; i<=this.contNodos(); i++)
           {
               //Se elimina el proceso que esta al inicio de la lista, el primero
               auxProc = this.elimAlIni();
               //Se muestra el proceso en la tabla mandando llamar el metoso
               //mostrarProceso de la clase Proceso
               //se pasa como parametro la JTable table y la variable col
               auxProc.MostrarProceso(table, col++);/*Se incrementa la variable col
               despues de que se haya mostrado los datos del nodo */
               /*Se insertar el auxProc al final de la lista, para que cuando se termine
               el for todos los nodos de la lista enlazada quedan en su lugar*/
               this.insAlFin(auxProc);  
           }
       }else //De lo contrario se limpian los renglosnes de la tabla poeque esta vacia la lista
            modelo.setRowCount(0);
           }  
    
    public void invertirLista()
    {
        //Validar que haya al menos dos elementos en la lista
        if(this.contNodos()>=2)
        {
        //Declarar y crear una lista enlazada auxiliar
            ListaEnlazada auxLE = new ListaEnlazada();
            
        //Pasar los elementos de la lista original a auxLE todos en la misma posicion 
        while(!this.ListaVacia())
            auxLE.insAlFin(this.elimAlIni());
        
        //Pasar los elementos de auxLE de la lista original pero invertida 
        while(!this.ListaVacia())
            auxLE.insAlIni(this.elimAlIni());
        }else 
            JOptionPane.showMessageDialog(null,"Se necesita al menos 2 elementos de la lista");
}
    
    public void EliminarMedio()
    {
        if(this.contNodos()%2!=0)
        {
            if(this.contNodos()>=3)
            {
                //Se de termina el numero de ciclos para poder llegar al elemento medio 
                int medio = this.contNodos()/2;
                
                while(medio!=0)
                {
                    //Los elementos del inicio se insertaran al final de la lista
                    this.insAlFin(this.elimAlIni());
                    //Se decrementa el numero de ciclos
                    medio--;
                }
                
             //Se elimina el elemento medio
             this.elimAlIni();
             
             //Volvemos a iniciar la variable medio por que quedo en 0
             medio= this.contNodos()/2;
             
             while(medio!=0)
             {
                 //Los elementos del final se insertaran al inicio de la lista
                    this.insAlIni(this.elimAlIni());
                    //Se decrementa el numero de ciclos
                    medio--;
             }
            }else 
               JOptionPane.showMessageDialog(null,"La lista debe tener mas de 2 elementos en ella ");
        }else 
               JOptionPane.showMessageDialog(null,"El total de elementos debe ser un numero impar");
}
    
    //Metodo que elimina el segundo elemento y el penultimo elemento 
    public void elimSegElimPen()
    {
        //Validamos que haya al menos 4 elementos en la lista
        if(this.contNodos()>=4)
        {
            Proceso auxPrimero = new Proceso();
            Proceso auxUltimo = new Proceso();
            
            //Guardamos el primer elemento del auxPrimero
            auxPrimero = this.elimAlIni();
            
            //Eliminar el segundo elemento 
            this.elimAlIni();
            
            //Guardamos el ultimo elemento 
            auxUltimo=this.elimFin();
            
            //Eliminar el penultimo elemento 
            this.elimFin();
            
            //Regresamos los elementos 
            //Insertamos el primero 
            this.insAlIni(auxPrimero);
            
            //Insertamoe el ultimo 
            this.insAlFin(auxUltimo);
        }else 
            JOptionPane.showMessageDialog(null,"Se necesitan al menos 4 elementos en las listas ");
    }
    
    public void intElemP1PorElemP2(int pos1, int pos2)
    {
        //Validamos que las posiiones sean diferentes 
        if(pos1 != pos2)
        {
            //Validamos que las pos1 Exista
            if(pos1>0 && pos1<=this.contNodos())
            {
                //Validamos que la posiion 2 Exista
                 if(pos2>0 && pos2<=this.contNodos())
                 {
                     //Declaramos un proceso para guardar la posicion 1
                     Proceso auxP1= new Proceso();
                     //Declaramos un proceso para guardar la posicion 2
                     Proceso auxP2= new Proceso();
                     
                     //Declaramos una variable cont para guardar el total de elementos 
                     int cont = this.contNodos();
                     
                     //Se hace un siclo para recorrer toda la lista
                     for(int i=1; i<=cont; i++)
                     {
                         if(i==pos1)
                             auxP1=this.elimAlIni();
                         
                         else if(i==pos2)
                             auxP1=this.elimAlIni();
                         else 
                             this.insAlFin(this.elimAlIni());      
                     }
                     //Se regresan los elemntos 
                     for(int i=1; i<=cont; i++)
                     {
                         if(i==pos1)
                            this.insAlFin(auxP2);
                         
                         else if(i==pos2)
                             this.insAlFin(auxP1);
                         else 
                             this.insAlFin(this.elimAlIni());  
                     }
                 }else 
                     JOptionPane.showMessageDialog(null,"La posicion 2 no existe");
            }else 
                JOptionPane.showMessageDialog(null,"La posicion 1 no existe");
        }else 
            JOptionPane.showMessageDialog(null,"Las Posiciones deben ser diferentes");
    }
    
    public void elimPosPares()
    {
        //Validar que haya al menos dos elementos en la lista
        if(this.contNodos()>=2)
        {
            //Variable cont para almecenar el total de elentos en la lista
            int cont = this.contNodos();
            
            //Se recorre toda la lista
            for(int i=1; i<=cont;i++)
                //Si la variable i es par se elimina el elemento 
                if(i%2==0)
                    this.elimAlIni();
                else 
                    this.insAlFin(this.elimAlIni());
        }else 
            JOptionPane.showMessageDialog(null,"Se necesian al menos 2 elementos en la lista");
    }
    
    //Metodo que intercambie los elementos de las posiciones impares por pares 
    public void intPosImpPorPosPar()
    {
        if(this.contNodos()>=2)
        {
            //Se crea La lista enlazada listaPar para guardar los elementos pares 
            ListaEnlazada listaPar = new ListaEnlazada();
            
            //Se crea La lista enlazada listaImpar para guardar los elementos Impares
            ListaEnlazada listaImpar = new ListaEnlazada();
            
            //Ciclo para pasar los elementos a las listas auxiliares 
            while(!this.ListaVacia())
            {
                //Se guardan los elementos de las posiciones impares
                listaImpar.insAlFin(this.elimAlIni());
                
                /*Condicion para validar que haya elementos en la lista,
                por que si el numero total de elementos es impar siempre habra un
                elemento menos de la posicion par*/
                
                if(this.contNodos()>=1)
                {
                    //Se guardan los elementos de las posiciones pares 
                    listaPar.insAlFin(this.elimAlIni());
                }
            }
            while(!listaPar.ListaVacia())
            {
                //Condiccion para validar que haya elementos en la lista par 
                if(!listaPar.ListaVacia())
                {
                    this.insAlFin(listaPar.elimAlIni());
                }
                //Se inserta la lista origninal
                this.insAlFin(listaImpar.elimAlIni());
            }
        }else 
            JOptionPane.showMessageDialog(null,"Se necesian por lo menos 2 elementos en la lista");
    }
    
    public void RemplazarElemento(Proceso objProc, int pos)
    {
        if(pos>=1 && pos<=this.contNodos())
        {
            int Cont=this.contNodos();
            for(int i=1; i>=Cont; i++)
                if(i == pos)
                {
                    this.elimAlIni();
                    this.insAlIni(objProc);
                    this.insAlFin(this.elimAlIni());
                }else 
                    this.insAlFin(this.elimAlIni());
            
            
            
            
        }else  JOptionPane.showMessageDialog(null,"La posicion no existe");
    }
}
