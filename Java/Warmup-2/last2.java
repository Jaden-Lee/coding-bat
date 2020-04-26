public class last2 {
    public int last2(String str) {
        return str.length() < 2 ? 0 : str.indexOf(str.substring(str.length()-2)) == (str.length()-2) ? 0 : 1+last2(str.substring(str.indexOf(str.substring(str.length()-2))+1));
    }      
}