class Matrix {
    private int rows;
    private int cols;
    private int[] elements;

    public Matrix(int rows, int cols, int[] elements) {
        this.rows = rows;
        this.cols = cols;
        this.elements = elements;
    }
    public int get(int i, int j) {
        if(i< 0 || j< 0 || i >= rows || j >= cols){
            throw new IndexOutOfBoundsException("Índice fora dos limites da matriz");
        }
        return elements[i * cols + j];
    }
    public void set(int i, int j, int value) {
        if(i< 0 || j< 0 || i >= rows || j >= cols){
        throw new IndexOutOfBoundsException("Índice fora dos limites da matriz");
        }
        elements[i * cols + j] = value;
    }
}
