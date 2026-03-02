import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.fops.details.FopDetailsFragment;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

public final class dnbg implements AndroidInjector {
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
    final Provider n;
    final Provider o;
    final Provider p;
    private final doly q;
    private final domv r;
    private final dolg s;
    private final dxed t;
    private final domw u;
    private final edor v;
    private final eczw w;

    public dnbg(dolg dolg0, dxed dxed0, eczw eczw0, domw domw0, doly doly0, edor edor0, domv domv0) {
        this.q = doly0;
        this.r = domv0;
        this.s = dolg0;
        this.t = dxed0;
        this.w = eczw0;
        this.u = domw0;
        this.v = edor0;
        this.a = DoubleCheck.b(edmr.a);
        dnbb dnbb0 = new dnbb(dolg0);
        this.b = dnbb0;
        dnbf dnbf0 = new dnbf(doly0);
        this.c = dnbf0;
        dnbe dnbe0 = new dnbe(dxed0);
        this.d = dnbe0;
        this.e = DoubleCheck.b(new dmsw(dnbb0, dnbf0, dnbe0));
        dnbc dnbc0 = new dnbc(domv0);
        this.f = dnbc0;
        edsf edsf0 = new edsf(dnbc0);
        this.g = edsf0;
        dmkm dmkm0 = new dmkm(dnbc0);
        this.h = dmkm0;
        dnbd dnbd0 = new dnbd(edor0);
        this.i = dnbd0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dnbd0);
        this.j = edrn0;
        this.k = DoubleCheck.b(new edrj(edrn0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.l = edsk0;
        this.m = DoubleCheck.b(new edsc(edsk0));
        edqs edqs0 = new edqs(dmkm0);
        this.n = edqs0;
        Provider provider0 = DoubleCheck.b(new edru(edqs0));
        this.o = provider0;
        this.p = DoubleCheck.b(new edrt(provider0));
    }

    final dmsn a() {
        Account account0 = this.s.a();
        du du0 = this.q.c();
        azts azts0 = this.t.a();
        etgl etgl0 = this.w.a();
        efma efma0 = this.c();
        fscg fscg0 = (fscg)this.a.get();
        edtj edtj0 = new edtj(this.s.a(), new fbio(this.r.a(), edtq.b(dnbg.d(), this.s.a())), edtn.a(), dnbg.d());
        dnpp dnpp0 = this.b();
        dmsv dmsv0 = (dmsv)this.e.get();
        edrk edrk0 = (edrk)this.k.get();
        domj domj0 = this.r.b();
        Preconditions.e(domj0);
        return new dmsn(account0, du0, azts0, etgl0, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj0);
    }

    final dnpp b() {
        Context context0 = this.r.a();
        this.r.a();
        return new dnpp(context0, new dmgi(this.s.d(), dmgy.a()));
    }

    final efma c() {
        return new efma(this.r.a());
    }

    static final int d() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        FopDetailsFragment fopDetailsFragment0 = (FopDetailsFragment)object0;
        du du0 = this.q.c();
        dmhi dmhi0 = dmhh.b(this.r.a(), this.s.d(), this.s.c(), dmgy.a(), null, Optional.empty());
        dmsn dmsn0 = this.a();
        dmkl dmkl0 = new dmkl(this.r.a());
        dmet dmet0 = new dmet(this.r.a(), this.s.a(), this.s.c(), new bblp(1, 10));
        tyb tyb0 = efmh.b(this.q.c());
        dnpp dnpp0 = this.b();
        efma efma0 = this.c();
        etgl etgl0 = this.w.a();
        dmtl dmtl0 = new dmtl(this.q.c(), this.t.a(), this.c(), this.s.a(), this.b(), ((edsh)this.m.get()));
        fuot fuot0 = this.r.o();
        Preconditions.e(fuot0);
        Account account0 = this.s.a();
        edoq edoq0 = this.v.a();
        edrk edrk0 = (edrk)this.k.get();
        Boolean boolean0 = (Boolean)this.p.get();
        fopDetailsFragment0.b = new dnjs(du0, dmhi0, dmsn0, dmkl0, dmet0, tyb0, dnpp0, efma0, etgl0, dmtl0, fuot0, account0, edoq0, edrk0, this.s.e());
        fopDetailsFragment0.c = this.b();
        fopDetailsFragment0.d = this.a();
        fopDetailsFragment0.ag = new fuok();
        fhwk fhwk0 = this.r.i();
        Preconditions.e(fhwk0);
        fopDetailsFragment0.ah = fhwk0;
    }
}

