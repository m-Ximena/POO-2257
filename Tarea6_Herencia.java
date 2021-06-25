/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_herencia;

import ico.fes.herencia.Alumno;

/**
 *
 * @author Usuario
 */
public class Tarea6_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Alumno alu1 = new Alumno("318924781", "ICO", 2, "Luis Alberto", 19, 1, 1.75f);
        
        System.out.println("Nombre: "+alu1.getNombre());
        System.out.println("Edad: "+alu1.getEdad());
        System.out.println("Genero: "+alu1.getGenero());
        System.out.println("Altura: "+alu1.getAltura());
        System.out.println("Numero de cuenta: "+alu1.getNumeroCuenta());
        System.out.println("Carrera: "+alu1.getCarrera());
        System.out.println("Semestre: "+alu1.getSemestre());
    }
    
}
