public class sumDigits {
    public int sumDigits(int n) {
        return n / 10 == 0 ? n : n % 10 + sumDigits(n/10);
    }      
}