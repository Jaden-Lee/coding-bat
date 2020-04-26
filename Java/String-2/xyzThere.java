public class xyzThere {
    public boolean xyzThere(String str) {
        return str.indexOf("xyz") == -1 ? false : str.indexOf(".xyz") == -1 ? true : xyzThere(str.substring(str.indexOf("xyz")+3));
    }      
}