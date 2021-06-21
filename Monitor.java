/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Usuario
 */
public class Monitor {
    private String marca;
    private String modelo;
    private int pulgada;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, int pulgada) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", modelo=" + modelo + ", pulgada=" + pulgada + '}';
    }
    
    
    
}
