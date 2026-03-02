import j..util.Objects;
import java.util.Comparator;

final class qlk implements Comparator {
    public qlk(qll qll0) {
        Objects.requireNonNull(qll0);
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        float f = (float)(((Float)((kau)object0).b));
        float f1 = (float)(((Float)((kau)object1).b));
        if((f1 > f)) {
            return 1;
        }
        return f > f1 ? -1 : 0;
    }
}

