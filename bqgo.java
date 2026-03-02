import java.util.Comparator;

public final class bqgo implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((bqcx)((bqgp)object0).b).b, ((bqcx)((bqgp)object1).b).b);
    }
}

