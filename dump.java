import dagger.android.AndroidInjector;
import j..util.Optional;

final class dump implements AndroidInjector {
    private final doly a;
    private final dolg b;
    private final dxed c;
    private final dpsz d;

    public dump(dolg dolg0, dpsz dpsz0, dxed dxed0, doly doly0) {
        this.a = doly0;
        this.d = dpsz0;
        this.b = dolg0;
        this.c = dxed0;
    }

    final dmgi a() {
        dlnj.a();
        return new dmgi(this.b.d(), dmgy.a());
    }

    final dtpl b() {
        return new dtpl(this.b.a(), dmhh.b(dlnj.a(), this.b.d(), this.b.c(), dmgy.a(), null, Optional.empty()), this.c.a(), new dmkl(dlnj.a()));
    }

    final dtze c() {
        return new dtze(dlnj.a(), this.c.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duqq duqq0 = (duqq)object0;
        xni xni0 = this.a.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.d.a();
        dtpl dtpl0 = this.b();
        dual dual0 = new dual(this.d.a(), dmgy.a(), easn.a(), this.a(), new bblp(0x7FFFFFFF, 10));
        dtyl dtyl0 = new dtyl(dlnj.a(), this.b.a(), this.d.a());
        lps lps0 = this.a.d();
        dtph dtph0 = new dtph(this.a(), edob.a(dlnj.a()), new dtpi());
        dtrf dtrf0 = new dtrf(bxuw.a(dlnj.a()), this.d.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), this.c(), this.b.d(), new dtrw(dlnj.a(), this.b.c(), dmgy.a()), this.b());
        dlnj.a();
        dlnj.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        duqq0.b = dvfi.a(new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, new dubj(new etgl(this.a.e())), new dtyw(this.d.a(), this.c()))));
        duqq0.c = this.c();
        duqq0.d = new fuok();
    }
}

