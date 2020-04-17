public class stringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < Math.min(a.length(),b.length())-1; i++) {
          String ai = a.substring(i,i+2);
          String bi = b.substring(i,i+2);
          count += ai.equals(bi) ? 1 : 0;
        }
        return count;
    }      
}