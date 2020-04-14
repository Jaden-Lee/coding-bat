public class stringBits {
    public String stringBits(String str) {
        return str.length() == 0 ? "" : str.length() == 1 ? str.charAt(0)+"" : str.charAt(0) + stringBits(str.substring(2));
    }      
}