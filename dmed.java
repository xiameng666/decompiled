import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dmed implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    private final domv g;
    private final doly h;
    private final dolg i;

    public dmed(dolg dolg0, doly doly0, domv domv0, edor edor0) {
        this.g = domv0;
        this.h = doly0;
        this.i = dolg0;
        dmeb dmeb0 = new dmeb(domv0);
        this.a = dmeb0;
        edsf edsf0 = new edsf(dmeb0);
        this.b = edsf0;
        dmkm dmkm0 = new dmkm(dmeb0);
        this.c = dmkm0;
        dmec dmec0 = new dmec(edor0);
        this.d = dmec0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dmec0);
        this.e = edrn0;
        this.f = DoubleCheck.b(new edrj(edrn0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmel dmel0 = (dmel)object0;
        fhwk fhwk0 = this.g.i();
        Preconditions.e(fhwk0);
        dmel0.b = fhwk0;
        dmel0.c = efmh.b(this.h.c());
        this.g.a();
        dmel0.d = new dmdt(new dmgi(this.i.d(), dmgy.a()));
        dmel0.ag = (edrk)this.f.get();
    }
}

