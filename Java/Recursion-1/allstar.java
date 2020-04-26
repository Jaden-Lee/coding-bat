public class allstar {
    public String allStar(String str) {
        return str.length() == 0 ? "" : str.lastIndexOf("*")+2 == str.length() ? str : str.lastIndexOf("*") == -1 ? allStar(str.substring(0,1)+"*"+str.substring(1)) : allStar(str.substring(0,str.lastIndexOf("*")+2)+"*"+str.substring(str.lastIndexOf("*")+2));
    }
}