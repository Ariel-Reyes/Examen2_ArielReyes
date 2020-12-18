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
public class admi_orden {

    ArrayList<orden> lista_orden = new ArrayList();
    File archivo = null;

    public ArrayList<orden> getLista_pelicula() {
        return lista_orden;
    }

    public admi_orden(String path) {
        archivo = new File(path);
    }

    public void setLista_pelicula(ArrayList<orden> lista_orden) {
        this.lista_orden = lista_orden;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    // Mutador extra

    public void setPelicula(orden t) {
        this.lista_orden.add(t);
    }

    public void cargarArchivo() {
        try {
            lista_orden = new ArrayList();
            orden temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (orden) objeto.readObject()) != null) {
                        lista_orden.add(temp);
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
            for (orden t : lista_orden) {
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
