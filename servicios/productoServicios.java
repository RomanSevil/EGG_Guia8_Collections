/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.servicios;

import collections.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class productoServicios {

    private final Scanner sc;

    public productoServicios() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public HashMap<String, Double> crearMap() {
        HashMap<String, Double> Productos = new HashMap();
        String opc = "s";
        String nombre;
        Double precio;
        
        do {
            System.out.println("Ingrese el nombre del producto ");
            nombre = sc.next();
            System.out.println("Ingrese el precio del producto ");
            precio = sc.nextDouble();
            
            Productos.put(nombre, precio);
            
            System.out.println("Desea ingresar otro producto?");
            opc=sc.next();
            
            while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n"))) {
                System.out.println("Opcion invalida, ¿Desea ingresar un producto? (s/n)");
                opc = sc.next();
            }

        } while (!opc.equalsIgnoreCase("n"));
        mostrarProductos(Productos);
        return Productos;
    }
    
    
    public void mostrarProductos(HashMap<String,Double>Productos){
        for (Map.Entry<String, Double> entry : Productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + "\t" + " Precio: " + value);
        }
    }
    
    public void cambiarPrecio(HashMap<String,Double>Productos){
        boolean estaba=false;
        String buscar;
        Double nuevoPrecio;
        System.out.println("Ingrese un producto para modificar su precio ");
        buscar=sc.next();
        for (Map.Entry<String, Double> entry : Productos.entrySet()) {
            String nombre = entry.getKey();
            Double precio = entry.getValue();
            if(nombre.equalsIgnoreCase(buscar)){
                estaba=true;
                System.out.println("Ingrese el nuevo precio de " + nombre);
                nuevoPrecio=sc.nextDouble();
                precio=entry.setValue(nuevoPrecio);
            }
        }
        if(estaba){
        System.out.println("Lista actualizada ");
        mostrarProductos(Productos);
        }else{
            System.out.println("El producto " + buscar +" no existe");
        }
    }
    
    public void agregarProducto(HashMap<String,Double>Productos){
        String agregar;
        Double precio;
        System.out.println("Ingrese un producto a agregar ");
        agregar=sc.next();
        System.out.println("Ingrese el precio de " + agregar);
        precio=sc.nextDouble();
        Productos.put(agregar, precio);
        System.out.println("Lista actualizada ");
        mostrarProductos(Productos);
    }
    
    public void eliminarProducto(HashMap<String,Double>Productos){
        String eliminar;
        boolean estaba=false;
        System.out.println("Ingrese un producto a eliminar");
        eliminar=sc.next();
        
        for (Map.Entry<String, Double> aux : Productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if(key.equalsIgnoreCase(eliminar)){
                estaba=true;
                Productos.remove(eliminar);
                break;
            }
        }
        if(estaba){
            System.out.println("Se elimino " + eliminar);
            System.out.println("Lista actualizada");
            mostrarProductos(Productos);
            
        }else{
            System.out.println("El producto " + eliminar + " no existe");
        }
    }
}
/*

for (Map.Entry<String, Double> entry : Productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("key " + key + " value " + value);
        }

for(String nombre:Productos.keySet()){
            if(nombre.equalsIgnoreCase(buscar)){
                precio=Productos.values();
            }
        }

 */
