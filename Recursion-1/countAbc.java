public class countAbc {
    public static int countAbc(String str) {
        return str.indexOf("abc")+str.indexOf("aba") == -2 ? 0 : str.indexOf("abc") == -1 ? 1 + countAbc(str.substring(str.indexOf("aba")+1)) : str.indexOf("aba") == -1 ? 1 + countAbc(str.substring(str.indexOf("abc")+1)) : str.indexOf("abc") > str.indexOf("aba") ? 1+countAbc(str.substring(str.indexOf("aba")+1)) : 1+countAbc(str.substring(str.indexOf("abc")+1));
    }
}