public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        return speed <= 60 ? 0 : isBirthday ? speed <= 65 ? 0 : speed <= 85 ? 1 : 2 : speed <= 60 ? 0 : speed <= 80 ? 1 : 2;
    }      
}