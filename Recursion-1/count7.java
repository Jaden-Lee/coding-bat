public class count7 {
    public int count7(int n) {
        return n / 10 == 0 ? n == 7 ? 1 : 0 : n % 10 == 7 ? 1 + count7(n / 10) : count7(n/10);
    }
}