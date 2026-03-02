import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dvzk implements AndroidInjector {
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
    private final domv u;
    private final doma v;

    public dvzk(doma doma0, dolg dolg0, edlf edlf0, domv domv0) {
        this.u = domv0;
        this.v = doma0;
        dvzg dvzg0 = new dvzg(dolg0);
        this.a = dvzg0;
        dvzi dvzi0 = new dvzi(domv0);
        this.b = dvzi0;
        domd domd0 = new domd(doma0);
        this.c = domd0;
        dvzl dvzl0 = new dvzl(domd0);
        this.d = dvzl0;
        dvzf dvzf0 = new dvzf(dolg0);
        this.e = dvzf0;
        dmgj dmgj0 = new dmgj(dvzi0, dvzf0);
        this.f = dmgj0;
        dvzj dvzj0 = new dvzj(domv0);
        this.g = dvzj0;
        dsod dsod0 = new dsod(dvzi0);
        this.h = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.i = dspi0;
        Provider provider0 = DoubleCheck.b(new dsny(dvzi0, dvzl0, dvzf0, dmgj0, dvzj0, dspi0));
        this.j = provider0;
        dmkm dmkm0 = new dmkm(dvzi0);
        this.k = dmkm0;
        edoe edoe0 = new edoe(dvzi0);
        this.l = edoe0;
        edoc edoc0 = new edoc(dvzi0);
        this.m = edoc0;
        edod edod0 = new edod(dvzi0);
        this.n = edod0;
        edny edny0 = new edny(edoe0, edoc0, edod0);
        this.o = edny0;
        dvzh dvzh0 = new dvzh(edlf0);
        this.p = dvzh0;
        edou edou0 = new edou(dvzi0);
        this.q = edou0;
        dxei dxei0 = new dxei(dvzi0);
        this.r = dxei0;
        edsf edsf0 = new edsf(dvzi0);
        this.s = edsf0;
        this.t = DoubleCheck.b(new dspq(dvzg0, dvzi0, provider0, dmkm0, edny0, dvzh0, edou0, dxei0, edsf0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvzx dvzx0 = (dvzx)object0;
        this.u.a();
        dvzx0.a = new dvfw(new dmgk(dmgy.a()));
        dvzx0.b = new dsiu(domf.a(this.v));
        dvzx0.c = (dspp)this.t.get();
        dvzx0.d = (dsnx)this.j.get();
        dvzx0.ag = new dspv();
        fhwk fhwk0 = this.u.i();
        Preconditions.e(fhwk0);
        dvzx0.ah = fhwk0;
    }
}

