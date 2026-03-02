import java.util.Comparator;

public final class blqc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((String)object0).compareToIgnoreCase(((String)object1));
    }
}

