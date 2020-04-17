public class stringX {
    public String stringX(String str) {
        if (str.length() <= 1) return str;
        boolean front = str.substring(0,1).equals("x");
        boolean back = str.substring(str.length()-1).equals("x");
        str = str.replaceAll("x","");
        return (front ? "x" : "") + str + (back ? "x" : "");
    }      
}