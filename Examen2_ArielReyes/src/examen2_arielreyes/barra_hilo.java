/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielreyes;

import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author Ariel
 */
public class barra_hilo extends Thread {
    
    
    JProgressBar barra; 
    JTable tabla; 
    clientes cliente; 

    public barra_hilo(JProgressBar barra, JTable tabla, clientes cliente) {
        this.barra = barra;
        this.tabla = tabla;
        this.cliente = cliente;
    }

    
    
   @Override 
   public void run(){
       
       
       
       
       
   }
    
    
}
