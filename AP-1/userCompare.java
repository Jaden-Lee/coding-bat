public class userCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        return aName.equals(bName) && aId == bId ? 0 : aName.compareTo(bName) < 0 ? -1 : aName.compareTo(bName) > 0 ? 1 : aId > bId ? 1 : -1;
    }      
}