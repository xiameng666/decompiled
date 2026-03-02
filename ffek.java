import java.util.Arrays;
import java.util.List;

public final class ffek {
    static final List a;
    static final List b;
    private final fdpl c;
    private final fdpl d;

    static {
        ffek.a = Arrays.asList(new String[]{"com.google.android.location.fused.wearable.LOCATION_CAPABILITY", "mdm/ringable", "com.google.android.location.fused.wearable.LOCATION_REQUESTOR_CAPABILITY"});
        ffek.b = Arrays.asList(new String[]{"com/google/android/location/fused/wearable/LOCATIONS", "com/google/android/location/fused/wearable/LOCATION_REQUESTS_REFRESH", "com.google.android.gms.mdm.RING_STARTED", "com.google.android.gms.mdm.RING_CANCELED", "com/google/android/location/fused/wearable/LOCATION_REQUESTS", "com.google.android.gms.mdm.ACTION_RING", "com.google.android.gms.mdm.ACTION_CANCEL_RING"});
    }

    public ffek(fdpl fdpl0, fdpl fdpl1) {
        this.c = fdpl0;
        this.d = fdpl1;
    }

    public final fdpl a(fdpl fdpl0, String s) {
        fdpl fdpl1 = this.c;
        if(fdpl1 != null) {
            fdpl fdpl2 = this.d;
            if(fdpl2.equals(fdpl0) && ffek.a.contains(s)) {
                return fdpl1;
            }
            return !fdpl1.equals(fdpl0) || !ffek.a.contains(s) ? fdpl0 : fdpl2;
        }
        return fdpl0;
    }

    public final fdpl b(fdpl fdpl0, String s) {
        fdpl fdpl1 = this.c;
        if(fdpl1 != null) {
            fdpl fdpl2 = this.d;
            if(fdpl2.equals(fdpl0) && ffek.b.contains(s)) {
                return fdpl1;
            }
            return !fdpl1.equals(fdpl0) || !ffek.b.contains(s) ? fdpl0 : fdpl2;
        }
        return fdpl0;
    }
}

