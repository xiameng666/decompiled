import java.util.Comparator;

public final class nhp implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Integer.compare(((nhq)object0).b.b, ((nhq)object1).b.b);
    }
}

