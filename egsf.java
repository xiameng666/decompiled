import android.content.ContentResolver;

public final class egsf implements lqj {
    public final egsq a;

    public egsf(egsq egsq0) {
        this.a = egsq0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        egsq egsq0 = this.a;
        egsq0.G(3, ((evql)object0));
        if(egsq0.aq.i()) {
            ((egik)egsq0.aq.d()).a.a(bbdg.fe);
        }
        if(((evql)object0).n()) {
            ContentResolver.cancelSync(egsq0.b, "com.android.contacts");
            egsq0.I(10, false);
            egsq0.an.k(egsq0);
            egsq0.an = egsq0.c.e;
            egsq0.an.g(egsq0, new egsh(egsq0));
            egsq0.A();
            return;
        }
        if(egsq0.at) {
            egsq0.ah.c(true);
        }
        egsq0.F();
    }
}

