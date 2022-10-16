/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import collections.entidades.Alumno;
import collections.entidades.Pais;
import collections.entidades.Pelicula;
import collections.servicios.paisServicios;
import collections.servicios.peliculaServicios;
import collections.servicios.productoServicios;
import collections.servicios.serviceAlumno;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    //Ejemplos//
    /*public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String aux;
        String buscar;
        boolean log=false;
        //Iterator<String>perro=perros.iterator();

        // Bucle para ingresar perros a la lista
        do {
            System.out.println("Ingrese una raza de perro: ");
            perros.add(sc.nextLine());

            System.out.println("Desea ingresar otro perro? (s/n)");
            aux = sc.nextLine();

            while (!aux.equalsIgnoreCase("s") || !aux.equalsIgnoreCase("n")) {
                System.out.println("ERROR. Desea ingresar otro perro (s/n)?");
                aux = sc.nextLine();
            }
        } while (!aux.equalsIgnoreCase("n"));

        //System.out.println(perros);
        for(String perro : perros){
            System.out.println(perro);
        }

        System.out.println("Ingrese un perro para saber si esta");
        buscar = sc.nextLine();
        Iterator<String> itPerros = perros.iterator();
        while (itPerros.hasNext()) {
            String name=itPerros.next();
            if(name.equalsIgnoreCase(buscar)){
                itPerros.remove();
                System.out.println("Se elimino el elemento " + name);
                log=true;
            }

        }
        if(!log){
            System.out.println("No se encontro el elemento");
        }
        for(String perro : perros){
            System.out.println(perro);
        }
        

    }*/
    
    /*public static void main(String[] args) {
        String buscar;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean log = false;
        //ArrayList<Integer>notas;
        //Alumno alumnoNotas = new Alumno();
        serviceAlumno servicio = new serviceAlumno();
        ArrayList<Alumno> alumnos = servicio.crearListaAlumnos();
        servicio.mostrarLista(alumnos);

        System.out.println("Ingrese un alumno a buscar");
        buscar = sc.next();
        
        for(Alumno alumnoNotas:alumnos){
            if(buscar.equalsIgnoreCase(alumnoNotas.getNombre())){
                log=true;
                System.out.println("El promedio de notas de " + alumnoNotas.getNombre() + " es " + servicio.notaFinal(alumnoNotas));
            }
        }
        
        if (!log) {
            System.out.println("El alumno no existe en la lista");
        }
    }*/

    //eje4
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String opc = "s";
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        peliculaServicios service = new peliculaServicios();
        do {
            
            Pelicula p1 = new Pelicula();
            listaPeliculas.add(p1);
            System.out.println("Ingrese el titulo de la pelicula");
            p1.setTitulo(sc.next());
            System.out.println("Ingrese el director de la pelicula");
            p1.setDirector(sc.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p1.setDuracion(sc.nextInt());
            
            do {
                System.out.println("Desea ingresar una pelicula? s/n");
                opc = sc.next();
                System.out.println("");
                
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
            
        } while (opc.equalsIgnoreCase("s"));
        
        service.mostrarLista(listaPeliculas);
        
        System.out.println("Peliculas ordenadas de acuerdo a su duracion de mayor a menor:");
        service.mayorAMenor(listaPeliculas);
        
        System.out.println("Peliculas ordenadas de acuerdo a su duracion de menor a mayor:");
        service.menorAMayor(listaPeliculas);
        
        System.out.println("Peliculas ordenadas alfabeticamente");
        service.alfabeticamente(listaPeliculas);
        
        System.out.println("Peliculas ordenadas por director alfabeticamente");
        service.director(listaPeliculas);
    }*/
    //eje5
    /*public static void main(String[] args) {
       
        paisServicios service=new paisServicios();
        TreeSet<Pais>listaPaises=service.agregarPaises();
        service.eliminarPais(listaPaises);
        
    }*/
    //eje6
    public static void main(String[] args) {
        int opc;
        boolean salir=false;
        Scanner sc=new Scanner(System.in);
        productoServicios service=new productoServicios();
        
        HashMap<String,Double>Productos = service.crearMap();
        
        do{
        System.out.println("Ingrese una opcion: ");
        System.out.println(" 1.Agregar un producto");
        System.out.println(" 2.Eliminar un producto");
        System.out.println(" 3.Modificar precio de un producto");
        System.out.println(" 4.Mostrar productos");
        System.out.println(" 5.Salir");
        opc=sc.nextInt();
        switch(opc){
            case 1:
                service.agregarProducto(Productos);
                break;
            case 2:
                service.eliminarProducto(Productos);
                break;
            case 3:
                service.cambiarPrecio(Productos);
                break;
            case 4:
                service.mostrarProductos(Productos);
                break;
            case 5:
                salir=true;
                break;
                default:
                    System.out.println("Opcion invalida");
        }
        }while(!salir);
        
    }
        
}




/*
/*Iterator<Alumno> itAlumnos = alumnos.iterator();
        while (itAlumnos.hasNext()) {
            alumnoNotas = itAlumnos.next();
            if (alumnoNotas.getNombre().equalsIgnoreCase(buscar)) {
                log = true;

                System.out.println("El promedio de notas de " + alumnoNotas.getNombre() + " es " + servicio.notaFinal(alumnoNotas));
            }
        }

do{
        System.out.println("Ingrese una opcion: ");
        System.out.println(" 1.Agregar un producto");
        System.out.println(" 2.Eliminar un producto");
        System.out.println(" 3.Modificar precio de un producto");
        System.out.println(" 4.Mostrar productos");
        System.out.println(" 5.Salir");
        opc=sc.nextInt();
        switch(opc){
            case 1:
                service.agregarProducto(Productos);
                break;
            case 2:
                service.eliminarProducto(Productos);
                break;
            case 3:
                service.cambiarPrecio(Productos);
                break;
            case 4:
                service.mostrarProductos(Productos);
                break;
            case 5:
                salir=true;
                break;
                default:
                    System.out.println("Opcion invalida");
        }
        }while(!salir);
        
    }

*/

