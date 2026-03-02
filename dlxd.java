import java.util.List;

public final class dlxd implements dmba {
    private static final bboh a;
    private final dqmj b;

    static {
        dlxd.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlxd(dqmj dqmj0) {
        this.b = dqmj0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 14, "Cannot evaluate filter that is not display card count filter");
        hjsm hjsm0 = hjwe0.b == 14 ? ((hjsm)hjwe0.c) : hjsm.a;
        try {
            List list0 = this.b.a();
        }
        catch(dmhl dmhl0) {
            a.ae(dlxd.a.j(), "Could not fetch display cards from local datastore", dmhl0);
            return false;
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            gtkg gtkg0 = (gtkg)object0;
            if(((hjsm0.b & 4) == 0 || (hjsm0.g == null ? hftx.a : hjsm0.g).b == gtkg0.p) && ((gtqj.b(hjsm0.f) == null ? gtqj.i : gtqj.b(hjsm0.f)) == gtqj.a || (gtqj.b(gtkg0.g) == null ? gtqj.i : gtqj.b(gtkg0.g)) == (gtqj.b(hjsm0.f) == null ? gtqj.i : gtqj.b(hjsm0.f)))) {
                int v = hjsm0.e;
                if((gtls.b(v) == null ? gtls.h : gtls.b(v)) == gtls.a) {
                    ggdy0.i(gtkg0);
                }
                else {
                    gtkb gtkb0 = gtkg0.v == null ? gtkb.b : gtkg0.v;
                    if((gtls.b(v) == null ? gtls.h : gtls.b(v)) == (gtls.b(gtkb0.e) == null ? gtls.h : gtls.b(gtkb0.e))) {
                        ggdy0.i(gtkg0);
                    }
                }
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        if((hjsm0.b & 2) == 0 || ((ggna)gged0).c <= (hjsm0.d == null ? hftw.a : hjsm0.d).b) {
            return (hjsm0.b & 1) == 0 ? true : ((ggna)gged0).c >= (hjsm0.c == null ? hftw.a : hjsm0.c).b;
        }
        return false;
    }
}

