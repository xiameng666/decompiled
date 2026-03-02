import android.accounts.Account;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class cqal implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public cqal(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public final fkwn a() {
        gpgz gpgz0 = (gpgz)this.a.get();
        cqao cqao0 = (cqao)this.c.get();
        iakr iakr0 = gpgz0.a(gsxk.ac);
        gste gste0 = (gste)gste.f(new gstd(), iakr0);
        gphs gphs0 = new gphs(((Account)((InstanceFactory)this.b).a).name, "google");
        gste gste1 = (gste)gste0.q(gphs.a, gphs0);
        hvev hvev0 = hvev.a;
        glvr glvr0 = null;
        if(bbod.c(hvev0.b().b())) {
            gpie gpie0 = new gpie(null);
            gpie0.b(ggfp.G(hvev0.b().e().b));
            gpig gpig0 = new gpig(gpie0.a());
            gste1 = (gste)gste1.q(gpji.g, gpig0);
        }
        String s = hvev0.b().f();
        int v = (int)hvev0.b().a();
        if(!s.isEmpty()) {
            if(v == -1) {
                glvr0 = glvr.b(s);
                gftb.f(((boolean)(glvr0.c() ^ 1)), "Host has a port: %s", s);
            }
            else {
                glvr0 = glvr.a(s, v);
            }
        }
        if(glvr0 != null) {
            gste1 = (gste)gste1.q(gpho.a, glvr0.toString());
        }
        return new cpzz(gste1, cqao0);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

