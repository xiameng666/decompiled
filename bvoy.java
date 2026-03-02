import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DelegateFactory;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory.Builder;
import dagger.internal.MapFactory;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;

final class bvoy implements AndroidInjector {
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
    private final bvok q;
    private final bvog r;

    public bvoy(bvok bvok0, bvog bvog0, bvxb bvxb0) {
        this.q = bvok0;
        this.r = bvog0;
        bvwz bvwz0 = new bvwz(bvok0.e, bvok0.al);
        this.a = bvwz0;
        DelegateFactory delegateFactory0 = new DelegateFactory();
        this.b = delegateFactory0;
        DelegateFactory delegateFactory1 = new DelegateFactory();
        this.c = delegateFactory1;
        Factory factory0 = InstanceFactory.a(bvxb0);
        this.d = factory0;
        bvxg bvxg0 = new bvxg(bwbi.a, bvwz0, delegateFactory0, bvok0.Y, bvok0.ao, bvog0.i, delegateFactory1, factory0, bvok0.Z);
        this.e = bvxg0;
        bwcm bwcm0 = new bwcm(bvok0.e);
        this.f = bwcm0;
        bwcb bwcb0 = new bwcb(bvok0.Y, bvok0.ao, bvok0.Z);
        this.g = bwcb0;
        bvyw bvyw0 = new bvyw(bvwz0, bvok0.Y, bwcm0, bvog0.f, bwcb0, bvzr.a, bvog0.i, delegateFactory1, factory0, bvok0.Z);
        this.h = bvyw0;
        bvye bvye0 = new bvye(bvwz0, bvok0.ad, bvog0.i, delegateFactory1, factory0, bvok0.Y, bvok0.Z);
        this.i = bvye0;
        bvyo bvyo0 = new bvyo(bvwz0, bvog0.f, factory0, bvog0.i, delegateFactory0, bvok0.Y, bvok0.ap, delegateFactory1, bvok0.ao, bvok0.Z);
        this.j = bvyo0;
        Provider provider0 = SingleCheck.a(bvvy.a);
        this.k = provider0;
        bwdj bwdj0 = new bwdj(provider0, bvwz0, bvok0.Z);
        this.l = bwdj0;
        bvxk bvxk0 = new bvxk(bvok0.Y, bvwz0, delegateFactory1, bvog0.i, factory0, bwdj0, bvok0.Z);
        this.m = bvxk0;
        bvxv bvxv0 = new bvxv(bvok0.Y, bvwz0, delegateFactory1, bvog0.i, factory0, bvok0.Z);
        this.n = bvxv0;
        MapFactory.Builder mapFactory$Builder0 = new MapFactory.Builder(6);
        mapFactory$Builder0.c(hgmp.e, bvxg0);
        mapFactory$Builder0.c(hgmp.c, bvyw0);
        mapFactory$Builder0.c(hgmp.d, bvye0);
        mapFactory$Builder0.c(hgmp.b, bvyo0);
        mapFactory$Builder0.c(hgmp.a, bvxk0);
        mapFactory$Builder0.c(hgmp.f, bvxv0);
        MapFactory mapFactory0 = mapFactory$Builder0.b();
        this.o = mapFactory0;
        DelegateFactory.a(delegateFactory1, new bvxq(mapFactory0));
        bwcu bwcu0 = new bwcu(bvog0.f, delegateFactory1);
        this.p = bwcu0;
        DelegateFactory.a(delegateFactory0, new bwbm(bvog0.i, bvog0.f, bvok0.am, bvwz0, bwcu0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        bvxb bvxb0 = (bvxb)object0;
        bvxb0.a = this.r.a();
        ggek ggek0 = ggeo.i(6);
        bvxf bvxf0 = new bvxf(this.a, this.b, this.q.Y, this.q.ao, this.r.i, this.c, this.d, this.q.Z);
        ggek0.i(hgmp.e, bvxf0);
        bvyv bvyv0 = new bvyv(this.a, this.q.Y, this.f, this.r.f, this.g, this.r.i, this.c, this.d, this.q.Z);
        ggek0.i(hgmp.c, bvyv0);
        bvyd bvyd0 = new bvyd(this.a, this.q.ad, this.r.i, this.c, this.d, this.q.Y, this.q.Z);
        ggek0.i(hgmp.d, bvyd0);
        bvyn bvyn0 = new bvyn(this.a, this.r.f, this.d, this.r.i, this.b, this.q.Y, this.q.ap, this.c, this.q.ao, this.q.Z);
        ggek0.i(hgmp.b, bvyn0);
        bvxj bvxj0 = new bvxj(this.q.Y, this.a, this.c, this.r.i, this.d, this.l, this.q.Z);
        ggek0.i(hgmp.a, bvxj0);
        bvxu bvxu0 = new bvxu(this.q.Y, this.a, this.c, this.r.i, this.d, this.q.Z);
        ggek0.i(hgmp.f, bvxu0);
        bvxb0.b = new bvxp(ggek0.b());
        bvxb0.c = (fhwo)this.q.Y.get();
        bvxb0.d = new bvwy(((Context)this.q.e.get()), ((String)this.q.al.get()));
        bvxb0.ag = new bvws(((Context)this.q.e.get()), ((bvqc)this.q.aq.get()), this.r.a);
    }
}

