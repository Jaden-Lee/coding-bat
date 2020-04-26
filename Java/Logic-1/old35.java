public class old35 {
    public boolean old35(int n) {
        return (n % 3 == 0) ^ (n % 5 == 0);
        // ^ is the xor operator meaning only one of the above can be true to return true
        // returns false if both are true, both are false
    }      
}