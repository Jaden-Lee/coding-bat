public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        return str.substring(n).indexOf(str.substring(0,n)) != -1;
    }      
}