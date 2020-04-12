public class changePi {
    public String changePi(String str) {
        return str.indexOf("pi") == -1 ? str : changePi(str.substring(0,str.indexOf("pi"))+"3.14"+str.substring(str.indexOf("pi")+2));
    }      
}