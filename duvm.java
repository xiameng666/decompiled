import dagger.android.AndroidInjector;
import dagger.internal.Provider;

final class duvm implements AndroidInjector {
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
    final Provider y;

    public duvm(dmgr dmgr0, doma doma0, dolg dolg0, domw domw0, domv domv0, dpsz dpsz0) {
        duvi duvi0 = new duvi(dolg0);
        this.a = duvi0;
        duvj duvj0 = new duvj(domv0);
        this.b = duvj0;
        duvh duvh0 = new duvh(dolg0);
        this.c = duvh0;
        duvg duvg0 = new duvg(dolg0);
        this.d = duvg0;
        dmgs dmgs0 = new dmgs(dmgr0);
        this.e = dmgs0;
        this.f = duvn.a;
        dmhh dmhh0 = new dmhh(duvj0, duvh0, duvg0, dmgs0, duvn.a);
        this.g = dmhh0;
        domd domd0 = new domd(doma0);
        this.h = domd0;
        dxeg dxeg0 = new dxeg(domd0);
        this.i = dxeg0;
        dmkm dmkm0 = new dmkm(duvj0);
        this.j = dmkm0;
        dtpr dtpr0 = new dtpr(duvi0, dmhh0, dxeg0, dmkm0);
        this.k = dtpr0;
        bapz bapz0 = new bapz(duvj0);
        this.l = bapz0;
        duvl duvl0 = new duvl(dpsz0);
        this.m = duvl0;
        dmgj dmgj0 = new dmgj(duvj0, duvh0);
        this.n = dmgj0;
        duvk duvk0 = new duvk();
        this.o = duvk0;
        duam duam0 = new duam(duvl0, dmgj0, duvk0);
        this.p = duam0;
        this.q = new edto();
        edtq edtq0 = new edtq(duvi0);
        this.r = edtq0;
        edtm edtm0 = new edtm(duvj0, edtq0);
        this.s = edtm0;
        edoe edoe0 = new edoe(duvj0);
        this.t = edoe0;
        edla edla0 = new edla(duvj0);
        this.u = edla0;
        edqh edqh0 = new edqh(domd0);
        this.v = edqh0;
        edlc edlc0 = new edlc(edqh0);
        this.w = edlc0;
        edkz edkz0 = new edkz(edla0, edlc0);
        this.x = edkz0;
        this.y = new duyc(dtpr0, bapz0, duvl0, duam0, edtm0, edoe0, edkz0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duwt duwt0 = (duwt)object0;
        duwt0.b = this.y;
        duwt0.c = new dtzg(dmgy.a(), edtn.a());
        duwt0.d = new dttm();
    }
}

