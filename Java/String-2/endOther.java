public class endOther {
    public boolean endOther(String a, String b) {
        return a.length() > b.length() ? a.toLowerCase().substring(a.length() - b.length()).equals(b.toLowerCase()) : b.toLowerCase().substring(b.length() - a.length()).equals(a.toLowerCase());
    }
}