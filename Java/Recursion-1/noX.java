public class noX {
    public String noX(String str) {
        return str.indexOf("x") == -1 ? str : noX(str.substring(0,str.indexOf("x"))+str.substring(str.indexOf("x")+1));
    }
}