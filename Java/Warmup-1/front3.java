public class front3 {
    public String front3(String str) {
        return str.substring(0,Math.min(str.length(),3))+str.substring(0,Math.min(str.length(),3))+str.substring(0,Math.min(str.length(),3));
    }      
}