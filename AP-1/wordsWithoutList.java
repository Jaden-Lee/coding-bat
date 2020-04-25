import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> ret = new ArrayList();
        for (String s : words) {
          if (s.length() != len) ret.add(s);
        }
        return ret;
    }      
}