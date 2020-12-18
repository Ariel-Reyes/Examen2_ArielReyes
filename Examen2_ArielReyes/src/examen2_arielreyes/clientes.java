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
public class clientes implements Serializable {

    String nombre_cliente; // se serializan estas clases 
    ArrayList<orden> ordenes = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public clientes(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public ArrayList<orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<orden> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return nombre_cliente;
    }

}
