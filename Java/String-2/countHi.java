public class countHi {
    public int countHi(String str) {
        return str.indexOf("hi") == -1 ? 0 : 1+countHi(str.substring(str.indexOf("hi")+2));
    }      
}