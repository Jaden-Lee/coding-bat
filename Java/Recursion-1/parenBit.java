public class parenBit {
    public String parenBit(String str) {
        return str.indexOf("(") != -1 ? str.indexOf("(") == 0 ? "("+parenBit(str.substring(1)) : parenBit(str.substring(1)) : str.indexOf(")") == -1 ? "" : str.substring(0,1)+parenBit(str.substring(1));
    }      
}