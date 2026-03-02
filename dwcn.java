import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dwcn implements AndroidInjector {
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

    public dwcn(dolg dolg0, domw domw0, domv domv0) {
        this.u = domv0;
        dwci dwci0 = new dwci(domv0);
        this.a = dwci0;
        dwch dwch0 = new dwch(dolg0);
        this.b = dwch0;
        dwcl dwcl0 = new dwcl(domv0);
        this.c = dwcl0;
        dsiq dsiq0 = new dsiq(dwci0, dwch0, dwcl0);
        this.d = dsiq0;
        dsip dsip0 = new dsip(dsiq0);
        this.e = dsip0;
        dlnk dlnk0 = new dlnk(dwci0);
        this.f = dlnk0;
        dwcg dwcg0 = new dwcg(dolg0);
        this.g = dwcg0;
        dwcf dwcf0 = new dwcf(dolg0);
        this.h = dwcf0;
        dlnn dlnn0 = new dlnn(dlnk0, dwcg0, dwcf0);
        this.i = dlnn0;
        this.j = dwco.a;
        dmhh dmhh0 = new dmhh(dwci0, dwcg0, dwcf0, dmgt.a, dwco.a);
        this.k = dmhh0;
        dmkm dmkm0 = new dmkm(dwci0);
        this.l = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.m = edrr0;
        Provider provider0 = DoubleCheck.b(new edrz(edrr0));
        this.n = provider0;
        dvga dvga0 = new dvga(provider0);
        this.o = dvga0;
        dvgr dvgr0 = new dvgr(dmhh0, dvga0, dmkm0);
        this.p = dvgr0;
        dwcm dwcm0 = new dwcm(domv0);
        this.q = dwcm0;
        dwcj dwcj0 = new dwcj(domv0);
        this.r = dwcj0;
        this.s = new dwck();
        this.t = new dwfc(dwci0, dwch0, dsip0, dlnn0, dvgr0, dwcm0, dwcj0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwef dwef0 = (dwef)object0;
        dwef0.a = this.t;
        fhwk fhwk0 = this.u.i();
        Preconditions.e(fhwk0);
        dwef0.b = fhwk0;
        dwef0.c = this.u.j();
        dwef0.d = this.u.g();
        domj domj0 = this.u.b();
        Preconditions.e(domj0);
        dwef0.ag = domj0;
        dwef0.ah = new fuok();
    }
}

