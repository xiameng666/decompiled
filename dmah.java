import j..util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class dmah implements dmba {
    public static final int a;
    private static final bboh b;
    private static final Executor c;
    private final dytd d;
    private final dyra e;

    static {
        dmah.b = bboh.b("Pay", bbcu.cZ);
        dmah.c = new bblp(0x7FFFFFFF, 9);
    }

    public dmah(dytd dytd0, dyra dyra0) {
        this.d = dytd0;
        this.e = dyra0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        gftb.b(hjwe0.b == 29, "Cannot evaluate filter that is not SE prepaid cards count filter");
        hjve hjve0 = hjwe0.b == 29 ? ((hjve)hjwe0.c) : hjve.b;
        try {
            ggdy ggdy0 = new ggdy();
            for(Object object0: new hfuh(hjve0.f, hjve.a)) {
                dyna dyna0 = dypl.f(((gtni)object0));
                if(dylv.c.contains(dyna0)) {
                    evql evql1 = this.d.e(dyna0, 1);
                    dmaf dmaf0 = new dmaf();
                    ggdy0.i(evql1.d(dmah.c, dmaf0));
                }
                else if(dylv.b.contains(dyna0)) {
                    dmad dmad0 = new dmad();
                    ggdy0.i(this.d.g(dyna0, Optional.empty(), 1, 1).d(dmah.c, dmad0));
                }
                else if(dyna0.equals(dyna.i)) {
                    evql evql0 = this.e.d(dyfc.b);
                    dmae dmae0 = new dmae();
                    ggdy0.i(evql0.d(dmah.c, dmae0));
                }
                else {
                    ((ggtj)dmah.b.i()).z("getSePrepaidCardCount: Unknown SP %d", dyna0.a());
                }
            }
            gged_interceptors gged0 = ggdy0.h();
            evql evql2 = evrg.k(dmah.c, gged0);
            dmac dmac0 = new dmac();
            v = (int)(((Integer)evrg.n(evql2.d(dmah.c, dmac0))));
        }
        catch(ExecutionException | InterruptedException exception0) {
            a.ae(dmah.b.j(), "Could not fetch SE prepaid cards from local datastore", exception0);
            return false;
        }
        if((hjve0.c & 2) != 0 && v > (hjve0.e == null ? hftw.a : hjve0.e).b) {
            return false;
        }
        return (hjve0.c & 1) == 0 ? true : v >= (hjve0.d == null ? hftw.a : hjve0.d).b;
    }
}

