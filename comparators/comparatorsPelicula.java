/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.utilidades;

import collections.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class comparatorsPelicula {

    public static Comparator<Pelicula> comparaDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p1.getDuracion(), p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> mayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> comparaTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> comparaDirector =new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1,Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

}
