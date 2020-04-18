public class without2 {
    public String without2(String str) {
        return str.length() < 2 ? str : str.substring(str.length()-2).equals(str.substring(0,2)) ? str.substring(2,str.length()) : str;
    }      
}