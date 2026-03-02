import java.util.Comparator;

public final class fdqd implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((String)object0).compareToIgnoreCase(((String)object1));
        return v == 0 ? ((String)object0).compareTo(((String)object1)) : v;
    }
}

