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
    
    // Dado que el rectangulo tiene 4 puntos, creamos 4 puntos
    private Point punto1;
    private Point punto2;
    private Point punto3;
    private Point punto4;

    public Rectangulo(int base, int altura, int numeroLados, String id, String color) {
        super(base, altura, numeroLados, id, color);
        
        this.punto1 = new Point(0,0); 
        this.punto2 = new Point(0, altura);
        this.punto3 = new Point(base, altura);
        this.punto4 = new Point(base, 0);        
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
        this.getPunto1().setX(- x);
        this.getPunto2().setX(- x);
        this.getPunto3().setX(- x);
        this.getPunto4().setX(- x);

    }

    @Override
    public void moverDer(int x) {
        this.getPunto1().setX(+x);
        this.getPunto2().setX(+x);
        this.getPunto3().setX(+x);
        this.getPunto4().setX(+x);
    }

    @Override
    public void moverArr(int y) {
        this.getPunto1().setY(+ y);
        this.getPunto2().setY(+ y);
        this.getPunto3().setY(+ y);
        this.getPunto4().setY(+ y);
    }

    @Override
    public void moverAba(int y) {
        this.getPunto1().setY(- y);
        this.getPunto2().setY(- y);
        this.getPunto3().setY(- y);
        this.getPunto4().setY(- y);
    }

    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void setPunto2(Point punto2) {
        this.punto2 = punto2;
    }

    public Point getPunto3() {
        return punto3;
    }

    public void setPunto3(Point punto3) {
        this.punto3 = punto3;
    }

    public Point getPunto4() {
        return punto4;
    }

    public void setPunto4(Point punto4) {
        this.punto4 = punto4;
    }
    
    
    
}
