public class frontTimes {
    public String frontTimes(String str, int n) {
        return n == 0 ? "" : str.substring(0,Math.min(3,str.length()))+frontTimes(str,n-1);
    }      
}