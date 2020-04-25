public class scoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int ret = 0;
        for (int i = 0; i < key.length; i++) {
          if (answers[i].equals("?")) {
            continue;
          }
          else if (key[i].equals(answers[i])) {
            ret += 4;
          }
          else {
            ret -= 1;
          }
        }
        return ret;
    }      
}