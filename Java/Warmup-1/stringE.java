public class stringE {
    public boolean stringE(String str) {
        return (countE(str) >= 1 && countE(str) <= 3);
    }
    public int countE(String str) {
        return str.length() == 0 ? 0 : str.length() == 1 ? str.substring(0,1).equalsIgnoreCase("e") ? 1 : 0 : str.substring(0,1).equalsIgnoreCase("e") ? 1 + countE(str.substring(1)) : 0 + countE(str.substring(1));
    }      
}