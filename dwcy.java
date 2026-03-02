import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dwcy implements AndroidInjector {
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
    final Provider u;
    final Provider v;
    final Provider w;
    final Provider x;
    private final domv y;

    public dwcy(dmgr dmgr0, dolg dolg0, domv domv0, dpqp dpqp0) {
        this.y = domv0;
        dwcr dwcr0 = new dwcr(dolg0);
        this.a = dwcr0;
        dwct dwct0 = new dwct(domv0);
        this.b = dwct0;
        dwcs dwcs0 = new dwcs(dolg0);
        this.c = dwcs0;
        dwcw dwcw0 = new dwcw(domv0);
        this.d = dwcw0;
        dmgj dmgj0 = new dmgj(dwct0, dwcr0);
        this.e = dmgj0;
        dvlq dvlq0 = new dvlq(dwcs0, dwcw0, dmgj0);
        this.f = dvlq0;
        dvlc dvlc0 = new dvlc(dwct0);
        this.g = dvlc0;
        dwcq dwcq0 = new dwcq(dolg0);
        this.h = dwcq0;
        dmgs dmgs0 = new dmgs(dmgr0);
        this.i = dmgs0;
        this.j = dwcz.a;
        dmhh dmhh0 = new dmhh(dwct0, dwcr0, dwcq0, dmgs0, dwcz.a);
        this.k = dmhh0;
        dmkm dmkm0 = new dmkm(dwct0);
        this.l = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.m = edrr0;
        Provider provider0 = DoubleCheck.b(new edrz(edrr0));
        this.n = provider0;
        dvga dvga0 = new dvga(provider0);
        this.o = dvga0;
        dvgr dvgr0 = new dvgr(dmhh0, dvga0, dmkm0);
        this.p = dvgr0;
        dwcu dwcu0 = new dwcu(domv0);
        this.q = dwcu0;
        this.r = new dwre();
        dxdm dxdm0 = new dxdm(dwct0);
        this.s = dxdm0;
        dwcv dwcv0 = new dwcv(dpqp0);
        this.t = dwcv0;
        dwcx dwcx0 = new dwcx(dpqp0);
        this.u = dwcx0;
        dvlw dvlw0 = new dvlw(dwct0);
        this.v = dvlw0;
        dwad dwad0 = new dwad(dwct0, dwcv0, dwcx0, dvlw0);
        this.w = dwad0;
        this.x = new dwgp(dwcr0, dwct0, dvlq0, dmgj0, dvlc0, dwcw0, dvgr0, dwcu0, dxdm0, dwad0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwfy dwfy0 = (dwfy)object0;
        fhwk fhwk0 = this.y.i();
        Preconditions.e(fhwk0);
        dwfy0.a = fhwk0;
        domj domj0 = this.y.b();
        Preconditions.e(domj0);
        dwfy0.b = domj0;
        dwfy0.c = new fuok();
        dwfy0.d = this.x;
    }
}

