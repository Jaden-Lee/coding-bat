public class close10 {
    public int close10(int a, int b) {
        return Math.abs(10-a)-Math.abs(10-b) < 0 ? a : Math.abs(10-a)-Math.abs(10-b) == 0 ? 0 : b;
    }      
}