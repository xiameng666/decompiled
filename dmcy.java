import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.PassType;

public final class dmcy {
    public static final bboh a;
    public static final PassFilter b;
    public static final boolean c;
    public final dvjf d;
    public gged_interceptors e;

    static {
        dmcy.a = bboh.b("Pay", bbcu.cZ);
        PassFilter passFilter0 = new PassFilter();
        passFilter0.h = 5;
        passFilter0.a = new PassType[]{dsij.a(guwf.g)};
        dmcy.b = passFilter0;
        dmcy.c = hwmp.q();
    }

    public dmcy(dvjf dvjf0) {
        this.d = dvjf0;
    }

    public static final String a(guxg guxg0) {
        if((guxg0.b & 0x400) != 0) {
            guxd guxd0 = guxg0.l == null ? guxd.a : guxg0.l;
            guxe guxe0 = guxd0.b == null ? guxe.a : guxd0.b;
            String s = (guxe0.b == null ? guxc.a : guxe0.b).b;
            ibuq.c(s);
            return s;
        }
        String s1 = (guxg0.i == null ? guxc.a : guxg0.i).b;
        ibuq.c(s1);
        return s1;
    }
}

