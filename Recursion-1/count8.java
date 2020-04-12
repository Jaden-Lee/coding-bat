public class count8 {
    public int count8(int n) {
        return n / 10 == 0 ? n == 8 ? 1 : 0 : Integer.toString(n).charAt(0) == '8' ? Integer.toString(n).charAt(1) == '8' ? 2+count8(Integer.parseInt(Integer.toString(n).substring(1))) : 1+count8(Integer.parseInt(Integer.toString(n).substring(1))) : count8(Integer.parseInt(Integer.toString(n).substring(1)));
    }
}