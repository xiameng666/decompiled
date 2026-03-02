import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class ebev implements AndroidInjector {
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

    public ebev(dola dola0, dmgr dmgr0, domv domv0) {
        ebes ebes0 = new ebes(domv0);
        this.a = ebes0;
        edmi edmi0 = new edmi(ebes0);
        this.b = edmi0;
        this.c = new ebfa(edmi0);
        dolc dolc0 = new dolc(dola0);
        this.d = dolc0;
        ebet ebet0 = new ebet(domv0);
        this.e = ebet0;
        dsiq dsiq0 = new dsiq(ebes0, dolc0, ebet0);
        this.f = dsiq0;
        dsip dsip0 = new dsip(dsiq0);
        this.g = dsip0;
        this.h = new ebff(dsip0);
        dole dole0 = new dole(dola0);
        this.i = dole0;
        this.j = new ebfd(dole0);
        ebeu ebeu0 = new ebeu(domv0);
        this.k = ebeu0;
        dolf dolf0 = new dolf(dola0);
        this.l = dolf0;
        dmgj dmgj0 = new dmgj(ebes0, dolf0);
        this.m = dmgj0;
        dvlq dvlq0 = new dvlq(dolc0, ebeu0, dmgj0);
        this.n = dvlq0;
        dmkm dmkm0 = new dmkm(ebes0);
        this.o = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.p = edrr0;
        Provider provider0 = DoubleCheck.b(new edrz(edrr0));
        this.q = provider0;
        dvga dvga0 = new dvga(provider0);
        this.r = dvga0;
        dmgs dmgs0 = new dmgs(dmgr0);
        this.s = dmgs0;
        this.t = ebew.a;
        dmhh dmhh0 = new dmhh(ebes0, dolf0, dole0, dmgs0, ebew.a);
        this.u = dmhh0;
        this.v = new ebey(ebes0, dvlq0, dvga0, dmhh0, dmkm0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebfb ebfb0 = (ebfb)object0;
        ebfb0.a = DoubleCheck.a(this.c);
        ebfb0.b = DoubleCheck.a(this.h);
        ebfb0.c = DoubleCheck.a(this.j);
        ebfb0.d = DoubleCheck.a(this.v);
    }
}

