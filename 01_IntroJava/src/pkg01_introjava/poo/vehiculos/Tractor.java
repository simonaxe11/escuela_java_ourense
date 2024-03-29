/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.vehiculos;


/**
 *
 * @author PC
 */
public abstract class Tractor extends Vehiculo {

    public Tractor() {
        super();
        tipo = TipoVehiculo.TRACTOR;
    }
    
    @Override
    public void mostrarEstado(){
        System.out.println(tipo);
    }
    
    @Override
    public void avanzar() {
        System.out.println("Ruedo y siego");
    }

    @Override
    public String toString() {
        return "Tractor{" + '}';
    }
    
    public void mover(float m){
        avanzar();
        System.out.println(m + " metros");
    }
}
