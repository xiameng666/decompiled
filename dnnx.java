import android.accounts.Account;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dnnx implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final doly h;
    private final domv i;
    private final dolg j;
    private final domw k;
    private final dxed l;
    private final edor m;

    public dnnx(dolg dolg0, dxed dxed0, domw domw0, doly doly0, edor edor0, domv domv0) {
        this.h = doly0;
        this.i = domv0;
        this.j = dolg0;
        this.k = domw0;
        this.l = dxed0;
        this.m = edor0;
        dnnv dnnv0 = new dnnv(domv0);
        this.a = dnnv0;
        dmkm dmkm0 = new dmkm(dnnv0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
        this.g = new dnnw(dolg0);
    }

    final dmgi a() {
        this.i.a();
        return new dmgi(this.j.d(), dmgy.a());
    }

    final dnpp b() {
        return new dnpp(this.i.a(), this.a());
    }

    final etgl c() {
        return new etgl(this.h.e());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dnph dnph0 = (dnph)object0;
        du du0 = this.h.c();
        dmet dmet0 = new dmet(this.i.a(), this.j.a(), this.j.c(), new bblp(1, 10));
        tyb tyb0 = efmh.b(this.h.c());
        Account account0 = this.j.a();
        azts azts0 = this.l.a();
        etgl etgl0 = this.c();
        dnpp dnpp0 = this.b();
        edoq edoq0 = this.m.a();
        fhwk fhwk0 = this.i.i();
        Preconditions.e(fhwk0);
        dnph0.c = new dnoj(du0, dmet0, tyb0, account0, azts0, etgl0, dnpp0, edoq0, fhwk0, this.i.g());
        dnph0.d = new eeej(this.h.c(), new eeaw(new azts(this.h.e(), null), this.j.d(), this.j.c(), this.j.e(), this.c(), new edse(this.i.a())), this.h.e(), ((edrp)this.d.get()), ((edsh)this.f.get()), this.a());
        dnph0.ag = new fuok();
        dnph0.ah = new dnon(this.l.a(), this.c(), this.j.a());
        dnph0.ai = new dnoo(this.i.a());
        dnph0.aj = this.b();
        fhwk fhwk1 = this.i.i();
        Preconditions.e(fhwk1);
        dnph0.ak = fhwk1;
        dnph0.aq = new fscn(new fscp(this.i.a(), new fscu(this.i.a())), new fscl(this.l.a()));
        dnph0.al = this.i.g();
        dnph0.am = this.j.a();
        dnph0.an = this.g;
    }
}

