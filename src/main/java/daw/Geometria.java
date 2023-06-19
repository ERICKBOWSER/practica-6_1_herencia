/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Arrays;
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
        Figura rect2 = new Rectangulo(10, 4, 4, "4", "Amarillo");

        // Conversión implicita
        Figura cir1 = new Circulo(5, "5", "Naranja");
        Figura cir2 = new Circulo(15, "1", "Blanco");

        Set<Figura> figuras = new HashSet();

        figuras.add(tri1);
        figuras.add(tri2);

        figuras.add(rect1);
        figuras.add(rect2);

        figuras.add(cir1);
        figuras.add(cir2);

        System.out.println("sout de Set:");
        figuras.forEach(System.out::println);

        for (Figura listaFigura : figuras) {
            System.out.println(listaFigura);

            System.out.println("Area: " + listaFigura.area());
            System.out.println();
        }

        // Creamos una lista de tipo figura para almacenar todos los tipos de figura
        List<Figura> listaFiguras = new ArrayList(figuras);

        // Ordenamos la lista y haciendo uso de Comparator y su método comparing ordenamos la lista
        Collections.sort(listaFiguras, Comparator
                .comparing(Figura::getColor)
                .thenComparing(Figura::getId) // para que si hay dos datos iguales se resuelva por esta comparación
        );

        System.out.println("\nLista ordenada por color");
        for (Figura lista : listaFiguras) {
            System.out.println(lista);
        }

//        // Dibujar el rectangulo
//        System.out.println("Dibujar rectangulos: ");
//        for (Figura listaFigura : listaFiguras) {
//            if(listaFigura instanceof Rectangulo){
//                Rectangulo r = (Rectangulo) listaFigura;
//                r.dibujar();
//                System.out.println();
//            }
//        }
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce un if de figura: ");
//        int idPorUsuario = teclado.nextInt();
//        
//        for (Figura fig : listaFiguras) {
//            idPorUsuario = Collections.binarySearch(listaFiguras, idPorUsuario);
//        }
        List<Figura> listaDibujables = new ArrayList();
        List<Figura> listaMovibles = new ArrayList();
        List<Figura> listaComparables = new ArrayList();

        // Según el tipo que sea añadimos cada uno a su respectiva lista
        for (Figura lista : listaFiguras) {
            if (lista instanceof Dibujable) {

                listaDibujables.add(lista);

            } else if (lista instanceof Comparable) {

                listaComparables.add(lista);

            } else if (lista instanceof Movible) {

                listaMovibles.add(lista);

            }

        }

        for (Figura dib : listaDibujables) {
            if (dib instanceof Dibujable) {
                ((Dibujable) dib).dibujar(); // Conversión explicita
            }
        }

        for (Figura mov : listaMovibles) {
            if (mov instanceof Rectangulo) {
                ((Rectangulo) mov).moverDer(2); // Conversión explicita
            } else if (mov instanceof Circulo) {
                ((Circulo) mov).moverArr(3); // Conversión explicita
            }
        }

    }
}
