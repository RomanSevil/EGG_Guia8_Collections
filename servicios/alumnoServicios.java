/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_extra.servicios;

import static collections_extra.utilidades.comparartorAlumno.comparaApellido;
import static collections_extra.utilidades.comparartorAlumno.comparaNombre;
import entidades.Alumno;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class alumnoServicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearLista() {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan", "Perez", "Argentina", new Date(2000 - 1900, 4 - 1, 15)));
        alumnos.add(new Alumno("Mariano", "Perez", "Argentina", new Date(1997 - 1900, 9 - 1, 6)));
        alumnos.add(new Alumno("Pedro", "Gonzalez", "Chilena", new Date(2001 - 1900, 4 - 1, 25)));
        alumnos.add(new Alumno("Gustavo", "Rivera", "Argentina", new Date(2004 - 1900, 6 - 1, 5)));
        alumnos.add(new Alumno("Juan", "Lozano", "Venezolana", new Date(2001 - 1900, 2 - 1, 16)));
        alumnos.add(new Alumno("Esteban", "Gimenez", "Argentina", new Date(1986 - 1900, 10 - 1, 2)));
        alumnos.add(new Alumno("Fernando", "Cruz", "Chilena", new Date(2001 - 1900, 4 - 1, 29)));
        alumnos.add(new Alumno("Edgardo", "Pozo", "Chilena", new Date(1998 - 1900, 6 - 1, 30)));
        alumnos.add(new Alumno("Alberto", "Gutierrez", "Venezolana", new Date(1993 - 1900, 5 - 1, 1)));
        alumnos.add(new Alumno("Francisco", "Villa", "Chilena", new Date(2000 - 1900, 4 - 1, 31)));
        alumnos.add(new Alumno("Martin", "Sedron", "Chilena", new Date(1994 - 1900, 8 - 1, 9)));
        alumnos.add(new Alumno("Fernando", "Lopez", "Venezolana", new Date(2009 - 1900, 4 - 1, 9)));
        alumnos.add(new Alumno("Nicolas", "Martinez", "Argentina", new Date(2000 - 1900, 6 - 1, 3)));
        alumnos.add(new Alumno("Isaias", "Zapata", "Chilena", new Date(1997 - 1900, 8 - 1, 31)));
        alumnos.add(new Alumno("Sergio", "Sanchez", "Argentina", new Date(2003 - 1900, 5 - 1, 15)));
        alumnos.add(new Alumno("Marcelo", "Pereyra", "Argentina", new Date(2001 - 1900, 2 - 1, 13)));
        alumnos.add(new Alumno("Gonzalo", "Moreno", "Chilena", new Date(2001 - 1900, 10 - 1, 3)));
        alumnos.add(new Alumno("Fernando", "Pardo", "Venezolana", new Date(2001 - 1900, 12 - 1, 4)));
        alumnos.add(new Alumno("Roman", "Sevil", "Argentina", new Date(2001 - 1900, 11 - 1, 19)));
        alumnos.add(new Alumno("Luis", "Ambrosini", "Argentina", new Date(2001 - 1900, 5 - 1, 26)));

        /*
        String nombre, apellido, nac;
        int dia, mes, anio;
 int n;
        System.out.println("Ingrese la cantidad de alumnos");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            nombre = sc.next();
            System.out.println("Ingrese el apellido del alumno " + (i + 1));
            apellido = sc.next();
        
            System.out.println("Ingrese la nacionalidad del alumno " + nombre + " " + apellido);
            nac = sc.next();
            while(!(nac.equalsIgnoreCase("Argentina") || nac.equalsIgnoreCase("Venezolana") || nac.equalsIgnoreCase("Chilena"))){
                System.out.println("Nacionalidad invalida. Ingrese una nacionalidad valida");
                nac=sc.next();
            }

            System.out.println("Ingrese el dia de nacimiento de " + nombre);
            dia = sc.nextInt();

            System.out.println("Ingrese el mes de nacimiento de " + nombre);
            mes = sc.nextInt();

            System.out.println("Ingrese el año de nacimiento de " + nombre);
            anio = sc.nextInt();
            Date fecha=new Date(anio-1900,mes-1,dia);
            System.out.println(fecha);
            
            alumnos.add(new Alumno(nombre, apellido, nac, fecha));   
        }
         */
        return alumnos;

        //Alumno a1=crearAlumno();
        //alumnos.add(a1);
    }

    public void imprimirLista(ArrayList<Alumno> lista) {
        for (Alumno aux : lista) {
            System.out.println(aux.toString());
        }
        System.out.println(" ");
    }

    public void ordenApellido(ArrayList<Alumno> lista) {
        lista.sort(comparaApellido);
        System.out.println("Lista ordenada por apellidos");
        imprimirLista(lista);
    }

    public void ordenDescNombre(ArrayList<Alumno> lista) {
        lista.sort(comparaNombre);
        System.out.println("Lista ordenada por nombres en forma descendente");
        imprimirLista(lista);
    }

    public void mostrarEdad(ArrayList<Alumno> lista) {
        String nom, ape;
        boolean encontro = false;
        int edad = 0;
        Date hoy = new Date();
        System.out.println("Ingrese el nombre del alumno a buscar ");
        nom = sc.next();
        System.out.println("Ingrese el apellido del alumno a buscar ");
        ape = sc.next();
        for (Alumno cada : lista) {
            if (nom.equalsIgnoreCase(cada.getNombre()) && ape.equalsIgnoreCase(cada.getApellido())) {
                encontro = true;
                edad = ((int) ((hoy.getTime() - cada.getFechaNacimiento().getTime()) / 86400000)) / 365;
            }
        }
        if (encontro) {
            System.out.println(nom + " " + ape + " tiene " + edad + " años");
        } else {
            System.out.println(" Alumno no encontrado");
        }
    }

    public void informeFinal(ArrayList<Alumno> lista) {
        ArrayList<Alumno> argentinos = new ArrayList<>();
        ArrayList<Alumno> chilenos = new ArrayList<>();
        ArrayList<Alumno> venezolanos = new ArrayList<>();
        for (Alumno cada : lista) {
            if (cada.getNacionalidad().equalsIgnoreCase("Argentina")) {
                argentinos.add(cada);
            } else if (cada.getNacionalidad().equalsIgnoreCase("Chilena")) {
                chilenos.add(cada);
            } else if (cada.getNacionalidad().equalsIgnoreCase("Venezolana")) {
                venezolanos.add(cada);
            }
        }

        System.out.println("Alumnos argentinos ");
        imprimirLista(argentinos);
        System.out.println(" ");
        System.out.println("Alumnos chilenos ");
        imprimirLista(chilenos);
        System.out.println(" ");
        System.out.println("Alumnos venezolanos ");
        imprimirLista(venezolanos);
        System.out.println(" ");

        int k = 0;
        int edad = 0;
        Date hoy = new Date();
        for (Alumno cada : lista) {
            edad = ((int) ((hoy.getTime() - cada.getFechaNacimiento().getTime()) / 86400000)) / 365;
            if (edad >= 25) {
                k++;
            }
        }
        System.out.println("Hay " + k + " alumnos mayores a 25 años ");
        System.out.println(" ");

        int L = 0;
        int P = 0;
        for (Alumno cada : lista) {
            if (cada.getApellido().substring(0, 1).equalsIgnoreCase("l")) {
                L++;
            } else if (cada.getApellido().substring(0, 1).equalsIgnoreCase("p")) {
                P++;
            }
        }

        System.out.println(" Hay " + L + " alumnos con apellido que comienza con L ");
        System.out.println(" Hay " + P + " alumnos con apellido que comienza con P ");

        System.out.println("Hay " + argentinos.size() + " alumnos argentinos");
        System.out.println("Hay " + chilenos.size() + " alumnos chilenos");
        System.out.println("Hay " + venezolanos.size() + " alumnos venezolanos");
    }

}


/*
do{
                opc=sc.next();
            }while(!(opc.equalsIgnoreCase("s")|| opc.equalsIgnoreCase("n")));
        }while(opc.equalsIgnoreCase("s"));

Random generate = new Random();
       String[] name = {"John", "Marcus", "Susan", "Henry"};

       System.out.println("Customer: " + name[generate.nextInt(4)]);



 */
