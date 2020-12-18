/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielreyes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class orden implements Serializable {

    int piezas_pollo;
    int numero_orden;
    ArrayList<String> tipo = new ArrayList();
    private static final long SerialVersionUID = 776L;

    public orden(int piezas_pollo, int numero_orden) {
        this.piezas_pollo = piezas_pollo;
        this.numero_orden = numero_orden;
    }

    public int getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    public int getPiezas_pollo() {
        return piezas_pollo;
    }

    public void setPiezas_pollo(int piezas_pollo) {
        this.piezas_pollo = piezas_pollo;
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return piezas_pollo + " ," + tipo;
    }



}
