public class xyBalance {
    public boolean xyBalance(String str) {
        return str.indexOf("x") == -1 & str.indexOf("y") == -1 ? true : str.indexOf("x") == -1 && str.indexOf("y") != -1 ? true : str.indexOf("x") < str.lastIndexOf("y") ? xyBalance(str.substring(str.indexOf("x")+1)) : false;
    }      
}