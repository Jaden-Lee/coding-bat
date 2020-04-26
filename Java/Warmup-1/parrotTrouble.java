public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return !talking ? false : hour < 7 || hour > 20;
    }      
}