/*
 
 */
package Colecciones;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class MiLista {

    Scanner lector = new Scanner(System.in);
    //Creamos nuestra lista o colecciones de tipo Persona
    List<Persona> personas = new ArrayList<>();

    public void LlenarListaInicio() {

        Persona per1 = new Persona();
        Persona per2 = new Persona();
        //llenamos datos de persona1
        per1.setApellido("Chalan");
        per1.setNombre("Luis");
        per1.setCedula("1900640630");

        //llenamos datos de persona2
        per2.setApellido("Lima");
        per2.setNombre("Ana");
        per2.setCedula("19123123");

        //Agregar Per1 y Per2 a la lista de personas
        this.personas.add(per1);
        this.personas.add(per2);
    }

    public void presentarMenu() {
        this.LlenarListaInicio();

        boolean entrada = true;

        while (entrada == true) {
            System.out.println("------Menu-------");
            System.out.println("(1)=> Nueva Persona");
            System.out.println("(2)=> Listar Persona");
            System.out.println("(3)=> Eliminar Persona");
            System.out.println("(4)=> Buscar Persona");

            int opcion = this.lector.nextInt();

            //Consumimos el espacio generado por el NextInt
            this.lector.nextLine();

            switch (opcion) {

                case 1:
                    Persona p = new Persona();
                    System.out.println("--Nueva Persona--");
                    System.out.println("Ingrese el nombre");
                    p.setNombre(this.lector.nextLine());
                    System.out.println("Ingrese el Apellido");
                    p.setApellido(this.lector.nextLine());
                    System.out.println("Ingrese la Cedula");
                    p.setCedula(this.lector.nextLine());
                    this.personas.add(p);
                    System.out.println("Persona registrada con exito");
                    break;

                case 2:
                    for (Persona persona : this.personas) {
                        System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido() + " Cedula: " + persona.getCedula());
                    }
                    break;

                case 3:
                   
                    Scanner eliminar = new Scanner(System.in);
                    System.out.println("Indique la posicion de la persona que desea eliminar");
                    int personas = eliminar.nextInt();

                    //personas=this.personas.indexOf(personas);
                     this.personas.remove(personas);
                        System.out.println("dato eliminado");
                    
                   /* if (personas != -1) {
                       

                    } else {
                        System.out.println("dato no existe");
                    }*/

                case 4:
                    Scanner buscar = new Scanner(System.in);
                    System.out.println("Indique la posicion de la persona que desea eliminar");
                    int cedula = buscar.nextInt();

                    personas=this.personas.indexOf(cedula);
                     
                        System.out.println("dato eliminado");
                    
                   /if (cedula == cedula) {
                       

                    } else {
                        System.out.println("dato no existe");
                    }*/

            }//Fin del Switch

            System.out.println("=====================");
            System.out.println("Desea continuar con otra operacion ");
            System.out.println("(1) => SI");
            System.out.println("(2) => NO");
            int opcionRepetir = this.lector.nextInt();

            if (opcionRepetir == 2) {
                entrada = false;
            }

        }

    }

}
