public class blueTicket {
    public int blueTicket(int a, int b, int c) {
        return ((a+b == 10) || (b+c == 10)) || (a+c == 10) ? 10 : (Math.abs((a+b)-(b+c)) == 10 || Math.abs((a+c)-(c+b)) == 10) || Math.abs((c+a)-(a+b)) == 10 ? 5 : 0;
    }      
}