public class stringTimes {
    public String stringTimes(String str, int n) {
        return n == 0 ? "" : str+stringTimes(str,n-1);
    }      
}