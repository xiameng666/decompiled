import android.accounts.Account;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.Lazy;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dxoe implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final dolg e;
    private final domv f;
    private final doma g;
    private final eefy h;

    public dxoe(doma doma0, eefy eefy0, dolg dolg0, domv domv0) {
        this.e = dolg0;
        this.f = domv0;
        this.g = doma0;
        this.h = eefy0;
        dxod dxod0 = new dxod(domv0);
        this.a = dxod0;
        dmkm dmkm0 = new dmkm(dxod0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
    }

    final dmgi a() {
        this.f.a();
        return new dmgi(this.e.d(), dmgy.a());
    }

    final azts b() {
        return new azts(domd.b(this.g));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxpy dxpy0 = (dxpy)object0;
        dxpy0.au = this.e.a();
        dxpy0.av = this.a();
        azts azts0 = this.b();
        du du0 = domf.a(this.g);
        Account account0 = this.e.a();
        fcfe fcfe0 = fcfo.d(this.f.a());
        String s = this.e.c();
        String s1 = this.e.d();
        String s2 = dmgy.a();
        Lazy lazy0 = DoubleCheck.a(dxyf.a);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dxpy0.aw = new dqkk(azts0, du0, account0, new eefp(fcfe0, s, s1, s2, this.h.b, this.h.a, lazy0, bblp0));
        dxpy0.aP = this.b();
        dxpy0.ax = new efma(this.f.a());
        dxpy0.ay = new dxte(dmhh.b(this.f.a(), this.e.d(), this.e.c(), dmgy.a(), null, Optional.empty()), new fbio(this.f.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), this.e.a())));
        dxpy0.az = new dxup(domf.a(this.g), this.a());
        dxpy0.aA = new dqjt(this.f.a(), domf.a(this.g));
        dxpy0.aB = this.h.a;
        dxpy0.aC = this.h.b;
        dxpy0.aD = new DefaultPassInfoCallback();
        dxpy0.aE = new dspv();
        fuot fuot0 = this.f.o();
        Preconditions.e(fuot0);
        dxpy0.aF = fuot0;
        dxpy0.b = (edrp)this.d.get();
        fhwk fhwk0 = this.f.i();
        Preconditions.e(fhwk0);
        dxpy0.c = fhwk0;
        dxpy0.d = new fuok();
    }
}

