/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

/**
 *
 * @author Usuario
 */
public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleados(ArrayList<Empleado> dato ){
        //aquí el codigo para grabar el disco duro
        
    }
    
    public ArrayList<Empleado> leerEmpleado(){
        ArrayList<Empleado> tmp=null;
        
        //Leer del disco duro
        //Se sube al ArrayList tmp
        
        return tmp;
    } 
        
        
        
    
    
}
