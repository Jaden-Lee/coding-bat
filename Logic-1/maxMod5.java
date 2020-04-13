public class maxMod5 {
    public int maxMod5(int a, int b) {
        return a == b ? 0 : (a % 5 == b % 5) ? Math.min(a,b) : Math.max(a,b);
    }      
}