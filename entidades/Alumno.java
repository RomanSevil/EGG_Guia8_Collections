/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.entidades;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Alumno {
    
    String nombre;
    ArrayList<Integer> notas;
    
    public Alumno(){
        
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    @Override
    public String toString(){
        return nombre+ ":"+"\t"+notas;
    }
    
}
