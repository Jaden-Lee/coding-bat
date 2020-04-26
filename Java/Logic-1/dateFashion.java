public class dateFashion {
    public int dateFashion(int you, int date) {
        return you <= 2 ? 0 : date <= 2 ? 0 : you >= 8 ? 2 : date >= 8 ? 2 : 1;
    }
}