import dagger.android.AndroidInjector;
import dagger.internal.Provider;

final class dush implements AndroidInjector {
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

    public dush(dmgr dmgr0, doma doma0, dolg dolg0, domv domv0) {
        dusf dusf0 = new dusf(dolg0);
        this.a = dusf0;
        dusg dusg0 = new dusg(domv0);
        this.b = dusg0;
        duse duse0 = new duse(dolg0);
        this.c = duse0;
        dusd dusd0 = new dusd(dolg0);
        this.d = dusd0;
        dmgs dmgs0 = new dmgs(dmgr0);
        this.e = dmgs0;
        this.f = dusi.a;
        dmhh dmhh0 = new dmhh(dusg0, duse0, dusd0, dmgs0, dusi.a);
        this.g = dmhh0;
        domd domd0 = new domd(doma0);
        this.h = domd0;
        dxeg dxeg0 = new dxeg(domd0);
        this.i = dxeg0;
        dmkm dmkm0 = new dmkm(dusg0);
        this.j = dmkm0;
        dtpr dtpr0 = new dtpr(dusf0, dmhh0, dxeg0, dmkm0);
        this.k = dtpr0;
        this.l = new duuy(dtpr0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((dusw)object0).b = this.l;
    }
}

