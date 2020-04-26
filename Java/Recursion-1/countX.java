public class countX {
    public int countX(String str) {
        return str.indexOf("x") == -1 ? 0 : 1+countX(str.substring(str.indexOf("x")+1));
    }
}