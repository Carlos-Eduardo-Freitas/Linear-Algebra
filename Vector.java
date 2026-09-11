public class Vector {
    private int dim;
    private int[] elements;
    public Vector(int dim, int[] elements) {
        this.dim = dim;
        this.elements = elements;
    }

    public int get(int i) {
        if (i < 0 || i >= dim) {
            throw new IndexOutOfBoundsException("Índice fora dos limites do vetor.");
        }
        return elements[i];
    }

    public void set(int i, int value) {
        if (i < 0 || i >= dim) {
            throw new IndexOutOfBoundsException("Índice fora dos limites do vetor.");
        }
        elements[i] = value;
    }
}
