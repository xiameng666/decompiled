import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.PassType;

public final class dlxl implements dmba {
    public static final int a;
    private static final bboh b;
    private final dlmc c;
    private final int d;
    private final dvjf e;

    static {
        dlxl.b = bboh.b("Pay", bbcu.cZ);
    }

    public dlxl(dlmc dlmc0, int v, dvjf dvjf0) {
        this.c = dlmc0;
        this.d = v;
        this.e = dvjf0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        gftb.b(hjwe0.b == 20, "Cannot evaluate filter that is not covid cards count filter");
        ftgf ftgf0 = ftgf.b(ecfu.a(this.c.b()).o);
        if(ftgf0 == null) {
            ftgf0 = ftgf.e;
        }
        try {
            PassFilter passFilter0 = new PassFilter();
            PassType[] arr_passType = new PassType[1];
            PassType passType0 = new PassType();
            passType0.a = 9;
            arr_passType[0] = passType0;
            passFilter0.a = arr_passType;
            passFilter0.h = this.d;
            v = gged_interceptors.h(gggq.d(((Iterable)this.e.a(passFilter0).first), new dlxk(ftgf0 == ftgf.d))).size();
        }
        catch(eaqz | dmhl | earn exception0) {
            a.ae(dlxl.b.i(), "Unable to get the number of covid cards, assuming zero.", exception0);
            v = 0;
        }
        hjsr hjsr0 = hjwe0.b == 20 ? ((hjsr)hjwe0.c) : hjsr.a;
        if((hjsr0.b & 2) == 0 || v <= (hjsr0.d == null ? hftw.a : hjsr0.d).b) {
            hjsr hjsr1 = hjwe0.b == 20 ? ((hjsr)hjwe0.c) : hjsr.a;
            return (hjsr1.b & 1) == 0 ? true : v >= (hjsr1.c == null ? hftw.a : hjsr1.c).b;
        }
        return false;
    }
}

