/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielreyes;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariel
 */
public class barra_hilo extends Thread {

    JProgressBar barra;
    JTable tabla;
    clientes cliente;
    int indice;
    ArrayList c;

    public barra_hilo(JProgressBar barra, JTable tabla, ArrayList c, int indice, clientes cliente) {
        this.barra = barra;
        this.tabla = tabla;
        this.cliente = cliente;
        this.indice = indice;
        this.c = c;

    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public ArrayList getC() {
        return c;
    }

    public void setC(ArrayList c) {
        this.c = c;
    }

    @Override
    public void run() {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        if (c.contains("papas")) {
            for (int i = 0; i < barra.getMaximum(); i++) {
                barra.setValue(i);
                try {
                    barra_hilo.sleep(100);
                } catch (Exception e) {

                }
            }
            int numero = cliente.getOrdenes().get(0).getNumero_orden();
            Object row[] = {numero, "papas", "3 minutos"};
            model.addRow(row);
            tabla.setModel(model);
            barra.setMaximum(0);

        }

        if (c.contains("Biscuits")) {
            for (int i = 0; i < barra.getMaximum(); i++) {
                barra.setValue(i);
                try {
                    barra_hilo.sleep(50);
                } catch (Exception e) {

                }
            }
            int numero = cliente.getOrdenes().get(0).getNumero_orden();
            Object row[] = {numero, "Biscuits", "1 minuto"};
            model.addRow(row);
            tabla.setModel(model);
            barra.setMaximum(0);

        }

        ///
        //
        if (c.contains("Refrescos")) {
            for (int i = 0; i < barra.getMaximum(); i++) {
                barra.setValue(i);
                try {
                    barra_hilo.sleep(40);
                } catch (Exception e) {

                }
            }
            int numero = cliente.getOrdenes().get(0).getNumero_orden();
            Object row[] = {numero, "Refrescos", "1 minuto"};
            model.addRow(row);
            tabla.setModel(model);
            barra.setMaximum(0);

        }

        if (c.contains("Pure")) {
            for (int i = 0; i < barra.getMaximum(); i++) {
                barra.setValue(i);
                try {
                    barra_hilo.sleep(48);
                } catch (Exception e) {

                }
            }
            int numero = cliente.getOrdenes().get(0).getNumero_orden();
            Object row[] = {numero, "Pure", "2 minuto"};
            model.addRow(row);
            tabla.setModel(model);
            barra.setMaximum(0);

        }
        //
        if (c.contains("Pie")) {
            for (int i = 0; i < barra.getMaximum(); i++) {
                barra.setValue(i);
                try {
                    barra_hilo.sleep(89);
                } catch (Exception e) {

                }
            }
            int numero = cliente.getOrdenes().get(0).getNumero_orden();
            Object row[] = {numero, "Pure", "5 minuto"};
            model.addRow(row);
            tabla.setModel(model);
            barra.setMaximum(0);

        }

    }

}
