import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dvrh implements AndroidInjector {
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
    private final doly o;
    private final dolg p;
    private final domv q;

    public dvrh(dolg dolg0, doly doly0, domv domv0) {
        this.o = doly0;
        this.p = dolg0;
        this.q = domv0;
        dvre dvre0 = new dvre(domv0);
        this.a = dvre0;
        dmkm dmkm0 = new dmkm(dvre0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
        dvrg dvrg0 = new dvrg(doly0);
        this.g = dvrg0;
        dvrc dvrc0 = new dvrc(dvrg0);
        this.h = dvrc0;
        dvrd dvrd0 = new dvrd(dolg0);
        this.i = dvrd0;
        dmgj dmgj0 = new dmgj(dvre0, dvrd0);
        this.j = dmgj0;
        dvrf dvrf0 = new dvrf(domv0);
        this.k = dvrf0;
        dsod dsod0 = new dsod(dvre0);
        this.l = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.m = dspi0;
        this.n = DoubleCheck.b(new dsny(dvre0, dvrc0, dvrd0, dmgj0, dvrf0, dspi0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvyb dvyb0 = (dvyb)object0;
        du du0 = this.o.c();
        eeaw eeaw0 = new eeaw(new azts(this.o.e(), null), this.p.d(), this.p.c(), this.p.e(), new etgl(this.q.a()), new edse(this.q.a()));
        xni xni0 = this.o.e();
        edrp edrp0 = (edrp)this.d.get();
        edsh edsh0 = (edsh)this.f.get();
        this.q.a();
        dvyb0.b = new eeej(du0, eeaw0, xni0, edrp0, edsh0, new dmgi(this.p.d(), dmgy.a()));
        dvyb0.c = (dsnx)this.n.get();
        fhwk fhwk0 = this.q.i();
        Preconditions.e(fhwk0);
        dvyb0.d = fhwk0;
        dvyb0.ag = new dspv();
        dvyb0.ah = new dspx();
    }
}

