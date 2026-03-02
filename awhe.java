import java.util.Comparator;

public final class awhe implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Long.compare(((hfwn)object0).b, ((hfwn)object1).b);
        return v == 0 ? Integer.compare(((hfwn)object0).c, ((hfwn)object1).c) : v;
    }
}

