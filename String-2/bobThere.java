public class bobThere {
    public boolean bobThere(String str) {
        return str.indexOf("b") == -1 ? false : str.indexOf("b")+2 >= str.length() ? false : str.length() < 3 ? false : str.substring(str.indexOf("b")+2,str.indexOf("b")+3).equals("b") ? true : bobThere(str.substring(str.indexOf("b")+1));
    }      
}