import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfsr {
    public static final long a(gyqi gyqi0) {
        long v = 0L;
        for(Object object0: gyqi0.b) {
            v += ((gysm)object0).d;
        }
        for(Object object1: gyqi0.c) {
            v += ((gyqz)object1).d;
        }
        return v;
    }

    public static final String b(ShareTarget shareTarget0) {
        return shareTarget0.b + "_" + shareTarget0.a;
    }
}

