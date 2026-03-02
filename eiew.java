import java.util.Comparator;

public final class eiew implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((gwmq)object0) == null || ((gwmq)object1) == null ? -1 : Long.compare(((gwmq)object0).c, ((gwmq)object1).c);
    }
}

