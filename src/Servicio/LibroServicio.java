/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author papa
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro cargarDatos(){
        Libro lb = new Libro();
        System.out.print("Ingrese ISBN: ");
        lb.setISBN(leer.next());
        System.out.print("Ingrese título: ");
        lb.setTitulo(leer.next());
        System.out.print("Ingrese autor: ");
        lb.setAutor(leer.next());
        System.out.print("Ingrese números de páginas: ");
        lb.setNumPage(leer.nextInt());
        return lb;
    }
    
    public static void mostrarDatos(Libro l1){
        System.out.println("DATOS DEL LIBRO");
        System.out.println("ISBN: "+l1.getISBN());
        System.out.println("Titulo: "+l1.getTitulo());
        System.out.println("Autor: "+l1.getAutor());
        System.out.println("Número de Página: "+l1.getNumPage());
    }
   
       
        
    }

