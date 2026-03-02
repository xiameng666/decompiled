import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dnba implements AndroidInjector {
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
    final Provider l;
    final Provider m;
    private final domv n;
    private final dolg o;
    private final doly p;
    private final dxed q;
    private final eczw r;

    public dnba(dolg dolg0, dxed dxed0, eczw eczw0, doly doly0, edor edor0, domv domv0) {
        this.n = domv0;
        this.o = dolg0;
        this.p = doly0;
        this.q = dxed0;
        this.r = eczw0;
        this.a = DoubleCheck.b(edmr.a);
        dnau dnau0 = new dnau(dolg0);
        this.b = dnau0;
        dnaz dnaz0 = new dnaz(doly0);
        this.c = dnaz0;
        dnax dnax0 = new dnax(dxed0);
        this.d = dnax0;
        this.e = DoubleCheck.b(new dmsw(dnau0, dnaz0, dnax0));
        dnav dnav0 = new dnav(domv0);
        this.f = dnav0;
        edsf edsf0 = new edsf(dnav0);
        this.g = edsf0;
        dmkm dmkm0 = new dmkm(dnav0);
        this.h = dmkm0;
        dnaw dnaw0 = new dnaw(edor0);
        this.i = dnaw0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dnaw0);
        this.j = edrn0;
        this.k = DoubleCheck.b(new edrj(edrn0));
        dnay dnay0 = new dnay(doly0);
        this.l = dnay0;
        this.m = new dnfh(dnay0);
    }

    static final int a() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dnfc dnfc0 = (dnfc)object0;
        fhwk fhwk0 = this.n.i();
        Preconditions.e(fhwk0);
        dnfc0.b = fhwk0;
        dnfc0.c = this.n.j();
        dnfc0.d = this.n.g();
        Account account0 = this.o.a();
        du du0 = this.p.c();
        azts azts0 = this.q.a();
        etgl etgl0 = this.r.a();
        efma efma0 = new efma(this.n.a());
        fscg fscg0 = (fscg)this.a.get();
        edtj edtj0 = new edtj(this.o.a(), new fbio(this.n.a(), edtq.b(dnba.a(), this.o.a())), edtn.a(), dnba.a());
        Context context0 = this.n.a();
        this.n.a();
        dnpp dnpp0 = new dnpp(context0, new dmgi(this.o.d(), dmgy.a()));
        dmsv dmsv0 = (dmsv)this.e.get();
        edrk edrk0 = (edrk)this.k.get();
        domj domj0 = this.n.b();
        Preconditions.e(domj0);
        dnfc0.ag = new dmsn(account0, du0, azts0, etgl0, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj0);
        dnfc0.ah = this.m;
    }
}

