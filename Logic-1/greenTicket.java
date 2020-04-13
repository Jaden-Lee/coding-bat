public class greenTicket {
    public int greenTicket(int a, int b, int c) {
        return 10*(amountSame(a,b,c)-1);
    }
    
    public int amountSame(int a, int b, int c) {
      return (a == b) && (b == c) ? 3 : ((a != b) && (b != c)) && (c != a) ? 1 : 2;
    }      
}