public class withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return noDoubles ? die1 == die2 ? die1 == 6 ? 7 : 2*die1+1 : die1+die2 : die1+die2;
    }      
}