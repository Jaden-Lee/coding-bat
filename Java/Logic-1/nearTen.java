public class nearTen {
    public boolean nearTen(int num) {
        return Math.abs(num % 10) <= 2 || Math.abs(num % 10 - 10) <= 2;
    }      
}