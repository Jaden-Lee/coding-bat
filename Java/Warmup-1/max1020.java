public class max1020 {
    public int max1020(int a, int b) {
        return (a >= 10 && a <= 20) && (b >= 10 && b <= 20) ? Math.max(a,b) : (a >= 10 && a <= 20) ? a : (b >= 10 && b <= 20) ? b : 0;
    }      
}