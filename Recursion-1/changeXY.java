public class changeXY {
    public String changeXY(String str) {
        return str.indexOf("x") == -1 ? str : changeXY(str.substring(0,str.indexOf("x"))+"y"+str.substring(str.indexOf("x")+1));
    }
}