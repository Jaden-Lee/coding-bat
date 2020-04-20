public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        return count == 0 ? "" : count == 1 ? word : word+sep+repeatSeparator(word,sep,count-1);
    }      
}