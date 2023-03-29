/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1guia7;

import java.util.Scanner;

/**
 *
 * @author papa
 */
public class POOej1guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Persona primerPersona = new Persona();
        System.out.println("Ingrese nombres:");
        Persona segundaPersona = new Persona(leer.next());
        Persona tercerPersona= new Persona(leer.next());
        System.out.println("Persona 1: "+segundaPersona.nombre);
        System.out.println("Persona 2: "+tercerPersona.nombre);
    }
        
    }
    

