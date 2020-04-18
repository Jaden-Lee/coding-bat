public class startWord {
    public String startWord(String str, String word) {
        return str.length() < word.length() ? "" : str.indexOf(word.substring(1)) == -1 ? "" : str.substring(0,1) + word.substring(1);
    }      
}