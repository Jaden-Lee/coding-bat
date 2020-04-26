public class deFront {
    public String deFront(String str) {    
        return (str.substring(0,1).equals("a") ? "a" : "") + (str.substring(1,2).equals("b") ? "b" : "") +str.substring(2);
    }      
}