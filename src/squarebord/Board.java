package squarebord;


public class Board {
    // Instance field
    public double weight;
    public double height;
    public double deltaW;
    public double deltaH;
    public int rows;
    public int cols;
    public Square[][] board;

    // Constructor
    public Board(double weight, double height, int rows, int cols){
        this.weight = weight;
        this.height = height;
        this.rows = rows;
        this.cols = cols;
        this.deltaH = (weight-50)/cols;
        this.deltaW = (height-50)/rows;
        System.out.println(weight);
        System.out.println(deltaW);
        System.out.println(height);
        System.out.println(deltaH);


        this.board = new Square[rows][cols];
        for (int r = 0; r < this.board.length; r++) {
            for (int c = 0; c < this.board[0].length; c++) {
                this.board[r][c] = new Square(
                        new Vertex(deltaH*c, deltaW*r),
                        new Vertex(deltaH*c, deltaW*(r+1)),
                        new Vertex(deltaH*(c+1), deltaW*(r+1)),
                        new Vertex(deltaH*(c+1), deltaW*r)
                );
            }
        }
    }

}
