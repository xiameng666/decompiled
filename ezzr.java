import android.content.Context;

final class ezzr {
    public static final ezyi a(Context context0, boolean z) {
        faab.e(context0);
        fage fage0 = fagt.a;
        fagt fagt0 = (fagt)fage0.b();
        fagl fagl0 = ezyq.d;
        int v = (int)(((Integer)fagt0.b(fagl0)));
        if(Long.compare(v, ((Long)ezwo.c(hvzv.j, Long.class)).longValue()) >= 0) {
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        ezzb ezzb0 = new ezzb();
        ezzb0.f(((Long)ezwo.c(hvzv.i, Long.class)).longValue(), hvzt.a.g().m());
        ezzb0.g(hvzt.a.g().b());
        ezzb0.c(true);
        ezzb0.h(v);
        ezzb0.d((z ? "streaming-download" : "non-streaming-download"), fagj.b(new fagh[0]));
        ezzb0.e(gfsx.m(ezyy.g()));
        ezyi ezyi0 = ezzb0.a();
        ((fagt)fage0.b()).e(new fagh[]{new fagh(fagl0, ((int)(v + 1)))});
        return ezyi0;
    }
}

