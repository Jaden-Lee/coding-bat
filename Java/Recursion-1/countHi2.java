public class countHi2 {
    public int countHi2(String str) {
        return str.indexOf("hi") == -1 ? 0 : str.indexOf("hi") == 0 ? 1+countHi2(str.substring(str.indexOf("hi")+2)) : str.charAt(str.indexOf("hi")-1) == 'x' ? countHi2(str.substring(str.indexOf("hi")+2)) : 1+countHi2(str.substring(str.indexOf("hi")+2));
    }      
}