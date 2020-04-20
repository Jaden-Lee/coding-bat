public class catDog {
    public boolean catDog(String str) {
        return findCat(str)==findDog(str);
    }
    public int findCat(String str) {
        return str.indexOf("cat") == -1 ? 0 : 1+findCat(str.substring(str.indexOf("cat")+3));
    }
    public int findDog(String str) {
        return str.indexOf("dog") == -1 ? 0 : 1+findDog(str.substring(str.indexOf("dog")+3));
    }
}