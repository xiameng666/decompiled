import android.accounts.Account;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dmds implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    final Provider j;
    final Provider k;
    private final dolg l;
    private final edor m;
    private final domv n;
    private final doly o;
    private final dxed p;
    private final eczw q;

    public dmds(dolg dolg0, dxed dxed0, eczw eczw0, doly doly0, edor edor0, domv domv0) {
        this.l = dolg0;
        this.m = edor0;
        this.n = domv0;
        this.o = doly0;
        this.p = dxed0;
        this.q = eczw0;
        this.a = DoubleCheck.b(edmr.a);
        dmdn dmdn0 = new dmdn(dolg0);
        this.b = dmdn0;
        dmdr dmdr0 = new dmdr(doly0);
        this.c = dmdr0;
        dmdq dmdq0 = new dmdq(dxed0);
        this.d = dmdq0;
        this.e = DoubleCheck.b(new dmsw(dmdn0, dmdr0, dmdq0));
        dmdo dmdo0 = new dmdo(domv0);
        this.f = dmdo0;
        edsf edsf0 = new edsf(dmdo0);
        this.g = edsf0;
        dmkm dmkm0 = new dmkm(dmdo0);
        this.h = dmkm0;
        dmdp dmdp0 = new dmdp(edor0);
        this.i = dmdp0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dmdp0);
        this.j = edrn0;
        this.k = DoubleCheck.b(new edrj(edrn0));
    }

    final dmgi a() {
        this.n.a();
        return new dmgi(this.l.d(), dmgy.a());
    }

    static final int b() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmdm dmdm0 = (dmdm)object0;
        dmdm0.b = this.l.a();
        dmdm0.c = this.m.a();
        dmdm0.d = new dmdt(this.a());
        Account account0 = this.l.a();
        du du0 = this.o.c();
        azts azts0 = this.p.a();
        etgl etgl0 = this.q.a();
        efma efma0 = new efma(this.n.a());
        fscg fscg0 = (fscg)this.a.get();
        edtj edtj0 = new edtj(this.l.a(), new fbio(this.n.a(), edtq.b(dmds.b(), this.l.a())), edtn.a(), dmds.b());
        dnpp dnpp0 = new dnpp(this.n.a(), this.a());
        dmsv dmsv0 = (dmsv)this.e.get();
        edrk edrk0 = (edrk)this.k.get();
        domj domj0 = this.n.b();
        Preconditions.e(domj0);
        dmdm0.ag = new dmsn(account0, du0, azts0, etgl0, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj0);
        dmdm0.ah = new cjlv(this.n.a(), new cjky(this.n.a()));
    }
}

