/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author guerig
 */
public final class Rectangulo extends Poligono implements Dibujable, Movible{

    public Rectangulo(int base, int altura, int numeroLados, String id, String color) {
        super(base, altura, numeroLados, id, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("base=").append(super.getBase());
        sb.append(", altura=").append(super.getAltura());
        sb.append(", numeroLados=").append(super.getNumeroLados());
        sb.append("id=").append(super.getId());
        sb.append(", color=").append(super.getColor());
        sb.append('}');
        return sb.toString();
    }
    
    public void dibujar(){
        int columna = this.getBase();
        int fila = this.getAltura();
        
        String [][] matriz = new String [fila][columna];       
        
        for (int i = 0; i < fila -1; i++) {
            // Condicional para añadir datos solo a la primera fila
            if(i == 0){
                for (int j = 0; j < columna; j++) {
                    matriz[i][j] = "*";
                }
            }else if(i > 0 && i < fila){ // Condicional para no añadir nada 
                matriz[i][0] = "*"; // Columna 0
                for (int j = 1; j < columna; j++) {
                    matriz[i][j] = " ";
                }
                matriz[i][columna -1] = "*"; // Última fila
            }            
        }    
        // Bucle para la última fila
        for (int j = 0; j < columna; j++) {
                matriz[fila -1][j] = "*";
//                System.out.print(matriz[fila -1][j]);
            }
        
        for (String[] strings : matriz) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string);
            }
        }
        
       
    }

    @Override
    public double area() {
        double area = this.getBase() * this.getAltura();
        return area;
    }

    @Override
    public void moverIzq(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moverDer(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moverArr(int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moverAba(int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
