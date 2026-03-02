import java.util.Comparator;

public final class emro implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((emmd)object0).c, ((emmd)object1).c);
    }
}

