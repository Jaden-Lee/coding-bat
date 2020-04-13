public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return isAsleep ? false : !isMorning ? true : isMom ? true : false;
    }      
}