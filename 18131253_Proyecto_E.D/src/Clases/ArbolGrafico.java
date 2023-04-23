/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author adria
 */
public class ArbolGrafico extends JPanel 
 {
    private Arbol miArbolito;
    private HashMap PosicionNodos = null;
    private HashMap SubtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0,0);
    private FontMetrics fm = null;
    
    public ArbolGrafico(Arbol miArbol) 
    {
          this.miArbolito = miArbol;
          this.setBackground(Color.WHITE);
          PosicionNodos = new HashMap();
          SubtreeSizes = new HashMap();
          dirty = true;
          repaint();      
    }
    
     
    private Dimension calcularTamañoSubarbol(ArbolNodo n) 
    {
          if (n == null) 
              return new Dimension(0,0);
 
          Dimension ld = calcularTamañoSubarbol(n.getIzquierdo());
          Dimension rd = calcularTamañoSubarbol(n.getDerecho());
          
          int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
          int w = ld.width + child2child + rd.width;
          
          Dimension d = new Dimension(w, h);
          SubtreeSizes.put(n, d);
          
          return d;
    }
    
     private void calcularPosicion(ArbolNodo n, int left, int right, int top) 
    {
      if (n == null) 
          return;
      
      Dimension ld = (Dimension) SubtreeSizes.get(n.getIzquierdo());
      if (ld == null) 
          ld = empty;
      
      Dimension rd = (Dimension) SubtreeSizes.get(n.getDerecho());
      if (rd == null) 
          rd = empty;
      
      int center = 0;
      
      if (right != Integer.MAX_VALUE)
          center = right - rd.width - child2child/2;
      else if (left != Integer.MAX_VALUE)
          center = left + ld.width + child2child/2;
      int width = fm.stringWidth(n.getDato()+"");
 
      PosicionNodos.put(n,new Rectangle(center - width/2 - 3, top, width + 6, fm.getHeight()));
      
      calcularPosicion(n.getIzquierdo(), Integer.MAX_VALUE, center - child2child/2, top + fm.getHeight() + parent2child);
      calcularPosicion(n.getDerecho(), center + child2child/2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);
    }
    
    private void calcularPosiciones() 
    {
         PosicionNodos.clear();
         SubtreeSizes.clear();
         ArbolNodo root = this.miArbolito.getRaiz();
         if (root != null) 
         {
             calcularTamañoSubarbol(root);
             calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
         }
    }
   
    private void dibujarArbol(Graphics2D g, ArbolNodo n, int puntox, int puntoy, int yoffs) 
    {
     if (n == null) 
         return;
     
     Rectangle r = (Rectangle) PosicionNodos.get(n);
     g.draw(r);
     g.drawString(n.getDato()+"", r.x + 3, r.y + yoffs);
   
     if (puntox != Integer.MAX_VALUE)
       
     g.drawLine(puntox, puntoy, (int)(r.x + r.width/2), r.y);
     
     dibujarArbol(g, n.getIzquierdo(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     dibujarArbol(g, n.getDerecho(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     
   }
        
    @Override
   public void paint(Graphics g) 
   {
         super.paint(g);
         fm = g.getFontMetrics();

         if (dirty) 
         {
           calcularPosiciones();
           dirty = false;
         }
         
         Graphics2D g2d = (Graphics2D) g;
         g2d.translate(getWidth() / 2, parent2child);
         dibujarArbol(g2d, this.miArbolito.getRaiz(), Integer.MAX_VALUE, Integer.MAX_VALUE, 
                  fm.getLeading() + fm.getAscent());
         fm = null;
   }
}
