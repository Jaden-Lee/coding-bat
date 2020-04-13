public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? b < c : (a < b) && (b < c);
    }      
}