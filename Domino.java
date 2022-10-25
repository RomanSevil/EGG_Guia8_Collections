/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import servicios.fichaServicios;

/**
 *
 * @author usuario
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fichaServicios service= new fichaServicios();
        service.generarFichas();
        service.juego();
    }
    
}
