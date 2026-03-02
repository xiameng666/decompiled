import android.content.Context;

public final class dlxq implements dmba {
    public static final int a;
    private static final bboh b;
    private final Context c;
    private final dmjl d;

    static {
        dlxq.b = bboh.b("Pay", bbcu.cZ);
    }

    public dlxq(Context context0, dmjl dmjl0) {
        this.c = context0;
        this.d = dmjl0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gged_interceptors gged0;
        gftb.b(hjwe0.b == 13, "Cannot evaluate filter that is not digital car key count filter");
        if(hwid.d() && dmjt.b(this.c)) {
            hjsv hjsv0 = hjwe0.b == 13 ? ((hjsv)hjwe0.c) : hjsv.a;
            try {
                gged0 = gged_interceptors.h(gggq.d(this.d.a(), new dlxp()));
            }
            catch(dmhl dmhl0) {
                a.ae(dlxq.b.j(), "Could not fetch digital car keys from local datastore", dmhl0);
                return false;
            }
            if((hjsv0.b & 2) != 0 && gged0.size() > (hjsv0.d == null ? hftw.a : hjsv0.d).b) {
                return false;
            }
            return (hjsv0.b & 1) == 0 ? true : gged0.size() >= (hjsv0.c == null ? hftw.a : hjsv0.c).b;
        }
        ((ggtj)dlxq.b.h()).x("Not using digital car key filter as user doesn\'t have digital car keys module");
        return false;
    }
}

