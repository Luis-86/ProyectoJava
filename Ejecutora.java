/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

/**
 *
 * @author Personal
 */
public class Ejecutora {

    public static void main(String[] args) {
        //-------EJERCICIO 1 FRASES--------
        //new Mivector().ingresarFrases();

        //--------- EJERCICIO 2 FOR DINAMICO-----
        /*int resp[] = new miVector().llenarVector();
        int indice = 0;
        while (indice < resp.length) {
            indice++;
            
            System.out.print("Dato"+indice+": ");
            indice--;
            System.out.print(resp[indice]+"\n");
            //System.out.println("Dato"+indice+": "+resp[indice]);
            indice++;
        }*/
        //---------EJERCICIO 3 LISTA-------
        new MiLista().presentarMenu();
    }

}
