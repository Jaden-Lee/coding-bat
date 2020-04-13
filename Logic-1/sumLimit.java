public class sumLimit {
    public int sumLimit(int a, int b) {
        return (a+b) % Math.pow(10,Integer.toString(a).length()) == (a+b) ? a+b : a;
    }      
}