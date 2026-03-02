import java.util.Comparator;

public final class dofm implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((dohd)object1).k(), ((dohd)object0).k());
    }
}

