import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dwdg implements AndroidInjector {
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
    private final dolg n;
    private final domv o;

    public dwdg(dolg dolg0, domv domv0) {
        this.n = dolg0;
        this.o = domv0;
        dwdc dwdc0 = new dwdc(dolg0);
        this.a = dwdc0;
        dwdd dwdd0 = new dwdd(domv0);
        this.b = dwdd0;
        dwdf dwdf0 = new dwdf(domv0);
        this.c = dwdf0;
        dwde dwde0 = new dwde(domv0);
        this.d = dwde0;
        dwdb dwdb0 = new dwdb(dolg0);
        this.e = dwdb0;
        this.f = dwdh.a;
        dmhh dmhh0 = new dmhh(dwdd0, dwdc0, dwdb0, dmgt.a, dwdh.a);
        this.g = dmhh0;
        dmkm dmkm0 = new dmkm(dwdd0);
        this.h = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.i = edrr0;
        Provider provider0 = DoubleCheck.b(new edrz(edrr0));
        this.j = provider0;
        dvga dvga0 = new dvga(provider0);
        this.k = dvga0;
        dvgr dvgr0 = new dvgr(dmhh0, dvga0, dmkm0);
        this.l = dvgr0;
        this.m = new dwhq(dwdc0, dwdd0, dwdf0, dwde0, dvgr0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwhd dwhd0 = (dwhd)object0;
        dwhd0.a = this.m;
        dwhd0.b = this.n.d();
        dwhd0.c = new dvlb(this.o.a());
        dwhd0.d = this.o.h();
        domj domj0 = this.o.b();
        Preconditions.e(domj0);
        dwhd0.ag = domj0;
        fhwk fhwk0 = this.o.i();
        Preconditions.e(fhwk0);
        dwhd0.ah = fhwk0;
        dwhd0.ai = new fuok();
    }
}

