import android.app.KeyguardManager;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class dumo implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final doly d;
    private final dolg e;
    private final dxed f;
    private final dpsz g;

    public dumo(dolg dolg0, dpsz dpsz0, dxed dxed0, doly doly0) {
        this.d = doly0;
        this.g = dpsz0;
        this.e = dolg0;
        this.f = dxed0;
        dmkm dmkm0 = new dmkm(dlni.a);
        this.a = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.b = edrr0;
        this.c = DoubleCheck.b(new edrz(edrr0));
    }

    final lso a() {
        xni xni0 = this.d.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.g.a();
        dtpl dtpl0 = this.d();
        dual dual0 = new dual(this.g.a(), dmgy.a(), easn.a(), this.b(), new bblp(0x7FFFFFFF, 10));
        dtyl dtyl0 = new dtyl(dlnj.a(), this.e.a(), this.g.a());
        lps lps0 = this.d.d();
        dtph dtph0 = this.c();
        dtrf dtrf0 = new dtrf(bxuw.a(dlnj.a()), this.g.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), this.e(), this.e.d(), new dtrw(dlnj.a(), this.e.c(), dmgy.a()), this.d());
        dlnj.a();
        dlnj.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        return new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, new dubj(new etgl(this.d.e())), new dtyw(this.g.a(), this.e())));
    }

    final dmgi b() {
        dlnj.a();
        return new dmgi(this.e.d(), dmgy.a());
    }

    final dtph c() {
        return new dtph(this.b(), dumo.f(), new dtpi());
    }

    final dtpl d() {
        return new dtpl(this.e.a(), dmhh.b(dlnj.a(), this.e.d(), this.e.c(), dmgy.a(), null, Optional.empty()), this.f.a(), new dmkl(dlnj.a()));
    }

    final dtze e() {
        return new dtze(dlnj.a(), this.f.a());
    }

    static final KeyguardManager f() {
        return edob.a(dlnj.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duqg duqg0 = (duqg)object0;
        duqg0.b = dvfi.a(this.a());
        alh alh0 = alh.c(dlnj.a());
        edlc.b(this.a());
        duqg0.c = new edky(alh0);
        duqg0.d = dumo.f();
        duqg0.ag = this.g.a();
        duqg0.ah = new bawz(dlnj.a());
        duqg0.ai = new dttm();
        duqg0.aj = new dtqm(this.g.a());
        duqg0.ak = new dtzg(dmgy.a(), edtn.a());
        duqg0.al = this.c();
        duqg0.am = efmh.b(this.d.c());
        duqg0.an = new fuok();
        duqg0.ao = this.e();
        duqg0.ap = this.d();
        duqg0.aq = new duay(this.f.a());
        duqg0.ar = (edrp)this.c.get();
    }
}

