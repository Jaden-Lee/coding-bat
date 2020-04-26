public class notString {
    public String notString(String str) {
        return (str.indexOf("not") == -1) ? "not "+str : str.indexOf("not") == 0 ? str : "not "+str;
    }      
}