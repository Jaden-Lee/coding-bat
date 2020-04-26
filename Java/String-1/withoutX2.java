public class withoutX2 {
    public String withoutX2(String str) {
        return str.length() < 2 ? "" : str.substring(0,2).replaceAll("x","")+str.substring(2);
    }      
}