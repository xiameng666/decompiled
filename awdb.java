import java.util.Comparator;

public final class awdb implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        awce awce0 = (awce)object0;
        awce awce1 = (awce)object1;
        return ggbe.b.d(awce0.c, awce1.c).d(awce0.e, awce1.e).a();
    }
}

