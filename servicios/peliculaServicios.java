/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.servicios;

import collections.entidades.Pelicula;
import collections.utilidades.comparatorsPelicula;
import static collections.utilidades.comparatorsPelicula.comparaDirector;
import static collections.utilidades.comparatorsPelicula.comparaDuracion;
import static collections.utilidades.comparatorsPelicula.comparaTitulo;
import static collections.utilidades.comparatorsPelicula.mayorMenor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class peliculaServicios {
    
    private final Scanner sc;
    public peliculaServicios(){
        this.sc=new Scanner(System.in).useDelimiter("\n");
    }
    /*public Pelicula crearPelicula(){
        System.out.println("Ingrese el nombre de la pelicula");
        
    }*/
    
    public void mostrarLista(ArrayList<Pelicula> listaPeliculas){
        for(Pelicula aux:listaPeliculas){
            System.out.println(aux.toString());
        }
        
    }
    
    public void mayorAMenor(ArrayList<Pelicula> listaPeliculas){
        
        listaPeliculas.sort(mayorMenor);
        mostrarLista(listaPeliculas);
    }
    
    public void menorAMayor(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(comparaDuracion);
        
        mostrarLista(listaPeliculas);
    }
    
    public void alfabeticamente(ArrayList<Pelicula>listaPeliculas){
        listaPeliculas.sort(comparaTitulo);
        mostrarLista(listaPeliculas);
    }
    
    public void director(ArrayList<Pelicula>listaPeliculas){
        listaPeliculas.sort(comparaDirector);
        mostrarLista(listaPeliculas);
    }

}
