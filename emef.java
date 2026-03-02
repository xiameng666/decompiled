import java.util.Comparator;

public final class emef implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Double.compare(((emei)object0).e, ((emei)object1).e);
        return v == 0 ? Long.compare(((emei)object0).a, ((emei)object1).a) : v;
    }
}

