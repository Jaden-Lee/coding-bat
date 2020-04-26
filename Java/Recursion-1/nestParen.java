public class nestParen {
    public boolean nestParen(String str) {
        return str.length() % 2 == 0 ? str.indexOf("(")+str.indexOf(")") == -2 ? str.length() == 0 ? true : false : str.indexOf("(")+str.indexOf(")") <= 0 ? false : nestParen(str.substring(str.indexOf("(")+1,str.lastIndexOf(")"))) : false;
    }
}