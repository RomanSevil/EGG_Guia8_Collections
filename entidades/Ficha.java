/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author usuario
 */
public class Ficha {
    
    //private ArrayList<Integer>valor;
    private String v1;
    private String v2;

    public Ficha() {
    }

    public Ficha(String v1, String v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }
    
    public Ficha girarFicha(Ficha invertida){
        String aux=v1;
        v1=v2;
        v2=aux;
        invertida.setV1(v1);
        invertida.setV2(v2);
        return invertida;
    }
    
    public boolean esUnDoble(Ficha ficha){
        boolean doble=false;
        if(v1.equals(v2)){
            doble=true;
        }
        return doble;
    }

    @Override
    public String toString() {
        return   v1 + ":" + v2 + "|";
    }

    

   
    

}
