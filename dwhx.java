import android.accounts.Account;
import android.app.KeyguardManager;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dwhx implements AndroidInjector {
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
    private final dolg o;
    private final domv p;
    private final dxed q;

    public dwhx(dolg dolg0, dxed dxed0, domw domw0, domv domv0) {
        this.o = dolg0;
        this.p = domv0;
        this.q = dxed0;
        dwht dwht0 = new dwht(domv0);
        this.a = dwht0;
        this.b = new edoc(dwht0);
        this.c = new edod(dwht0);
        dwhs dwhs0 = new dwhs(dolg0);
        this.d = dwhs0;
        dwhv dwhv0 = new dwhv(domw0);
        this.e = dwhv0;
        dlny dlny0 = new dlny(dwht0, dwhv0);
        this.f = dlny0;
        efmg efmg0 = new efmg(dwht0);
        this.g = efmg0;
        Provider provider0 = DoubleCheck.b(new dsol(dwht0, dwhs0, dlny0, efmg0));
        this.h = provider0;
        dwhw dwhw0 = new dwhw(domv0);
        this.i = dwhw0;
        dwhu dwhu0 = new dwhu(domv0);
        this.j = dwhu0;
        this.k = new dxcu(dwht0, provider0, dwhw0, dwhu0);
        dmkm dmkm0 = new dmkm(dwht0);
        this.l = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.m = edrr0;
        this.n = DoubleCheck.b(new edrz(edrr0));
    }

    final KeyguardManager a() {
        return edob.a(this.p.a());
    }

    final ednx b() {
        return new ednx(this.a(), this.b, this.c);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwjx dwjx0 = (dwjx)object0;
        dwjx0.b = this.o.a();
        dwjx0.c = this.p.a();
        dwjx0.d = this.b();
        KeyguardManager keyguardManager0 = this.a();
        ednx ednx0 = this.b();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dwjx0.ag = new edoa(this.c, keyguardManager0, ednx0, bblp0);
        dwjx0.am = this.q.a();
        dwjx0.ah = new edoi(this.q.a(), this.b());
        dwjx0.av = DoubleCheck.a(this.k);
        dwjx0.aw = new fuok();
        dwjx0.ax = new edon(this.p.a());
        dwjx0.ay = new efma(this.p.a());
        dwjx0.az = (dsok)this.h.get();
        dwjx0.aA = this.p.j();
        fhwk fhwk0 = this.p.i();
        Preconditions.e(fhwk0);
        dwjx0.aB = fhwk0;
        dwjx0.aC = this.p.g();
        domj domj0 = this.p.b();
        Preconditions.e(domj0);
        dwjx0.aD = domj0;
        dwjx0.aE = this.p.h();
        azts azts0 = this.q.a();
        Account account0 = this.o.a();
        dvgq dvgq0 = new dvgq(dmhh.b(this.p.a(), this.o.d(), this.o.c(), dmgy.a(), null, Optional.empty()), dvga.b(((edrp)this.n.get())), new dmkl(this.p.a()));
        domj domj1 = this.p.b();
        Preconditions.e(domj1);
        dwjx0.aF = new dwkm(azts0, account0, dvgq0, domj1);
    }
}

