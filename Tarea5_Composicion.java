/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5_composicion;

import ico.fes.base.Computadora;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Usuario
 */
public class Tarea5_Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora comp1 = new Computadora();
        comp1.setMarca("HP");
        comp1.setModelo("All-in-One 22-df0547la");
        comp1.setMonitor(new Monitor("HP", "N246V", (int) 23.8));
        comp1.setMouse(new Mouse("HP", "Z3700", "inalámbrico"));
        comp1.setTeclado(new Teclado("HP", "3ML04AA", 111, 3));
        comp1.setCpu(new CPU("HP", "280 G5", (int) 3.6));
        
        System.out.println(comp1);
        
        
        comp1.getMouse().setModelo("250 Wireless");
        comp1.getMonitor().setModelo("PV24V");
        System.out.println(comp1);
        
    }
    
}
