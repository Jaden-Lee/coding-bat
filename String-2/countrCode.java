public class countrCode {
    public int countCode(String str) {
        return str.indexOf("co")+3 >= str.length() ? 0 : str.indexOf("co") == -1 ? 0 : str.charAt(str.indexOf("co")+3) == 'e' ? 1+countCode(str.substring(str.indexOf("co")+3)) : countCode(str.substring(str.indexOf("co")+3));
    }      
}