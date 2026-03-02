import java.util.Comparator;

public final class nhx implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((nho)object0).b, ((nho)object1).b);
    }
}

