/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.servicios;

import collections.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class serviceAlumno {

    private final Scanner sc;

    public serviceAlumno() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public ArrayList<Alumno> crearListaAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String opc = "s";
        do {
            Alumno a1 = crearAlumno();
            alumnos.add(a1);
            do {
                System.out.println("¿Desea ingresar otro alumno? (s/n)");
                opc = sc.next();
                System.out.println(" ");
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));

        } while (opc.equalsIgnoreCase("s"));
        return alumnos;
    }

    public Alumno crearAlumno() {
        Integer in;
        Alumno alumno = new Alumno();
        ArrayList<Integer> nota = new ArrayList<>();
        
        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(sc.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del alumno " + alumno.getNombre());
            in = sc.nextInt();
            while (in < 1 || in > 10) {
                System.out.println("Error la nota debe estar entre 1 y 10. Ingrese la nota " + (i + 1) + " del alumno " + alumno.getNombre());
                in = sc.nextInt();
            }
            if (in >= 1 && in <= 10) {
                nota.add(in);
                alumno.setNotas(nota);
            }

        }
        return alumno;
    }

    public void mostrarLista(ArrayList<Alumno> alumnos) {
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
    }

    public double notaFinal(Alumno alumno) {
        ArrayList<Integer> notas = alumno.getNotas();

        double suma = 0, promedio;
        for (Integer nota : notas) {
            suma += nota;
        }
        return promedio = suma / notas.size();
    }
    
    

}
