public class stringYak {
    public String stringYak(String str) {
        str+="  ";
        String ret = "";
        for (int i = 0; i < str.length()-2;) {
          ret += str.substring(i,i+1).equals("y") && str.substring(i+2,i+3).equals("k") ? "" : str.substring(i,i+1);
          i += str.substring(i,i+1).equals("y") && str.substring(i+2,i+3).equals("k") ? 3 : 1;
        }
        return ret.replaceAll(" ","");
    }      
}