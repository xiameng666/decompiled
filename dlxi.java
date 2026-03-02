public final class dlxi implements dmba {
    public static final int a;
    private static final bboh b;
    private final dqmj c;
    private final dlmc d;

    static {
        dlxi.b = bboh.b("Pay", bbcu.cZ);
    }

    public dlxi(dlmc dlmc0, dqmj dqmj0) {
        this.d = dlmc0;
        this.c = dqmj0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gged_interceptors gged0;
        gftb.b(hjwe0.b == 16, "Cannot evaluate filter that is not closed loop transit cards count filter");
        ftgf ftgf0 = ftgf.b(ecfu.a(this.d.b()).o);
        if(ftgf0 == null) {
            ftgf0 = ftgf.e;
        }
        hjso hjso0 = hjwe0.b == 16 ? ((hjso)hjwe0.c) : hjso.a;
        try {
            gged0 = gged_interceptors.h(gggq.d(this.c.a(), new dlxh(ftgf0 == ftgf.c)));
        }
        catch(dmhl dmhl0) {
            a.ae(dlxi.b.j(), "Could not fetch closed loop cards from local datastore", dmhl0);
            return false;
        }
        if((hjso0.b & 2) != 0 && gged0.size() > (hjso0.d == null ? hftw.a : hjso0.d).b) {
            return false;
        }
        return (hjso0.b & 1) == 0 ? true : gged0.size() >= (hjso0.c == null ? hftw.a : hjso0.c).b;
    }
}

