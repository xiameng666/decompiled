import java.util.Comparator;

public final class fwfr implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ibuq.f(((fwff)object0), "lhs");
        ibuq.f(((fwff)object1), "rhs");
        long v = ((fwff)object0).a.b;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        if(Long.compare(v, -1L) == 0) {
            v = 0x7FFFFFFFFFFFFFFFL;
        }
        long v2 = ((fwff)object1).a.b;
        if(v2 != -1L) {
            v1 = v2;
        }
        return ibuq.b(v, v1);
    }
}

