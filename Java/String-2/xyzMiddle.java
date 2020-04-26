public class xyzMiddle {
    public boolean xyzMiddle(String str) {                           
        return str.length() < 3 ? false : str.length() % 2 == 0 ? str.substring(str.length() / 2 - 2, str.length() / 2 +1).equals("xyz") || str.substring(str.length() / 2 - 1, str.length() / 2 +2).equals("xyz") : str.substring(str.length() / 2 - 1, str.length() / 2 + 2).equals("xyz");
    }
}