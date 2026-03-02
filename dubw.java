import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class dubw implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    private final doly f;
    private final dolg g;
    private final dxed h;
    private final dpsz i;

    public dubw(dolg dolg0, dpsz dpsz0, dxed dxed0, doly doly0) {
        this.f = doly0;
        this.i = dpsz0;
        this.g = dolg0;
        this.h = dxed0;
        dmkm dmkm0 = new dmkm(dlni.a);
        this.a = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.b = edrr0;
        this.c = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.d = edsk0;
        this.e = DoubleCheck.b(new edsc(edsk0));
    }

    final dmgi a() {
        dlnj.a();
        return new dmgi(this.g.d(), dmgy.a());
    }

    final dtph b() {
        return new dtph(this.a(), edob.a(dlnj.a()), new dtpi());
    }

    final dtpl c() {
        return new dtpl(this.g.a(), dmhh.b(dlnj.a(), this.g.d(), this.g.c(), dmgy.a(), null, Optional.empty()), this.h.a(), new dmkl(dlnj.a()));
    }

    final dtze d() {
        return new dtze(dlnj.a(), this.h.a());
    }

    final etgl e() {
        return new etgl(this.f.e());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dufr dufr0 = (dufr)object0;
        xni xni0 = this.f.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.i.a();
        dtpl dtpl0 = this.c();
        dual dual0 = new dual(this.i.a(), dmgy.a(), easn.a(), this.a(), new bblp(0x7FFFFFFF, 10));
        dtyl dtyl0 = new dtyl(dlnj.a(), this.g.a(), this.i.a());
        lps lps0 = this.f.d();
        dtph dtph0 = this.b();
        dtrf dtrf0 = new dtrf(bxuw.a(dlnj.a()), this.i.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), this.d(), this.g.d(), new dtrw(dlnj.a(), this.g.c(), dmgy.a()), this.c());
        dlnj.a();
        dlnj.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        dufr0.c = dvfi.a(new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, new dubj(this.e()), new dtyw(this.i.a(), this.d()))));
        dufr0.as = this.h.a();
        dufr0.d = this.g.a();
        dufr0.ag = new frzk(this.e(), new frzh(), this.f.c(), this.f.a());
        dufr0.ah = this.b();
        dufr0.ai = this.d();
        dufr0.aj = new eeej(this.f.c(), new eeaw(new azts(this.f.e(), null), this.g.d(), this.g.c(), this.g.e(), this.e(), new edse(dlnj.a())), this.f.e(), ((edrp)this.c.get()), ((edsh)this.e.get()), this.a());
    }
}

