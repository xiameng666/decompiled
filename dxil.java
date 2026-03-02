import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dxil implements AndroidInjector {
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
    private final doma l;
    private final dolg m;
    private final domv n;
    private final edor o;

    public dxil(doma doma0, dolg dolg0, edor edor0, domv domv0) {
        this.l = doma0;
        this.m = dolg0;
        this.n = domv0;
        this.o = edor0;
        dxik dxik0 = new dxik(domv0);
        this.a = dxik0;
        dmkm dmkm0 = new dmkm(dxik0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
        edqs edqs0 = new edqs(dmkm0);
        this.g = edqs0;
        Provider provider0 = DoubleCheck.b(new edru(edqs0));
        this.h = provider0;
        this.i = DoubleCheck.b(new edrt(provider0));
        edre edre0 = new edre(dmkm0);
        this.j = edre0;
        this.k = DoubleCheck.b(new edrf(edre0));
    }

    final dmgi a() {
        this.n.a();
        return new dmgi(this.m.d(), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxlt dxlt0 = (dxlt)object0;
        dxlt0.b = new eeej(domf.a(this.l), new eeaw(new azts(domd.b(this.l), null), this.m.d(), this.m.c(), this.m.e(), new etgl(domd.b(this.l)), new edse(this.n.a())), domd.b(this.l), ((edrp)this.d.get()), ((edsh)this.f.get()), this.a());
        dxlt0.c = this.a();
        dxlt0.d = new fuok();
        dxlt0.ag = this.o.a();
        dxlt0.ah = ((Boolean)this.i.get()).booleanValue();
        fhwk fhwk0 = this.n.i();
        Preconditions.e(fhwk0);
        dxlt0.ai = fhwk0;
        dxlt0.aj = (edrc)this.k.get();
    }
}

