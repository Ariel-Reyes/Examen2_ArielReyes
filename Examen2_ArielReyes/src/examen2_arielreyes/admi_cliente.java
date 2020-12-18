/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class admi_cliente {

    ArrayList<clientes> lista_cliente = new ArrayList();
    File archivo = null;

    public ArrayList<clientes> getLista_cliente() {
        return lista_cliente;
    }

    public admi_cliente(String path) {
        archivo = new File(path);
    }

    public void setLista_cliente(ArrayList<clientes> lista_cliente) {
        this.lista_cliente = lista_cliente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    // Mutador extra

    public void setPelicula(clientes t) {
        this.lista_cliente.add(t);
    }

    public void cargarArchivo() {
        try {
            lista_cliente = new ArrayList();
            clientes temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (clientes) objeto.readObject()) != null) {
                        lista_cliente.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (clientes t : lista_cliente) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
