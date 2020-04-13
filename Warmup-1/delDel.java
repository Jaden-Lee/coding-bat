public class delDel {
    public String delDel(String str) {
        return str.indexOf("del") == 1 ? str.substring(0,1)+str.substring(4) : str;
    }      
}