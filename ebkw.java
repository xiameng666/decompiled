import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class ebkw implements AndroidInjector {
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
    private final domv k;
    private final dola l;

    public ebkw(dola dola0, domv domv0) {
        this.k = domv0;
        this.l = dola0;
        ebkv ebkv0 = new ebkv(domv0);
        this.a = ebkv0;
        dxei dxei0 = new dxei(ebkv0);
        this.b = dxei0;
        dolc dolc0 = new dolc(dola0);
        this.c = dolc0;
        this.d = new dzae(dxei0, dolc0);
        this.e = new dzac(dxei0, dolc0);
        this.f = new dzab(dxei0, dolc0);
        this.g = new dzaf(dxei0, dolc0);
        this.h = new dyzz(dxei0, dolc0);
        this.i = new dzad(dxei0, dolc0);
        this.j = new dzaa(dxei0, dolc0, ebkv0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebtm ebtm0 = (ebtm)object0;
        ebtm0.g = dycu.a;
        ebtm0.s = dxei.b(this.k.a());
        ebtm0.h = this.k.h();
        ebtm0.i = donc.a();
        ebtm0.j = dond.a();
        gmcg gmcg0 = this.k.p();
        Preconditions.e(gmcg0);
        ebtm0.k = gmcg0;
        ebtm0.l = dolc.b(this.l);
        ebtm0.m = new dzap(null);
        ebtm0.n = bbnk.a;
        ebtm0.r = new dyzq(this.k.a());
        ebtm0.o = dmgy.a();
        ggek ggek0 = ggeo.i(7);
        ggek0.i(dyna.e, this.d);
        ggek0.i(dyna.h, this.e);
        ggek0.i(dyna.c, this.f);
        ggek0.i(dyna.d, this.g);
        ggek0.i(dyna.b, this.h);
        ggek0.i(dyna.g, this.i);
        ggek0.i(dyna.f, this.j);
        ebtm0.p = ggek0.b();
    }
}

