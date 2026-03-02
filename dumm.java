import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class dumm implements AndroidInjector {
    final Provider a;
    final Provider b;
    private final doly c;
    private final dolg d;
    private final dxed e;
    private final dpsz f;

    public dumm(dolg dolg0, dpsz dpsz0, dxed dxed0, doly doly0) {
        this.c = doly0;
        this.f = dpsz0;
        this.d = dolg0;
        this.e = dxed0;
        cjkz cjkz0 = new cjkz(dlni.a);
        this.a = cjkz0;
        this.b = new cjlw(dlni.a, cjkz0);
    }

    final dmgi a() {
        dlnj.a();
        return new dmgi(this.d.d(), dmgy.a());
    }

    final dtpl b() {
        return new dtpl(this.d.a(), dmhh.b(dlnj.a(), this.d.d(), this.d.c(), dmgy.a(), null, Optional.empty()), this.e.a(), new dmkl(dlnj.a()));
    }

    final dtze c() {
        return new dtze(dlnj.a(), this.e.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duov duov0 = (duov)object0;
        xni xni0 = this.c.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.f.a();
        dtpl dtpl0 = this.b();
        dual dual0 = new dual(this.f.a(), dmgy.a(), easn.a(), this.a(), new bblp(0x7FFFFFFF, 10));
        dtyl dtyl0 = new dtyl(dlnj.a(), this.d.a(), this.f.a());
        lps lps0 = this.c.d();
        dtph dtph0 = new dtph(this.a(), edob.a(dlnj.a()), new dtpi());
        dtrf dtrf0 = new dtrf(bxuw.a(dlnj.a()), this.f.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), this.c(), this.d.d(), new dtrw(dlnj.a(), this.d.c(), dmgy.a()), this.b());
        dlnj.a();
        dlnj.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        duov0.b = dvfi.a(new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, new dubj(new etgl(this.c.e())), new dtyw(this.f.a(), this.c()))));
        duov0.c = new dtqm(this.f.a());
        duov0.d = this.c();
        duov0.ag = DoubleCheck.a(this.b);
    }
}

