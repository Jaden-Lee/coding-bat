public class stringClean {
    public String stringClean(String str) {
        return str.length() <= 1 ? str : str.substring(0,1).equals(str.substring(1,2)) ? stringClean(str.substring(1)) : str.substring(0,1)+stringClean(str.substring(1));
    }      
}