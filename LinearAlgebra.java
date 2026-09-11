public class LinearAlgebra {

    public Matrix transpose(Matrix a) {
        int rows = a.getRows();
        int cols = a.getCols();
        Matrix result = new Matrix(cols,rows, new int[rows*cols]);

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                result.set(j, i, a.get(i, j));
            }
        }
        return result;
    }
    public Vector transpose(Vector a) {
        int dim = a.getDim();
        int[] copiedElements = new int[dim];
        for(int i=0;i<dim;i++) {
            copiedElements[i] = a.get(i);
        }
        return new Vector(dim, copiedElements);
    }
    public Matrix sum(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("As matrizes precisam ter as mesmas dimensões para serem somadas.");
        }
        int rows = a.getRows();
        int cols = a.getCols();
        Matrix result = new Matrix(rows, cols, new int[rows * cols]);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(i, j, a.get(i, j) + b.get(i, j));
            }
        }
        return result;
    }

}
