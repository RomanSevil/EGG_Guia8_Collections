/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Ficha;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class fichaServicios {

    private Scanner sc = new Scanner(System.in);
    LinkedList<Ficha> fichas = new LinkedList<>();
    LinkedList<Ficha> juego = new LinkedList<>();

    public void generarFichas() {

        int max;

        int v1 = 0, v2 = 0;
        String x1, x2;
        System.out.println("Ingrese el doble mas grande");
        max = sc.nextInt();

        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                v1 = i;
                v2 = j;
                x1 = Integer.toString(v1);
                x2 = Integer.toString(v2);
                fichas.add(new Ficha(x1, x2));
            }
        }
        juego.add(new Ficha(Integer.toString(max), Integer.toString(max)));
        //imprimirFichas();

    }

    public void imprimirFichas() {
        for (Ficha cada : fichas) {
            System.out.print(cada);
        }
    }

    public void juego() {
        
        System.out.println(" ");
        
        int i = 0;
        do {
            int mano=fichas.size();
            int mesa=juego.size();

            System.out.println("Mesa " +mesa);
            for (Ficha ficha2 : juego) {
                System.out.print(ficha2);
            }
            System.out.println(" ");

            System.out.println("Mano " + mano);
            for (Ficha ficha : fichas) {
                System.out.print(ficha);
            }
            System.out.println(" ");

            for (Ficha ficha : fichas) {
                if (ficha.getV2().equals(juego.getFirst().getV1())) {
                    juego.addFirst(ficha);
                    fichas.remove(ficha);

                    break;
                    
                }

            }
            i++;
        } while (i == 100 || !fichas.isEmpty());
        

    }
}
/*
        Ficha primeraficha=new Ficha();
        ArrayList<Ficha>juego=new ArrayList<>();
        
        for(Ficha ficha:fichas){
            if(ficha.esUnDoble(ficha)){
                
            }
        }
/*for(Ficha ficha2:juego){
                    System.out.print(ficha2);
                }
        System.out.println("\n");
        System.out.println("Mano ");
        for(Ficha ficha:fichas){
            System.out.print(ficha);
        }
*/

 
