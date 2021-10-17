/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class miVector {

    Scanner lector = new Scanner(System.in);

    public void IngresarFrases() {

        //Creando el vector de tamaño estatico
        String frases[] = new String[4];

        for (int i = 0; i < frases.length; i++) {
            System.out.println("Ingrese la frase: " + 1);
            frases[i] = lector.nextLine();

        }

        //Imprimir valores del vector mediante FOR-EACH
        for (String dato : frases) {
            System.out.println("-----------------------");
            System.out.println("Frase: " + dato);
            System.out.println("Num. caracteres: " + dato.length());
            System.out.println("Primer caracter : " + dato.charAt(0));
            System.out.println("Ultimo caracter: " + dato.charAt(dato.length() - 1));

        }

    }

    public int[] llenarVector() {

        System.out.println("Ingrese el limite del vector");
        int limite = this.lector.nextInt();

        //creando vector con limite dinamico establecido por el usuario
        int vector[] = new int[limite];

        //llenamos el vector con los datos ingresados por el usuario
        for (int i = 0; i < vector.length; i++) {
            i++;
            System.out.println("Ingrese el dato de la posicion: " + i);
            i--;
            vector[i] = this.lector.nextInt();
        }
        return vector;
    }

}

