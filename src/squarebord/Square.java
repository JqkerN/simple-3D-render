package squarebord;

import java.awt.*;

public class Square{
    /*
    Layout of the square corners:
        c1-------c2
        |         |
        |         |
        c4-------c3
     */
    public Vertex c1;
    public Vertex c2;
    public Vertex c3;
    public Vertex c4;
    public Color color;

    public Square(Vertex c1, Vertex c2, Vertex c3, Vertex c4){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.color = Color.BLACK;
    }

    protected void fillCell(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "c1=" + c1.toString() +
                ", c2=" + c2.toString() +
                ", c3=" + c3.toString() +
                ", c4=" + c4.toString() +
                ", color=" + color +
                '}';
    }
}
