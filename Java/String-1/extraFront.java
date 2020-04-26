public class extraFront {
    public String extraFront(String str) {
        return str.substring(0, Math.min(2,str.length()))+str.substring(0, Math.min(2,str.length()))+str.substring(0, Math.min(2,str.length()));
    }      
}