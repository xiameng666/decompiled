import android.content.Context;

public final class dlxt implements dmba {
    public static final int a;
    private static final bboh b;
    private final Context c;
    private final dmjl d;

    static {
        dlxt.b = bboh.b("Pay", bbcu.cZ);
    }

    public dlxt(Context context0, dmjl dmjl0) {
        this.c = context0;
        this.d = dmjl0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gged_interceptors gged0;
        gftb.b(hjwe0.b == 27, "Cannot evaluate filter that is not digital car key owner filter");
        if(hwid.d() && dmjt.b(this.c)) {
            hjsw hjsw0 = hjwe0.b == 27 ? ((hjsw)hjwe0.c) : hjsw.a;
            try {
                gged0 = gged_interceptors.h(gggq.d(this.d.a(), new dlxs()));
            }
            catch(dmhl dmhl0) {
                a.ae(dlxt.b.j(), "Could not fetch digital car keys from local datastore", dmhl0);
                return false;
            }
            if(!gged0.isEmpty()) {
                return hjsw0.b ? dlxt.b(gged0) : !dlxt.b(gged0);
            }
            return false;
        }
        ((ggtj)dlxt.b.h()).x("Not using digital car key filter as user doesn\'t have digital car keys module");
        return false;
    }

    private static boolean b(gged_interceptors gged0) {
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            boolean z = ((dmjo)gged0.get(v1)).i;
            ++v1;
            if(z) {
                return true;
            }
        }
        return false;
    }
}

