/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author guerig
 */
public class Circulo extends Figura implements Movible{
    
    private int longitudRadio;
    private Point punto;

    public Circulo(int longitudRadio, String id, String color) {
        super(id, color);
        this.longitudRadio = longitudRadio;
        this.punto = new Point(0,0);
    }

    public int getLongitudRadio() {
        return longitudRadio;
    }

    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("longitudRadio=").append(longitudRadio);
        sb.append("id=").append(super.getId());
        sb.append(", color=").append(super.getColor());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double area() {
        double p = 0;
        double area = 0;
        
        p = 2*(Math.PI) * this.getLongitudRadio();
        
        area = (p * this.getLongitudRadio()) / 2;
        
        return area;
    }

    @Override
    public void moverIzq(int x) {
        this.getPunto().setX(- x);
    }

    @Override
    public void moverDer(int x) {
        this.getPunto().setX(+ x);
    }

    @Override
    public void moverArr(int y) {
        this.getPunto().setY(+ y);
    }

    @Override
    public void moverAba(int y) {
        this.getPunto().setY(- y);
    }

    public Point getPunto() {
        return punto;
    }

    public void setPunto(Point punto) {
        this.punto = punto;
    }
    
    
}
