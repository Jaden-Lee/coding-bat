public class startOz {
    public String startOz(String str) {
        return str.length() == 0 ? str : str.length() == 1 && str.substring(0,1).equals("o") ? "o" : ((str.substring(0,1).equals("o") ? "o" : "") + (str.substring(1,2).equals("z") ? "z" : ""));
    }      
}