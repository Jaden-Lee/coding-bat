public class endX {
    public String endX(String str) {
        return str.indexOf("x") == -1 ? str : checkAllX(str, str.indexOf("x")) ? str : endX(str.substring(0,str.indexOf("x"))+str.substring(str.indexOf("x")+1)+"x");
    }
    public boolean checkAllX(String str, int index) {
        return index >= str.length() ? true : str.substring(index, index+1).equals("x") ? checkAllX(str, index+1) : false;
    }      
}