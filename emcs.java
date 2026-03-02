import java.util.Comparator;

public final class emcs implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((emdu)object0).b.h, ((emdu)object1).b.h);
    }
}

