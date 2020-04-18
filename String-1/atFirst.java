public class atFirst {
    public String atFirst(String str) {
        return str.length() < 2 ? str.length() == 1 ? str+"@" : "@@" : str.substring(0,2);
    }      
}