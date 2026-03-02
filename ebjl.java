import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import j..util.Optional;

public final class ebjl {
    public static final bboh a;
    public final donp b;
    public dypj c;
    public gmcg d;
    public ebwl e;
    public static final int f;
    private final dyfv g;
    private final Context h;

    static {
        ebjl.a = bboh.b("Pay", bbcu.cZ);
        ebjl.f = 17;
    }

    public ebjl(dyfv dyfv0, donp donp0, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(context0, "context");
        super();
        this.g = dyfv0;
        this.b = donp0;
        this.h = context0;
    }

    public final ebwl a() {
        ebwl ebwl0 = this.e;
        if(ebwl0 != null) {
            return ebwl0;
        }
        ibuq.j("apiInvocationEventLogger");
        return null;
    }

    public final gmcg b() {
        gmcg gmcg0 = this.d;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("backgroundExecutor");
        return null;
    }

    public final void c() {
        dyfv dyfv0 = this.g;
        String s = dyfv0.d;
        ibuq.e(s, "getAccountName(...)");
        String s1 = eccr.b(this.h, s);
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        ibuq.c(s1);
        dola dola0 = dlmg.a(context0, s, s1);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        done done0 = new done();
        edop edop0 = new edop();
        new ebkf(dola0, new dmgr("com.google.android.gms"), done0, domv0, edop0).inject(this);
        dyfb dyfb0 = dyfv0.b == 10 ? ((dyfb)dyfv0.c) : dyfb.a;
        gtni gtni0 = dypl.h((dyna.b(dyfb0.b) == null ? dyna.k : dyna.b(dyfb0.b)));
        dypj dypj0 = this.c;
        if(dypj0 == null) {
            ibuq.j("seManager");
            dypj0 = null;
        }
        dyfb dyfb1 = dyfv0.b == 10 ? ((dyfb)dyfv0.c) : dyfb.a;
        dyna dyna0 = dyna.b(dyfb1.b) == null ? dyna.k : dyna.b(dyfb1.b);
        dyxo dyxo0 = new dyxo(dypj0.b, dyna0);
        evql evql0 = dypj0.b.d(new dywk(dyxo0, Optional.empty(), hhag.P));
        evql0.y(this.b(), new ebjj(new ebji(this, gtni0)));
        evql0.v(this.b(), new ebjk(this, gtni0));
    }
}

