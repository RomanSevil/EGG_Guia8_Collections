/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra_ej3;

import serviceJugadores.serviceJugadores;

/**
 *
 * @author usuario
 */
public class Guia8Extra_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviceJugadores servicio=new serviceJugadores();
        servicio.llenarConjunto();
        servicio.imprimir();
        servicio.consultarJugador();
        servicio.vaciarLista();
    }
    
}
