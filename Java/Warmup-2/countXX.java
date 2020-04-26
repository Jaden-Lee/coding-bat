public class countXX {
    public int countXX(String str) {
        return str.indexOf("xx") == -1 ? 0 : 1+countXX(str.substring(str.indexOf("xx")+1));
    }      
}