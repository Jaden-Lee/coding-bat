public class countPairs {
    public int countPairs(String str) {
        return str.length() < 3 ? 0 : str.substring(0,1).equals(str.substring(2,3)) ? 1+countPairs(str.substring(1)) : countPairs(str.substring(1));
    }      
}