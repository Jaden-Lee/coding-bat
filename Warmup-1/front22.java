public class front22 {
    public String front22(String str) {
        return str.substring(0,Math.min(str.length(),2))+str+str.substring(0,Math.min(str.length(),2));
    }      
}