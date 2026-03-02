import android.accounts.Account;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.Lazy;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dxnl implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final dolg e;
    private final domv f;
    private final doma g;
    private final eefy h;

    public dxnl(doma doma0, eefy eefy0, dolg dolg0, domv domv0) {
        this.e = dolg0;
        this.f = domv0;
        this.g = doma0;
        this.h = eefy0;
        dxnk dxnk0 = new dxnk(domv0);
        this.a = dxnk0;
        dmkm dmkm0 = new dmkm(dxnk0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
    }

    final dmgi a() {
        this.f.a();
        return new dmgi(this.e.d(), dmgy.a());
    }

    final edlb b() {
        return edlc.b(new lso(domd.b(this.g)));
    }

    final fbio c() {
        return new fbio(this.f.a(), edtq.b(dxnl.d(), this.e.a()));
    }

    static final int d() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    final azts e() {
        return new azts(domd.b(this.g));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxme dxme0 = (dxme)object0;
        dxme0.au = this.e.a();
        dxme0.av = this.a();
        azts azts0 = this.e();
        du du0 = domf.a(this.g);
        Account account0 = this.e.a();
        fcfe fcfe0 = fcfo.d(this.f.a());
        String s = this.e.c();
        String s1 = this.e.d();
        String s2 = dmgy.a();
        Lazy lazy0 = DoubleCheck.a(dxyf.a);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dxme0.aw = new dqkk(azts0, du0, account0, new eefp(fcfe0, s, s1, s2, this.h.b, this.h.a, lazy0, bblp0));
        dxme0.aP = this.e();
        dxme0.ax = new efma(this.f.a());
        dxme0.ay = new dxte(dmhh.b(this.f.a(), this.e.d(), this.e.c(), dmgy.a(), null, Optional.empty()), this.c());
        dxme0.az = new dxup(domf.a(this.g), this.a());
        dxme0.aA = new dqjt(this.f.a(), domf.a(this.g));
        dxme0.aB = this.h.a;
        dxme0.aC = this.h.b;
        dxme0.aD = new DefaultPassInfoCallback();
        dxme0.aE = new dspv();
        fuot fuot0 = this.f.o();
        Preconditions.e(fuot0);
        dxme0.aF = fuot0;
        dxme0.b = new edtj(this.e.a(), this.c(), edtn.a(), dxnl.d());
        dxme0.c = edob.a(this.f.a());
        alh alh0 = alh.c(this.f.a());
        this.b();
        dxme0.d = new edky(alh0);
        dxme0.ag = (edrp)this.d.get();
        dxme0.ah = this.b();
        dxme0.ai = new frzk(new etgl(domd.b(this.g)), new frzh(), domf.a(this.g), domc.a(this.g));
        fhwk fhwk0 = this.f.i();
        Preconditions.e(fhwk0);
        dxme0.aj = fhwk0;
        dxme0.ak = new fuok();
    }
}

