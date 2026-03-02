import android.accounts.Account;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dvzu implements AndroidInjector {
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
    final Provider o;
    final Provider p;
    final Provider q;
    final Provider r;
    final Provider s;
    final Provider t;
    private final doly u;
    private final domv v;
    private final dolg w;
    private final dxed x;

    public dvzu(dolg dolg0, dxed dxed0, edlf edlf0, doly doly0, edor edor0, domv domv0) {
        this.u = doly0;
        this.v = domv0;
        this.w = dolg0;
        this.x = dxed0;
        dvzn dvzn0 = new dvzn(dolg0);
        this.a = dvzn0;
        dvzp dvzp0 = new dvzp(domv0);
        this.b = dvzp0;
        dvzs dvzs0 = new dvzs(doly0);
        this.c = dvzs0;
        dvzv dvzv0 = new dvzv(dvzs0);
        this.d = dvzv0;
        dvzm dvzm0 = new dvzm(dolg0);
        this.e = dvzm0;
        dmgj dmgj0 = new dmgj(dvzp0, dvzm0);
        this.f = dmgj0;
        dvzq dvzq0 = new dvzq(domv0);
        this.g = dvzq0;
        dsod dsod0 = new dsod(dvzp0);
        this.h = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.i = dspi0;
        Provider provider0 = DoubleCheck.b(new dsny(dvzp0, dvzv0, dvzm0, dmgj0, dvzq0, dspi0));
        this.j = provider0;
        dmkm dmkm0 = new dmkm(dvzp0);
        this.k = dmkm0;
        edoe edoe0 = new edoe(dvzp0);
        this.l = edoe0;
        edoc edoc0 = new edoc(dvzp0);
        this.m = edoc0;
        edod edod0 = new edod(dvzp0);
        this.n = edod0;
        edny edny0 = new edny(edoe0, edoc0, edod0);
        this.o = edny0;
        dvzo dvzo0 = new dvzo(edlf0);
        this.p = dvzo0;
        dvzr dvzr0 = new dvzr(edor0);
        this.q = dvzr0;
        dvzt dvzt0 = new dvzt(dxed0);
        this.r = dvzt0;
        edsf edsf0 = new edsf(dvzp0);
        this.s = edsf0;
        this.t = DoubleCheck.b(new dspq(dvzn0, dvzp0, provider0, dmkm0, edny0, dvzo0, dvzr0, dvzt0, edsf0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvzy dvzy0 = (dvzy)object0;
        dvzy0.a = this.u.e();
        this.v.a();
        dvzy0.b = new dvfw(new dmgk(dmgy.a()));
        dvzy0.c = (dspp)this.t.get();
        dvzy0.d = (dsnx)this.j.get();
        Account account0 = this.w.a();
        this.v.a();
        dvzy0.ag = new dvhg(account0, new dvfu(new dmgi(this.w.d(), dmgy.a()), new dmgm(dmgy.a())), this.x.a(), new bblp(0x7FFFFFFF, 9));
        dvzy0.ah = new dvhi(new dvgh(dmhh.b(this.v.a(), this.w.d(), this.w.c(), dmgy.a(), null, Optional.empty())), new bblp(0x7FFFFFFF, 9));
        dvzy0.ai = new bblp(0x7FFFFFFF, 9);
        fhwk fhwk0 = this.v.i();
        Preconditions.e(fhwk0);
        dvzy0.aj = fhwk0;
    }
}

