public class triangle {
    public int triangle(int rows) {
        return rows == 0 ? 0 : rows+triangle(rows-1);
    }
}