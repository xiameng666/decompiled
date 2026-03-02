import com.google.android.gms.chromesync.zeroparty.ChromeSyncState;

public final class bemd implements beok {
    @Override  // beok
    public final Object a(Object object0, Object object1) {
        if(bedv.d(((bedv)object0))) {
            Object object2 = ((bedv)object0).b;
            if(object2 != null) {
                return !ibpo.aB(ibqg.c(new Integer[]{((int)2), ((int)5)}), Integer.valueOf(((ChromeSyncState)object2).b)) || !((Boolean)object1).booleanValue() ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        return Boolean.valueOf(false);
    }
}

