package Lab6_2;

public class Matrix {

    private double[][] data;
    private int rows;
    private int column;

    public Matrix(int rows, int column) {
        this.rows = rows;
        this.column = column;
    }

    public Matrix(double[][] data) {
        this.data = data;
    }

    public Matrix(Matrix m) {
    }

    public void printMatrix(){
        for(int i=0; i<this.rows; i++){
            for(int j=0; j<this.column; j++){
                System.out.print(this.data[i][j]);
            }
        }
    }

}
