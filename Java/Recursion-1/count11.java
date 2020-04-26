public class count11 {
    public int count11(String str) {
        return str.indexOf("11") == -1 ? 0 : 1+count11(str.substring(str.indexOf("11")+2));
    }      
}