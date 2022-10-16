/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.servicios;

import collections.entidades.Pais;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class paisServicios {
    private final Scanner sc;
    public paisServicios(){
        this.sc=new Scanner(System.in).useDelimiter("\n");
        
    }
    
    public TreeSet<Pais>agregarPaises(){
        TreeSet<Pais> paises=new TreeSet();
        String opc="s";
        do{
            Pais p1=crearPais();
            paises.add(p1);
            
            System.out.println("Desea ingresar otro pais?");
            opc=sc.next();
            
            while(!(opc.equalsIgnoreCase("s")|| opc.equalsIgnoreCase("n"))){
                System.out.println("Opcion invalida. Desea ingresar otro pais?");
                opc=sc.next();
                System.out.println(" ");
            }
            
        }while(!opc.equalsIgnoreCase("n"));
        
        imprimirLista(paises);
        return paises;
    }
    
    public Pais crearPais(){
        Pais pais=new Pais();
        System.out.println("Ingrese el nombre del pais");
        pais.setNombre(sc.next());
        return pais;
    }
    
    public void imprimirLista(TreeSet<Pais> paises){
        for(Pais aux:paises){
            System.out.println(aux.toString());
        }
    }
    
    public void eliminarPais(TreeSet<Pais> paises){
        String buscar;
        boolean log=false;
        Pais p1=new Pais();
        System.out.println("Ingrese un pais para eliminar");
        buscar=sc.next();
        Iterator<Pais>itPaises=paises.iterator();
        while(itPaises.hasNext()){
            
            p1=itPaises.next();
            if(p1.getNombre().equalsIgnoreCase(buscar)){
                log=true;
                itPaises.remove();
            }
        }
        if(!log){
            System.out.println("No se encontro el pais");
        }else{
            System.out.println("Lista sin " + buscar);
            imprimirLista(paises);
        }
    }
}
