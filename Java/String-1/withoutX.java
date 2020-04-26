public class withoutX {
    public String withoutX(String str) {
        return str.length() < 2 ? "" : (str.substring(0,1).equals("x") ? "" : str.substring(0,1)) + str.substring(1,str.length()-1) + (str.substring(str.length()-1).equals("x") ? "" : str.substring(str.length()-1));
    }      
}