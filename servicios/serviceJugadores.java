/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceJugadores;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class serviceJugadores {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> jugadores = new HashSet<>();
    HashSet<String> jugadores2 = new HashSet<>();

    public void llenarConjunto() {
        Random generate = new Random();
        String name[] = {"Dembele", "Sergi Roberto", "Ter Stegen", "Jordi Alba", "Ansu Fati", "De Jong", "Lewandowski", "Aubameyang", "Depay", "Torres", "Pedri", "Rapinha", "Koundé", "Baldé", "Garcia", "Christensen", "Iñaki Peña", "Kessie", "Marcos Alonso", "Gavi"};

        for (int i = 0; i < name.length; i++) {
            String r = name[generate.nextInt(name.length)];
            jugadores.add(r);
        }

        jugadores2.add("Piqué");
        jugadores2.add("Busquets");

        /*jugadores2.add("Pedri");
        jugadores2.add("Dembele");
        jugadores2.add("Lewandowski");*/
    }

    public void imprimir() {
        for (String jugador : jugadores) {
            System.out.print(jugador + " ");
        }
        System.out.println(" ");
    }

    public void consultarJugador() {
        System.out.println("Ingrese un jugador a buscar ");
        String buscar = sc.next();
        boolean estaba = false;
        for (String jugador : jugadores) {
            if (jugador.equalsIgnoreCase(buscar)) {
                estaba = true;
            }
        }
        if (estaba) {
            System.out.println("El jugador " + buscar + " existe ");
        } else {
            System.out.println("El jugador " + buscar + " no existe ");
        }
        int k = 0;
        for (String jugador : jugadores2) {
            if (jugadores.contains(jugador)) {
                k++;
            }
        }
        if (k == jugadores2.size()) {
            System.out.println(" Todos los elementos de jugadores 2 estan en jugadores");
        } else {
            System.out.println("Faltan elementos");
        }
    }

    public void vaciarLista() {

        jugadores.addAll(jugadores2);
        jugadores2.clear();

        System.out.println("Numero de jugadores de jugadores2: " + jugadores2.size());

        for (String jugador : jugadores) {
            System.out.print(jugador + " ");
        }
        System.out.println(" ");
    }
}
