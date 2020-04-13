public class hasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return (isTeen(a) || isTeen(b)) || isTeen(c);
    }
    public boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }
}