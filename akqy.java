import android.content.Context;

public final class akqy {
    public final fjcv a;
    private static akqy b;

    static {
    }

    private akqy(fjcv fjcv0) {
        this.a = fjcv0;
    }

    public static akqy a(Context context0) {
        synchronized(akqy.class) {
            if(akqy.b == null) {
                fkfh fkfh0 = new fkfh(context0);
                bblp bblp0 = new bblp(0x7FFFFFFF, 10);
                fkfd fkfd0 = new fkfd(new fgvy(), bblp0);
                gged_interceptors gged0 = gged_interceptors.l(new ccsd(new frcc(new frcb(context0))));
                gged_interceptors gged1 = gged_interceptors.m(fkfh0, fkfd0);
                frbx frbx0 = new frbx(gged0, ggna.a, gged1);
                gful_cronetEngineProvider gful0 = cjjt.b(context0, frbx0, gfqx.a);
                akqw akqw0 = new akqw();
                fjcx fjcx0 = new fjcx();
                fjcx0.d(context0);
                fjcx0.e(bblp0);
                fjcx0.f(gful0);
                fjcx0.b = frbx0;
                fjcx0.c = fkfh0;
                fjcx0.d = gfsx.m(fkfd0);
                fjcx0.e = cjtb.a;
                fjcx0.k = gfsx.m(akqw0);
                akqy.b = new akqy(fjcx0.a());
            }
        }
        return akqy.b;
    }
}

