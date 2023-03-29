/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej1;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author papa
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.cargarDatos();
        LibroServicio.mostrarDatos(l1);
        
        Libro l2 = ls.cargarDatos();
        LibroServicio.mostrarDatos(l2);


      
    }
    
}
