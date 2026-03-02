import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.android.AndroidInjector;
import j..util.Optional;

final class dubx implements AndroidInjector {
    private final doly a;
    private final dolg b;
    private final dxed c;
    private final dpsz d;

    public dubx(dolg dolg0, dpsz dpsz0, dxed dxed0, doly doly0) {
        this.a = doly0;
        this.d = dpsz0;
        this.b = dolg0;
        this.c = dxed0;
    }

    final dmgi a() {
        dlnj.a();
        return new dmgi(this.b.d(), dmgy.a());
    }

    final dtph b() {
        return new dtph(this.a(), edob.a(dlnj.a()), new dtpi());
    }

    final dtpl c() {
        return new dtpl(this.b.a(), dmhh.b(dlnj.a(), this.b.d(), this.b.c(), dmgy.a(), null, Optional.empty()), this.c.a(), new dmkl(dlnj.a()));
    }

    final dtze d() {
        return new dtze(dlnj.a(), this.c.a());
    }

    final dual e() {
        return new dual(this.d.a(), dmgy.a(), easn.a(), this.a(), new bblp(0x7FFFFFFF, 10));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dugg dugg0 = (dugg)object0;
        dugg0.b = new DefaultPassInfoCallback();
        dugg0.c = new dspu();
        dugg0.d = new dspv();
        dugg0.ag = new fshk();
        dugg0.ah = new dspx();
        xni xni0 = this.a.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.d.a();
        dtpl dtpl0 = this.c();
        dual dual0 = this.e();
        dtyl dtyl0 = new dtyl(dlnj.a(), this.b.a(), this.d.a());
        lps lps0 = this.a.d();
        dtph dtph0 = this.b();
        dtrf dtrf0 = new dtrf(bxuw.a(dlnj.a()), this.d.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), this.d(), this.b.d(), new dtrw(dlnj.a(), this.b.c(), dmgy.a()), this.c());
        dlnj.a();
        dlnj.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        dugg0.ai = dvfi.a(new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, new dubj(new etgl(this.a.e())), new dtyw(this.d.a(), this.d()))));
        dugg0.aj = this.e();
        dugg0.ak = this.b();
        dugg0.al = new duay(this.c.a());
        dugg0.am = this.b.a();
        dugg0.an = new fuok();
        dugg0.ao = this.d();
    }
}

