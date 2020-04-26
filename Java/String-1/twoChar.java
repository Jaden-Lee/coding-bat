public class twoChar {
    public String twoChar(String str, int index) {
        return index <= 0 || str.length()-1 <= index ? str.substring(0,2) : str.substring(index,index+2);
    }      
}