import android.accounts.Account;
import android.content.Context;
import j..util.Iterator.-EL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ebsf {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public final String d;
    public final Context e;
    public Account f;
    public dypj g;
    public dypv h;
    public dytd i;
    public dyth j;
    public dxyx k;
    public String l;
    public ease m;
    public gmcg n;
    public gmcg o;
    public gmch p;
    public dmgi q;
    public bbng r;
    public ebwn s;
    public ebst t;
    public dyfi u;
    public Map v;
    public etgl w;
    private long x;

    static {
        ebsf.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebsf(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = s;
        this.e = context0;
    }

    public final Account a() {
        Account account0 = this.f;
        if(account0 != null) {
            return account0;
        }
        ibuq.j("account");
        return null;
    }

    public final dxyx b() {
        dxyx dxyx0 = this.k;
        if(dxyx0 != null) {
            return dxyx0;
        }
        ibuq.j("dataStoreProvider");
        return null;
    }

    public final dypj c() {
        dypj dypj0 = this.g;
        if(dypj0 != null) {
            return dypj0;
        }
        ibuq.j("seManager");
        return null;
    }

    public final dypv d() {
        dypv dypv0 = this.h;
        if(dypv0 != null) {
            return dypv0;
        }
        ibuq.j("rpcClient");
        return null;
    }

    public final dytd e() {
        dytd dytd0 = this.i;
        if(dytd0 != null) {
            return dytd0;
        }
        ibuq.j("sePrepaidCardManager");
        return null;
    }

    public final ebst f() {
        ebst ebst0 = this.t;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    public final ebwn g() {
        ebwn ebwn0 = this.s;
        if(ebwn0 != null) {
            return ebwn0;
        }
        ibuq.j("notificationManager");
        return null;
    }

    public final evql h(dyna dyna0, String s) {
        dytd dytd0 = this.e();
        dyff dyff0 = this.b.b == 3 ? ((dyff)this.b.c) : dyff.a;
        gurm gurm0 = gurm.b(dyff0.f) == null ? gurm.n : gurm.b(dyff0.f);
        long v = this.x;
        evql evql0 = dytd0.c.d();
        evql0.A(new dysm());
        dyso dyso0 = new dyso(dytd0, v, dyna0, gurm0);
        evql evql1 = evql0.d(dytd0.k, dyso0);
        dyri dyri0 = new dyri(dytd0, s, dyna0, v, gurm0);
        return evql1.f(dytd0.k, dyri0).d(this.k(), new ebsd(s, this, dyna0));
    }

    public final evql i(Iterator iterator0) {
        if(!iterator0.hasNext()) {
            return evrg.d(null);
        }
        Object object0 = iterator0.next();
        this.r();
        this.x = System.currentTimeMillis();
        return this.c().f().f(this.k(), new ebrq(this, ((dyey)object0))).f(this.k(), new ebsb(this, iterator0, ((dyey)object0)));
    }

    public final evql j(long v) {
        return edng.a(this.d().b()).f(this.k(), new ebrr(v, this));
    }

    public final gmcg k() {
        gmcg gmcg0 = this.n;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("backgroundExecutor");
        return null;
    }

    public final gmcg l() {
        gmcg gmcg0 = this.o;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public final String m() {
        String s = this.l;
        if(s != null) {
            return s;
        }
        ibuq.j("environment");
        return null;
    }

    public final void n(dyfk dyfk0, Iterator iterator0, evqp evqp0, int v) {
        ebst ebst0 = this.f();
        String s = this.a().name;
        ibuq.e(s, "name");
        ebst0.a(s, 204006);
        gmch gmch0 = this.p;
        if(gmch0 == null) {
            ibuq.j("scheduledExecutor");
            gmch0 = null;
        }
        fhqu.a(gmch0.g(new ebrs(this, dyfk0, v, iterator0, evqp0), hwsd.a.E().N() / ((long)v), TimeUnit.MILLISECONDS)).v(this.k(), new ebrt(this, iterator0, evqp0, dyfk0));
    }

    public final void o(dyfk dyfk0, Iterator iterator0) {
        dyfj dyfj0 = dyfj.b(dyfk0.e) == null ? dyfj.j : dyfj.b(dyfk0.e);
        ibuq.e(dyfj0, "getStatus(...)");
        dyna dyna0 = dyna.b(dyfk0.f) == null ? dyna.k : dyna.b(dyfk0.f);
        ibuq.e(dyna0, "getServiceProvider(...)");
        switch(dyfj0.ordinal()) {
            case 1: {
                this.p(1, dyna0);
                break;
            }
            case 2: {
                this.p(2, dyna0);
                break;
            }
            case 5: {
                this.p(3, dyna0);
                break;
            }
            case 6: {
                this.p(4, dyna0);
                break;
            }
            case 7: {
                this.p(5, dyna0);
                break;
            }
            case 8: {
                this.p(13, dyna0);
            }
        }
        dyfi dyfi0 = null;
        switch((dyfj.b(dyfk0.e) == null ? dyfj.j : dyfj.b(dyfk0.e)).ordinal()) {
            case 6: {
                dyfi dyfi3 = this.u;
                if(dyfi3 == null) {
                    ibuq.j("responseBuilder");
                    dyfi3 = null;
                }
                ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)dyfi3).N_build();
                ibuq.e(hftv1, "build(...)");
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dyfl)hftv1))).jf(5, null);
                hftp0.X(((ProtoLiteMessage)(((dyfl)hftv1))));
                dyfp dyfp0 = dyfo.a(((dyfi)hftp0));
                dyfp0.b();
                ibuq.f(dyfk0, "value");
                dyfp0.a.a(dyfk0);
                this.s(dyfp0.a());
                return;
            }
            case 1: 
            case 2: 
            case 5: 
            case 7: 
            case 8: {
                dyfi dyfi1 = this.u;
                if(dyfi1 == null) {
                    ibuq.j("responseBuilder");
                    dyfi1 = null;
                }
                dyfi1.a(dyfk0);
                if(!(dyfj.b(dyfk0.e) == null ? dyfj.j : dyfj.b(dyfk0.e)).equals(dyfj.b)) {
                    Iterator.-EL.forEachRemaining(iterator0, new ebrv(new ebrk(this)));
                }
                dyfi dyfi2 = this.u;
                if(dyfi2 == null) {
                    ibuq.j("responseBuilder");
                }
                else {
                    dyfi0 = dyfi2;
                }
                ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)dyfi0).N_build();
                ibuq.e(hftv0, "build(...)");
                this.s(((dyfl)hftv0));
            }
        }
    }

    public final void p(int v, dyna dyna0) {
        ebst ebst0 = this.f();
        String s = this.a().name;
        ibuq.e(s, "name");
        this.r();
        long v1 = System.currentTimeMillis() - this.x;
        gtni gtni0 = dypl.h(dyna0);
        ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
        dyff dyff0 = this.b.b == 3 ? ((dyff)this.b.c) : dyff.a;
        gurm gurm0 = gurm.b(dyff0.f) == null ? gurm.n : gurm.b(dyff0.f);
        ibuq.e(gurm0, "getOrigin(...)");
        ebst0.d(s, 0x31B5F, v1, v - 1, gtni0, gurm0);
    }

    public final void q(int v, long v1) {
        ebst ebst0 = this.f();
        String s = this.a().name;
        ibuq.e(s, "name");
        dyff dyff0 = this.b.b == 3 ? ((dyff)this.b.c) : dyff.a;
        gurm gurm0 = gurm.b(dyff0.f) == null ? gurm.n : gurm.b(dyff0.f);
        ibuq.e(gurm0, "getOrigin(...)");
        ebst0.d(s, 0x379B7, v1, v - 1, gtni.a, gurm0);
    }

    public final void r() {
        if(this.r != null) {
            return;
        }
        ibuq.j("clock");
    }

    private final void s(dyfl dyfl0) {
        frli frli0 = this.b().a(this.a(), this.m());
        dygd dygd0 = (dygd)frli0.a().get();
        ibvd ibvd0 = new ibvd();
        hfuo hfuo0 = dyfl0.b;
        ibuq.e(hfuo0, "getCardDownloadResultsList(...)");
        ibvd0.a = ibpo.at(hfuo0);
        int v = dyfl0.b.size();
        int v1 = (dygd0.d == null ? dyfl.a : dygd0.d).b.size();
        while(v < v1) {
            ((List)ibvd0.a).add((dygd0.d == null ? dyfl.a : dygd0.d).b.get(v));
            ++v;
        }
        ((glyq)frli0.b(new ebrw(new ebru(ibvd0)), this.l())).u();
        ease ease0 = this.m;
        if(ease0 == null) {
            ibuq.j("listenerManager");
            ease0 = null;
        }
        ease0.a();
    }
}

