package guiwrapper;

public class Matrix3 {
    // Instance field
    public double[] values;

    // Constructor
    public Matrix3 (double[] values){
        this.values = values;
    }

    public Matrix3 multiply(Matrix3 other){
        double[] product = new double[9];

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                for (int i = 0; i < 3; i++) {
                    product[r*3 + c] += this.values[r*3 + i]*other.values[i*3 + c];
                }
            }
        }
        return new Matrix3(product);
    }

    public Vertex transform(Vertex v){
        return new Vertex(
                v.x*values[0] + v.y*values[3] + v.z*values[6],
                v.x*values[1] + v.y*values[4] + v.z*values[7],
                v.x*values[2] + v.y*values[5] + v.z*values[8]
        );
    }
}
