import java.util.Collection;

public final class dgew implements ibth {
    public final dgfc a;

    public dgew(dgfc dgfc0) {
        this.a = dgfc0;
    }

    @Override  // ibth
    public final Object a() {
        Collection collection0 = this.a.i.values();
        ibuq.f(collection0, "<this>");
        long v = 0L;
        for(Object object0: collection0) {
            v += ((Number)object0).longValue();
        }
        return v;
    }
}

