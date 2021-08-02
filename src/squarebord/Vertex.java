package squarebord;

public class Vertex {
    public double x;
    public double y;
    public Vertex(double x, double y){
        this.x = x+25;
        this.y = y+25;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
