import java.util.List;

public class noYY {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n+"y");
        strings.removeIf(n -> n.indexOf("yy") != -1);
        return strings;
    }
}