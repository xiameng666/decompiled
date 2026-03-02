import java.util.Comparator;

public final class fwei implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Double.compare(((fweo)object0).d, ((fweo)object1).d);
    }
}

