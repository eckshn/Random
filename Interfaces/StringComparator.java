import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < 2)
            return -1;
        if (o2.length() < 2)
            return 1;
        return o1.charAt(1) - o2.charAt(1);
    }

}