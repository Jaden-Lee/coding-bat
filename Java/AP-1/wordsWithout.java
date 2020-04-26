import java.util.ArrayList;

public class wordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        ArrayList<String> tret = new ArrayList();
        for (String word : words) {
          if (!word.equals(target)) {
            tret.add(word);
          }
        }
        String[] ret = new String[tret.size()];
        for (int i = 0; i < ret.length; i++) {
          ret[i] = tret.get(i);
        }
        return ret;
    }      
}