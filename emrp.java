import java.util.Comparator;

public final class emrp implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((emim)object0).f, ((emim)object1).f);
    }
}

