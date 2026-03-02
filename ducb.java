import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class ducb implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    private final doly f;
    private final domw g;
    private final dolg h;
    private final dxed i;
    private final dpsz j;

    public ducb(dolg dolg0, dpsz dpsz0, dxed dxed0, domw domw0, doly doly0) {
        this.f = doly0;
        this.g = domw0;
        this.j = dpsz0;
        this.h = dolg0;
        this.i = dxed0;
        dubz dubz0 = new dubz(dolg0);
        this.a = dubz0;
        duca duca0 = new duca(domw0);
        this.b = duca0;
        dlny dlny0 = new dlny(dlni.a, duca0);
        this.c = dlny0;
        efmg efmg0 = new efmg(dlni.a);
        this.d = efmg0;
        this.e = DoubleCheck.b(new dsol(dlni.a, dubz0, dlny0, efmg0));
    }

    final dmgi a() {
        dlnj.a();
        return new dmgi(this.h.d(), dmgy.a());
    }

    final dtph b() {
        return new dtph(this.a(), edob.a(dlnj.a()), new dtpi());
    }

    final dtpl c() {
        return new dtpl(this.h.a(), dmhh.b(dlnj.a(), this.h.d(), this.h.c(), dmgy.a(), null, Optional.empty()), this.i.a(), new dmkl(dlnj.a()));
    }

    final dtze d() {
        return new dtze(dlnj.a(), this.i.a());
    }

    final etgl e() {
        return new etgl(this.f.e());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dugz dugz0 = (dugz)object0;
        xni xni0 = this.f.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.j.a();
        dtpl dtpl0 = this.c();
        dual dual0 = new dual(this.j.a(), dmgy.a(), easn.a(), this.a(), new bblp(0x7FFFFFFF, 10));
        dtyl dtyl0 = new dtyl(dlnj.a(), this.h.a(), this.j.a());
        lps lps0 = this.f.d();
        dtph dtph0 = this.b();
        dtrf dtrf0 = new dtrf(bxuw.a(dlnj.a()), this.j.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), this.d(), this.h.d(), new dtrw(dlnj.a(), this.h.c(), dmgy.a()), this.c());
        dlnj.a();
        dlnj.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        dugz0.b = dvfi.a(new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, new dubj(this.e()), new dtyw(this.j.a(), this.d()))));
        dugz0.c = (dsok)this.e.get();
        dugz0.d = new edpk(dlnj.a());
        dugz0.ag = new DefaultPassInfoCallback();
        dugz0.ah = new dspv();
        dugz0.ai = this.g.a();
        tyb tyb0 = efmg.b(dlnj.a());
        this.h.d();
        dsok dsok0 = (dsok)this.e.get();
        this.d();
        dugz0.aj = new duit(tyb0, dsok0);
        dugz0.ak = new ebib(this.i.a(), this.j.a(), new duao());
        dugz0.al = this.b();
        dugz0.am = new frzk(this.e(), new frzh(), this.f.c(), this.f.a());
        dugz0.an = edpt.a(dlnj.a());
        dugz0.ay = this.i.a();
        dugz0.ao = this.d();
        dugz0.ap = new duay(this.i.a());
    }
}

