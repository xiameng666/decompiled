import android.accounts.Account;
import j..util.Objects;

public final class aaln {
    public final ziu a;
    public final lqi b;
    public final lqd c;
    public final lqd d;
    public final lqd e;
    public final lqd f;
    public final fhrt g;
    public final lqi h;
    public final lqi i;
    public final zij j;
    public final zlg k;
    public aauf l;
    private final zes m;
    private final zes n;
    private final zes o;
    private final lqi p;
    private final lrf q;

    public aaln(zij zij0, zlg zlg0, ziu ziu0, zes zes0, zes zes1, zes zes2, fhrt fhrt0, lrf lrf0, aatb aatb0) {
        this.h = new lqi(fhru.a);
        this.j = zij0;
        this.k = zlg0;
        this.a = ziu0;
        this.m = zes0;
        this.n = zes1;
        this.o = zes2;
        this.g = fhrt0;
        this.q = lrf0;
        String s = (String)lrf0.d("accountName");
        if(s != null) {
            aatb0 = aaua.a(s);
        }
        lqi lqi0 = new lqi(aatb0);
        this.b = lqi0;
        this.c = lsa.c(lqi0, new aale(this));
        Objects.requireNonNull(ziu0);
        this.d = lsa.c(lqi0, new aalf(ziu0));
        this.l = (aauf)zes2.a(aatb0);
        lqi lqi1 = new lqi(zes0.a(aatb0));
        this.p = lqi1;
        this.i = new lqi(zes1.a(aatb0));
        this.e = lsa.c(lqi1, new aalg());
        this.f = lsa.c(lqi1, new aalh());
    }

    public final lqd a(grxw grxw0) {
        aali aali0 = new aali(this, grxw0);
        return lsa.c(this.b, aali0);
    }

    public final lqd b(grxw grxw0) {
        aall aall0 = new aall(this, grxw0);
        return lsa.c(this.b, aall0);
    }

    public final zho c(grxw grxw0) {
        aatb aatb0 = this.d();
        cchl.d();
        zho zho0 = (zho)this.k.b(aatb0, grxw0, this.g).ij();
        gftb.check(zho0);
        return zho0;
    }

    public final aatb d() {
        aatb aatb0 = (aatb)this.b.ij();
        gftb.check(aatb0);
        return aatb0;
    }

    public final void e() {
        zlg zlg0 = this.k;
        zjw zjw0 = zlg0.a;
        for(Object object0: zjw0.c.values()) {
            zho zho0 = (zho)((lqi)object0).ij();
            gftb.z(zho0, "ResourceInfo should never be null here.");
            ((lqi)object0).l(new zho((zho0.a.e == null ? grxw.a : zho0.a.e)));
        }
        for(Object object1: zjw0.a.values()) {
            ((lqi)object1).l(new zhq(false, false, null));
        }
        Objects.requireNonNull(zlg0.b);
        zlg0.a(new zle(zlg0.b));
    }

    public final void f(grxw grxw0, grxw grxw1) {
        zjk zjk0 = (zjk)this.p.ij();
        gftb.check(zjk0);
        zjk0.a(new zjo(grxw0, 1, grxw1, this.g));
    }

    public final void g(grxw grxw0) {
        zic zic0 = (zic)this.i.ij();
        gftb.check(zic0);
        ibuq.f(grxw0, "adviceResourceKey");
        zic0.a.add(grxw0);
        zic0.b.l(zic0.a);
    }

    public final void h(grxw grxw0) {
        aatb aatb0 = this.d();
        String s = aaus.a();
        this.k.a.g(aatb0, s, true);
        this.i(grxw0);
        this.k();
        this.l();
        zic zic0 = (zic)this.i.ij();
        gftb.check(zic0);
        zic0.a.clear();
        zic0.b.l(zic0.a);
        zic0.c.l(Boolean.valueOf(false));
    }

    public final void i(grxw grxw0) {
        aatb aatb0 = this.d();
        cchl.d();
        this.k.c(aatb0, grxw0, this.g);
    }

    public final void j() {
        aatb aatb0 = this.d();
        String s = aaus.a();
        this.k.a.g(aatb0, s, false);
    }

    public final void k() {
        ziu ziu0 = this.a;
        aatb aatb0 = this.d();
        if(ziu0 != null) {
            ziu0.b(aatb0);
        }
    }

    public final void l() {
        aatb aatb0 = this.d();
        if(!aaua.c(aatb0)) {
            return;
        }
        Account account0 = new Account(aatb0.b, "com.google");
        evqp evqp0 = new evqp();
        zig zig0 = new zig(this.j, evqp0, account0);
        this.j.a.execute(zig0);
        zih zih0 = new zih(this.j, aatb0);
        evqp0.a.b(zih0);
    }

    public final void m(String s) {
        aatb aatb0 = aaua.a(s);
        if(!hoju.p()) {
            this.b.l(aatb0);
        }
        Object object0 = this.m.a(aatb0);
        this.p.l(object0);
        Object object1 = this.n.a(aatb0);
        this.i.l(object1);
        this.l.b();
        this.l = (aauf)this.o.a(aatb0);
        this.q.e("accountName", aatb0.b);
        if(hoju.p()) {
            this.b.l(aatb0);
        }
        this.l();
    }

    public final void n(grxw grxw0, grxw grxw1) {
        zjk zjk0 = (zjk)this.p.ij();
        gftb.check(zjk0);
        zjk0.a(new zjo(grxw0, 2, grxw1, this.g));
    }
}

