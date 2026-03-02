import android.accounts.Account;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dnad implements AndroidInjector {
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
    private final doly m;
    private final domv n;
    private final domw o;
    private final dxed p;
    private final eczw q;

    public dnad(dolg dolg0, dxed dxed0, eczw eczw0, domw domw0, doly doly0, edor edor0, domv domv0) {
        this.l = dolg0;
        this.m = doly0;
        this.n = domv0;
        this.o = domw0;
        this.p = dxed0;
        this.q = eczw0;
        this.a = DoubleCheck.b(edmr.a);
        dmzy dmzy0 = new dmzy(dolg0);
        this.b = dmzy0;
        dnac dnac0 = new dnac(doly0);
        this.c = dnac0;
        dnab dnab0 = new dnab(dxed0);
        this.d = dnab0;
        this.e = DoubleCheck.b(new dmsw(dmzy0, dnac0, dnab0));
        dmzz dmzz0 = new dmzz(domv0);
        this.f = dmzz0;
        edsf edsf0 = new edsf(dmzz0);
        this.g = edsf0;
        dmkm dmkm0 = new dmkm(dmzz0);
        this.h = dmkm0;
        dnaa dnaa0 = new dnaa(edor0);
        this.i = dnaa0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dnaa0);
        this.j = edrn0;
        this.k = DoubleCheck.b(new edrj(edrn0));
    }

    final tyb a() {
        return efmh.b(this.m.c());
    }

    final dmgi b() {
        this.n.a();
        return new dmgi(this.l.d(), dmgy.a());
    }

    final dnpp c() {
        return new dnpp(this.n.a(), this.b());
    }

    static final int d() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmwr dmwr0 = (dmwr)object0;
        dmwr0.b = this.l.a();
        du du0 = this.m.c();
        tyb tyb0 = this.a();
        dnpp dnpp0 = this.c();
        Account account0 = this.l.a();
        fhwk fhwk0 = this.n.i();
        Preconditions.e(fhwk0);
        dmwr0.c = new dmuy(du0, tyb0, dnpp0, account0, fhwk0, this.n.g());
        dmwr0.d = this.c();
        dmwr0.ag = this.a();
        dmwr0.ah = new dmet(this.n.a(), this.l.a(), this.l.c(), new bblp(1, 10));
        Account account1 = this.l.a();
        du du1 = this.m.c();
        azts azts0 = this.p.a();
        etgl etgl0 = this.q.a();
        efma efma0 = new efma(this.n.a());
        fscg fscg0 = (fscg)this.a.get();
        edtj edtj0 = new edtj(this.l.a(), new fbio(this.n.a(), edtq.b(dnad.d(), this.l.a())), edtn.a(), dnad.d());
        dnpp dnpp1 = this.c();
        dmsv dmsv0 = (dmsv)this.e.get();
        edrk edrk0 = (edrk)this.k.get();
        domj domj0 = this.n.b();
        Preconditions.e(domj0);
        dmwr0.ai = new dmsn(account1, du1, azts0, etgl0, efma0, fscg0, edtj0, dnpp1, dmsv0, edrk0, domj0);
        dmwr0.aj = new eeaw(new azts(this.m.e(), null), this.l.d(), this.l.c(), this.l.e(), this.q.a(), new edse(this.n.a()));
        fhwk fhwk1 = this.n.i();
        Preconditions.e(fhwk1);
        dmwr0.ak = fhwk1;
        dmwr0.al = this.n.j();
        dmwr0.am = this.b();
        dmwr0.an = this.n.g();
        dmwr0.ao = new fuok();
    }
}

