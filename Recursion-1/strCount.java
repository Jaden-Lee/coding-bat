public class strCount {
    public int strCount(String str, String sub) {
        return str.indexOf(sub) == -1 ? 0 : 1+strCount(str.substring(str.indexOf(sub)+sub.length()),sub);
    }
}