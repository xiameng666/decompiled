import java.util.Comparator;

public final class dgze implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        long v;
        if((object0 instanceof dhci)) {
            v = ((dhci)object0).c;
        }
        else {
            ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.nearby.sharing.provider.impl.tracing.Event");
            v = ((dgxj)object0).a;
        }
        Long long0 = v;
        if((object1 instanceof dhci)) {
            return ibrc.a(long0, Long.valueOf(((dhci)object1).c));
        }
        ibuq.d(object1, "null cannot be cast to non-null type com.google.android.gms.nearby.sharing.provider.impl.tracing.Event");
        return ibrc.a(long0, Long.valueOf(((dgxj)object1).a));
    }
}

