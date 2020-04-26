public class pairStar {
    public String pairStar(String str) {
        return str.length() == 0 ? str : str.length() == 1 ? str.substring(0,1) : str.substring(0,1).equals(str.substring(1,2)) ? str.substring(0,1)+"*"+pairStar(str.substring(1)) : str.substring(0,1)+pairStar(str.substring(1));
    }      
}