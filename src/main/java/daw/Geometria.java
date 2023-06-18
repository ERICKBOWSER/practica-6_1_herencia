/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author guerig
 */
public class Geometria {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Conversión implicita
        Figura tri1 = new Triángulo(8, 5, 3, "6", "Negro");
        Figura tri2 = new Triángulo(6, 10, 3, "2", "Verde");
        
        // Conversión implicita
        Figura rect1 = new Rectangulo(9, 4, 4, "3", "Rojo");
        Figura rect2 = new Rectangulo(10,4, 4, "4", "Amarillo");
        
        // Conversión implicita
        Figura cir1 = new Circulo(5, "5", "Naranja");
        Figura cir2 = new Circulo(15, "1", "Blanco");
        
//        Set<Figura> figuras = new HashSet();
//        
//        figuras.add(new Triángulo(8, 5, 3, "6", "Negro"));
//        figuras.add(new Triángulo(6, 10, 3, "2", "Verde"));
//        
//        figuras.add(new Rectangulo(7, 2, 3, "10", "morado"));
//        figuras.add(new Rectangulo(10,4, 4, "4", "Amarillo"));
//                

        // Creamos una lista de tipo figura para almacenar todos los tipos de figura
        List<Figura> listaFiguras = new ArrayList();
        
        listaFiguras.add(tri1);
        listaFiguras.add(tri2);
        listaFiguras.add(rect1);
        listaFiguras.add(rect2);
        listaFiguras.add(cir1);
        listaFiguras.add(cir2);
        
        for (Figura listaFigura : listaFiguras) {
            System.out.println(listaFigura);           
            
            System.out.println("Area: " + listaFigura.area());
            System.out.println();
        }
        
//        // Creamos un rectangulo para poder dibujarlo
//        Rectangulo r = new Rectangulo(9, 5, 4, "3", "Rojo");
//        
//        System.out.println("Dibujar: ");
//        r.dibujar();
        
        // Ordenamos la lista y haciendo uso de Comparator y su método comparing ordenamos la lista
        Collections.sort(listaFiguras, Comparator
                .comparing(Figura :: getColor)
                .thenComparing(Figura::getId) // para que si hay dos datos iguales se resuelva por esta comparación
                );
        
        System.out.println("\nLista ordenada por color");
        for (Figura lista : listaFiguras) {
            System.out.println(lista);
        }        
        
//        System.out.println("Introduce el id de una figura: ");
//        String buscar = teclado.nextLine();
        
        // Dibujar el rectangulo
        System.out.println("Dibujar rectangulos: ");
        for (Figura listaFigura : listaFiguras) {
            if(listaFigura instanceof Rectangulo){
                Rectangulo r = (Rectangulo) listaFigura;
                r.dibujar();
                System.out.println();
            }
        }
        
        
    }
}
