import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MapFactory;
import dagger.internal.MapProviderFactory.Builder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Provider;
import dagger.internal.SetFactory.Builder;
import dagger.internal.SetFactory;
import dagger.internal.SingleCheck;

final class dxff implements AndroidInjector {
    final Provider A;
    final Provider B;
    final Provider C;
    final Provider D;
    final Provider E;
    final Provider F;
    final Provider G;
    final Provider H;
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
    final Provider z;

    public dxff() {
        Provider provider0 = SingleCheck.a(fgvv.a);
        this.a = provider0;
        this.b = DoubleCheck.b(cjsr.a);
        Provider provider1 = DoubleCheck.b(doty.a);
        this.c = provider1;
        this.d = dxfg.a;
        fhwr fhwr0 = new fhwr(dxfg.a);
        this.e = fhwr0;
        SetFactory.Builder setFactory$Builder0 = new SetFactory.Builder(1, 0);
        setFactory$Builder0.c(fhwr0);
        SetFactory setFactory0 = setFactory$Builder0.a();
        this.f = setFactory0;
        this.g = dxfg.a;
        fhuu fhuu0 = new fhuu(provider1, setFactory0, dxfg.a);
        this.h = fhuu0;
        dotr dotr0 = new dotr(dlni.a);
        this.i = dotr0;
        Provider provider2 = SingleCheck.a(new fiab(dotr0, MapFactory.b));
        this.j = provider2;
        this.k = dxfg.a;
        this.l = dxfg.a;
        fhvi fhvi0 = new fhvi(dxfg.a, dxfg.a);
        this.m = fhvi0;
        Provider provider3 = DoubleCheck.b(new fhvg(dlni.a, fhvi0, provider1));
        this.n = provider3;
        MapProviderFactory.Builder mapProviderFactory$Builder0 = new MapProviderFactory.Builder(6);
        mapProviderFactory$Builder0.c(Integer.valueOf(200000077), dotu.a);
        mapProviderFactory$Builder0.c(Integer.valueOf(200000013), fiax.a);
        mapProviderFactory$Builder0.c(Integer.valueOf(200000017), fiat.a);
        mapProviderFactory$Builder0.c(Integer.valueOf(200000028), fiar.a);
        mapProviderFactory$Builder0.c(Integer.valueOf(200000043), fiaz.a);
        mapProviderFactory$Builder0.c(Integer.valueOf(200000076), fiap.a);
        MapProviderFactory mapProviderFactory0 = mapProviderFactory$Builder0.b();
        this.o = mapProviderFactory0;
        Provider provider4 = SingleCheck.a(new fiao(mapProviderFactory0));
        this.p = provider4;
        fiav fiav0 = new fiav(provider4);
        this.q = fiav0;
        this.r = dxfg.a;
        fhzz fhzz0 = new fhzz(provider2, provider3, fiav0, dxfg.a);
        this.s = fhzz0;
        this.t = dxfg.a;
        this.u = dxfg.a;
        Provider provider5 = SingleCheck.a(new fhuc(provider0, dxfg.a));
        this.v = provider5;
        Provider provider6 = DoubleCheck.b(doua.a);
        this.w = provider6;
        fibv fibv0 = new fibv(SetFactory.a);
        this.x = fibv0;
        Provider provider7 = DoubleCheck.b(new fici(provider0, provider5, provider6, fibv0));
        this.y = provider7;
        ficd ficd0 = new ficd(provider7, provider1);
        this.z = ficd0;
        MapProviderFactory.Builder mapProviderFactory$Builder1 = new MapProviderFactory.Builder(3);
        mapProviderFactory$Builder1.c(Integer.valueOf(100000038), dots.a);
        mapProviderFactory$Builder1.c(Integer.valueOf(100000016), dotw.a);
        mapProviderFactory$Builder1.c(Integer.valueOf(100000019), ficd0);
        MapProviderFactory mapProviderFactory1 = mapProviderFactory$Builder1.b();
        this.A = mapProviderFactory1;
        Provider provider8 = SingleCheck.a(new fian(mapProviderFactory1));
        this.B = provider8;
        Provider provider9 = SingleCheck.a(new fibb(MapFactory.b));
        this.C = provider9;
        fiaw fiaw0 = new fiaw(provider4, provider8, provider9);
        this.D = fiaw0;
        fiaa fiaa0 = new fiaa(provider2, provider3, dxfg.a, fiaw0, dxfg.a);
        this.E = fiaa0;
        SetFactory.Builder setFactory$Builder1 = new SetFactory.Builder(2, 0);
        setFactory$Builder1.c(fhzz0);
        setFactory$Builder1.c(fiaa0);
        SetFactory setFactory1 = setFactory$Builder1.a();
        this.F = setFactory1;
        SetFactory.Builder setFactory$Builder2 = new SetFactory.Builder(1, 0);
        setFactory$Builder2.c(fibs.a);
        SetFactory setFactory2 = setFactory$Builder2.a();
        this.G = setFactory2;
        this.H = DoubleCheck.b(new fhuv(fhuu0, provider1, setFactory1, setFactory2, provider0));
    }

    final fhwb a() {
        return new fhwb(((fhup)this.H.get()), ((fhua)this.v.get()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxfi dxfi0 = (dxfi)object0;
        dxfi0.a = donc.a();
        dxfi0.b = new dxfz(dxga.a(dlnj.a()), ((fgvt)this.a.get()), new dyaj(dlnj.a(), ((frii)this.b.get())), this.a());
        dxfi0.d = new edtc();
        dxfi0.c = this.a();
    }
}

