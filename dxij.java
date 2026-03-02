import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dxij implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    private final doma g;
    private final dolg h;
    private final domv i;
    private final eefy j;

    public dxij(doma doma0, eefy eefy0, dolg dolg0, domv domv0) {
        this.g = doma0;
        this.h = dolg0;
        this.i = domv0;
        this.j = eefy0;
        dxii dxii0 = new dxii(domv0);
        this.a = dxii0;
        dmkm dmkm0 = new dmkm(dxii0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
    }

    final dmgi a() {
        this.i.a();
        return new dmgi(this.h.d(), dmgy.a());
    }

    final eeaw b() {
        return new eeaw(new azts(domd.b(this.g), null), this.h.d(), this.h.c(), this.h.e(), new etgl(domd.b(this.g)), new edse(this.i.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxlm dxlm0 = (dxlm)object0;
        dxlm0.c = new eeej(domf.a(this.g), this.b(), domd.b(this.g), ((edrp)this.d.get()), ((edsh)this.f.get()), this.a());
        dxlm0.d = this.a();
        dxlm0.ag = this.b();
        dxlm0.ah = fcfo.a(this.i.a());
        fhwk fhwk0 = this.i.i();
        Preconditions.e(fhwk0);
        dxlm0.ai = fhwk0;
        dxlm0.aj = this.i.j();
        dxlm0.ak = this.i.g();
        dxlm0.al = this.j.a;
        dxlm0.am = this.j.b;
    }
}

