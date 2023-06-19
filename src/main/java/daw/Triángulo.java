/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;


/**
 *
 * @author guerig
 */
public final class Triángulo extends Poligono implements Comparable<Triángulo>{
    
    private Point punto1;
    private Point punto2;
    private Point punto3;

    public Triángulo(int base, int altura, int numeroLados, String id, String color) {
        super(base, altura, numeroLados, id, color);
        
        this.punto1 = new Point(0, 0);
        this.punto2 = new Point(base, 0);
        this.punto3 = new Point(base, altura);
    }

    @Override
    public double area() {
        double area = (this.getBase() * this.getAltura()) / 2;
        
        return area;
    }

    @Override
    public int compareTo(Triángulo t) {
        
        // Hacemos una conversión ya que hay que usar un tipo objecto
        Integer baseInteger = this.getBase();
        
        return baseInteger.compareTo(t.getBase());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tri\u00e1ngulo{");
        sb.append("base=").append(super.getBase());
        sb.append(", altura=").append(super.getAltura());
        sb.append(", numeroLados=").append(super.getNumeroLados());
        sb.append("id=").append(super.getId());
        sb.append(", color=").append(super.getColor());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}