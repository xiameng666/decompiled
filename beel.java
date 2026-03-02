import com.google.android.gms.chromesync.zeroparty.ChromeSyncState;

public final class beel implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((bedv)object0), "chromeSyncStateResource");
        if(bedv.d(((bedv)object0))) {
            Object object1 = ((bedv)object0).b;
            if(object1 != null) {
                return ((ChromeSyncState)object1).b == 5 ? new bedv(bedu.a, Boolean.valueOf(true), null) : new bedv(bedu.a, Boolean.valueOf(false), null);
            }
            throw new IllegalStateException("Required value was null.");
        }
        bedu bedu0 = bedu.c;
        if(((bedv)object0).a == bedu0) {
            Exception exception0 = ((bedv)object0).c;
            if(exception0 != null) {
                return new bedv(bedu0, null, exception0);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        return new bedv(bedu.b, null, null);
    }
}

